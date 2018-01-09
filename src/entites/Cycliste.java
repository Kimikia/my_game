package entites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class Cycliste implements Comparable<Cycliste> {

    private List<Carte> listeCartesFaceCache;
    private List<Carte> listeCartesDefaucees;
    private Carte carteChoisie;
    private int positionActuelle;
    private boolean fileDroite;

    public Cycliste(List<Carte> listeCartes) {
        this.listeCartesFaceCache = listeCartes;
        this.listeCartesDefaucees = new ArrayList<>();
    }

    /**
     *
     * METHODES GETTERS
     */
    public int getPositionActuelle() {
        return positionActuelle;
    }
    public List<Carte> getListeCartesFaceCache() {
        return listeCartesFaceCache;
    }
    public List<Carte> getListeCartesDefaucees() {
        return listeCartesDefaucees;
    }

    /**
     *
     * methodes setters
     */
    public void setPositionActuelle(int positionActuelle) {
        this.positionActuelle = positionActuelle;
    }
    public void setListeCartesFaceCache(List<Carte> listeCartesFaceCache) {
        this.listeCartesFaceCache = listeCartesFaceCache;
    }
    public void setListeCartesDefaucees(List<Carte> listeCartesDefaucees) {
        this.listeCartesDefaucees = listeCartesDefaucees;
    }

    /**
     * verifiee si on a des carte face cachee sinon melanger la defausse
     *
     * @return les 4 les 4 premiere cartes
     */
    private List<Carte> piocher4Cartes() {
        if (listeCartesFaceCache.size() == 0) {
            melangerLaDefauce();
        }

        List<Carte> list = new ArrayList<>();
        //l'utilistaeur pioche 4 cartes MAX ( si dispo ) et retourne une liste

        if (listeCartesFaceCache.size() > 4) {
            for (int i = 0; i < 4; i++) {
                //get la carte
                Carte c = listeCartesFaceCache.get(i);
                //ajouter la carte dans une liste
                list.add(c);
            }
        } else {
            list.addAll(listeCartesFaceCache);
        }

        //supprimer les 4 cartes piochees de la liste a piocher
        listeCartesFaceCache.removeAll(list);

        //ajouter les 4 cartes piochees dans la liste des cartes a retourner
        listeCartesDefaucees.addAll(list);

        return list;
    }

    /**
     * choisir carte depuis les 4 cartes piochee
     */
    public void choisirCarte() {
        System.out.println(" Choisir la carte pour le " + getTypeCycliste());
        List<Carte> carteList = piocher4Cartes();

        if (carteList.size() == 0) {
            System.out.println("Vos cartes sont epuisé vous ne pouvez plus avancer");
        } else {
            //print les numeros de toutes les cartes
            for (int i = 0; i < carteList.size(); i++) {
                Carte c = carteList.get(i);
                System.out.println((i + 1) + "- numero " + c.numero);
            }

            System.out.println("Veuillez saisir le classement de la carte que vous voulez choisir entre 1 et " + carteList.size());
            Scanner sc = new Scanner(System.in);
            int classement = sc.nextInt();

            while (classement < 1 || classement > carteList.size()) {
                System.out.println("Le classement est compris entre 1 et " + carteList.size());
                System.out.println("veuillez resaisir le classement de votre carte choisis ");
                classement = sc.nextInt();
            }

            // stocker la carte choisie
            carteChoisie = carteList.get(classement - 1);

            // supprimer la carte de la liste
            this.listeCartesDefaucees.remove(carteChoisie);
        }

    }

    /**
     * le cycliste va avancer depuis sa position actuelle du numero que la carte chosiie porte s'elle est libre
     *
     * @param cyclisteList liste de cycistes sur le circuit
     */
    public void avancer(List<Cycliste> cyclisteList, Circuit circuit) {
        int nouvellePositionTuile = calculerNouvellePositionParRapportaLaTuile(circuit);
        int nouvellePositionCyclistee = calculerNouvellePositionParRapportAuCyclistes(nouvellePositionTuile, cyclisteList);
        this.positionActuelle = nouvellePositionCyclistee;
    }


    /**
     * ajouter une carte fatigue dans liste retournee
     * @param carteFatigue dont le numero est 2
     */
    public void appliquerFatigue(CarteFatigue carteFatigue) {

        listeCartesDefaucees.add(carteFatigue);
    }

    /**
     * avancer d'une case si aspiration
     */
    public void appliquerAspiration() {

        this.positionActuelle++;
    }

    /**
     *  melanger les cartes face cachee
     */
    private void melangerLaDefauce() {
        System.out.println("entrain de melanger la defauce");
        //  ajouter les cartes defausse dans les cartes facecache
        listeCartesFaceCache.addAll(listeCartesDefaucees);

        //supprimer les cartes defausse
        listeCartesDefaucees.clear();

        //sort les cartes face cache
        Collections.shuffle(listeCartesFaceCache);
    }



    public int compareTo(Cycliste cycliste) {
        return Integer.compare(this.positionActuelle, cycliste.positionActuelle);
    }

    /**
     * calculer la nouvelle position par rapport  a La Tuile
     * @param circuit choisis par le joueuer
     * @return la nouvelle position
     */
    private int calculerNouvellePositionParRapportaLaTuile(Circuit circuit) {
        int nouvellePosition = positionActuelle + carteChoisie.numero;

        //si la position actuelle ou la nouvelle position est dans une montée l'avancé maximal est de 5
        if (circuit.positionEnMontee(positionActuelle) ||
                (nouvellePosition <= circuit.positionDerniereCase() && circuit.positionEnMontee(nouvellePosition))) {
            if (carteChoisie.numero > 5) {
                nouvellePosition = positionActuelle + 5;
            }
        } else if (circuit.positionEnDescente(positionActuelle)) {
            if (carteChoisie.numero < 5) {
                nouvellePosition = positionActuelle + 5;
            }
        }

        return nouvellePosition;
    }

    /**
     * @param cyclisteList liste de cycliste
     * @return la nouvelle position du cycliste
     */
    public int calculerNouvellePositionParRapportAuCyclistes(int nouvellePosition, List<Cycliste> cyclisteList) {
        while (!estLibre(nouvellePosition, cyclisteList) || nouvellePosition == positionActuelle) {
            nouvellePosition--;
        }
        return nouvellePosition;
    }

    /**
     * determiner si une position ets libe
     * @param position a verifier
     * @param cyclisteList cycliste qui peut l'occupe
     * @return boolean vrai si elle est libre
     */
    private boolean estLibre(int position, List<Cycliste> cyclisteList) {
        for (Cycliste c : cyclisteList) {
            if (position == c.getPositionActuelle()) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return la classe du cycliste
     */
    protected abstract String getTypeCycliste();
}
