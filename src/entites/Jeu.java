package entites;

import constants.Constants;
import constants.Utilitaires;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jeu {

    private List<Joueur> listeJoueur;
    private List<CarteFatigue> paquetFatigueSprinteur;
    private List<CarteFatigue> paquetFatigueRouleur;
    private String phaseDeJeu;
    private Circuit circuit;

    public Jeu(List<Joueur> listeJoueur, Circuit circuit) {
        if (listeJoueur.size() > 4 || listeJoueur.size() < 2) {
            throw new IllegalArgumentException("Le nombre de joueurs doit etre compris entre 2 et 4");
        } else {
            this.listeJoueur = listeJoueur;
        }
        this.circuit = circuit;
        this.paquetFatigueRouleur = Utilitaires.creerPaquetFatigues();
        this.paquetFatigueSprinteur = Utilitaires.creerPaquetFatigues();
        this.phaseDeJeu = Constants.PHASE_D_ENERGIE;
    }


    /**
     * demarrer le jeu
     */
    public void demarrerJeu() {
        positionDepart ();
        debutPhaseEnergie();
    }

    public void positionDepart (){
        for (int i =0 ; i<listeJoueur.size();i++){
            listeJoueur.get(i).getRouleur().setPositionActuelle(i+1);
            listeJoueur.get(i).getSprinter().setPositionActuelle(listeJoueur.size()-i);
        }
        }
    /**
     * verifier si le jeu est fini ou pas
     * @return vrai so le jeu est fini
     */
    public boolean estFini() {
        int dernierePosition = circuit.positionDerniereCase();
        for (int i = 0; i < listeJoueur.size(); i++) {
            Joueur joueur = listeJoueur.get(i);
            int positionSprinteur = joueur.getSprinter().getPositionActuelle();
            int positionRouleur = joueur.getRouleur().getPositionActuelle();
            if (positionSprinteur >= dernierePosition || positionRouleur >= dernierePosition) {
                System.out.println("Find de jeu ");
                return true;
            }
        }

        return false;
    }

    /**
     * trier les cyclistes par rapport a leur position
     * @return liste de cyclistes trier par rapport a leur position
     */
    private List<Cycliste> listeCyclisteTrierParPosition() {
        List<Cycliste> listCycliste = new ArrayList<>();

        for (int i = 0; i < listeJoueur.size(); i++) {
            listCycliste.add(listeJoueur.get(i).getRouleur());
            listCycliste.add(listeJoueur.get(i).getSprinter());
        }

        //croissant
        Collections.sort(listCycliste);

        return listCycliste;
    }

    /**
     * retourner le cycliste du joueur en tete
     * @return cycliste en tete
     */
    private Cycliste retourneCyclisteEnTete() {
        List<Cycliste> listeCyclistesTrier = listeCyclisteTrierParPosition();
        Cycliste enTete = listeCyclistesTrier.get(listeCyclistesTrier.size() - 1);
        return enTete;
    }

    /**
     * appliquer la fatigue sur le cycliste  en tete
     */
    private void appliquerFatigue() {
        System.out.println("==> appliquer fatigue sur le cycliste en tete  ");

        Cycliste cycliste = retourneCyclisteEnTete();

        CarteFatigue carteFatigue;
        //piocher une carte
        if (cycliste instanceof Rouleur) {
            carteFatigue = paquetFatigueRouleur.get(0);
            paquetFatigueRouleur.remove(0);
        } else {
            carteFatigue = paquetFatigueSprinteur.get(0);
            paquetFatigueSprinteur.remove(0);
        }

        cycliste.appliquerFatigue(carteFatigue);
    }

    /**
     * appliquer l aspiration sur le cycliste placer a moins d une case de l autre cycliste
     */
    private void appliquerAspiration() {


        List<Cycliste> listeCyclistesTrier = listeCyclisteTrierParPosition();
        //parcours tableau jusqu'a l'avant dernier element
        for (int i = 0; i < listeCyclistesTrier.size() - 1; i++) {
            int pos1 = listeCyclistesTrier.get(i).getPositionActuelle();
            int pos2 = listeCyclistesTrier.get(i + 1).getPositionActuelle();
            if (pos2 - pos1 == 2) {
                listeCyclistesTrier.get(i).appliquerAspiration();
                System.out.println("==> appliquer aspiration");
            }
        }

    }

    /**
     * avancer les cyclistes
     */
    private void avancerCyclistes() {
        System.out.println("==> avancerJoueurs");
        List<Cycliste> cyclisteList = listeCyclisteTrierParPosition();
        for (int i = listeCyclisteTrierParPosition().size()-1; i>=0; i--) {
            Cycliste cycliste = listeCyclisteTrierParPosition().get(i);
            cycliste.avancer(cyclisteList,circuit);


        }
    }

    /**
     * piocher les cartes par le joueur
     */
    private void piocherCartes() {
        //chaque joueur doit piocher
        for (int i = 0; i < listeJoueur.size(); i++) {
            Joueur joueur = listeJoueur.get(i);
            System.out.println("au tour de " + joueur.getNomJoueur() + " de piocher");
            joueur.piocher();
        }
    }

    /**
     * permet de passr a la phase suivante
     */
    private void passerPhaseSuivante() {
        switch (phaseDeJeu) {
            case Constants.PHASE_D_ENERGIE:
                debutPhaseMouvement();
                break;
            case Constants.PHASE_DE_MOUVEMENT:
                debutPhaseFinale();
                break;
            case Constants.PHASE_FINALE:
                debutPhaseEnergie();
                break;
            default:
                debutPhaseEnergie();
        }
    }

    /**
     * commencer la phase energie
     */
    private void debutPhaseEnergie() {
        System.out.println("============================ Phase Energie ============================");
        // changer la phase actuelle
        phaseDeJeu = Constants.PHASE_D_ENERGIE;

        // appeler les methodes de cette phase
        piocherCartes();

        //passer a la phase suivante
        passerPhaseSuivante();
    }

    /***
     * commencer la phase mouvement
     */
    private void debutPhaseMouvement() {
        System.out.println("============================ Phase Mouvement ============================");
        // changer la phase actuelle
        phaseDeJeu = Constants.PHASE_DE_MOUVEMENT;

        // appeler les methodes de cette phase
        avancerCyclistes();

        //passer a la phase suivante
        passerPhaseSuivante();
    }

    /**
     * commencer la phase finale
     */
    private void debutPhaseFinale() {
        System.out.println("============================  Phase Finale ============================");
        //checker si le jeu est fini >> afficher jeu fini
        if (estFini()) {
            System.out.println("La partie est termine");
            afficherPositionCyclistes();

        } else {
            //sinon changer la phase actuelle
            phaseDeJeu = Constants.PHASE_FINALE;

            // appeler les methodes de cette phase
            appliquerFatigue();
            appliquerAspiration();
            afficherPositionCyclistes();

            //checker si le jeu est fini >> afficher jeu fini
            if (estFini()) {
                System.out.println("La partie est termine");
            } else {
                passerPhaseSuivante();
            }
        }

        //afficher les position des cycliste

    }

    /**
     * afficher la position du cycliste
     */
    private void afficherPositionCyclistes() {
        //print la position de chaque cycliste
        /* SOUS LA FORME
        "la position du sprinter de " + nomJoueur + " est : "  +  positionActuelle
        "la position du rouleur de " + nomJoueur + " est : "  +  positionActuelle
         */
        for (int i = 0; i < listeJoueur.size(); i++) {
            Joueur joueur = listeJoueur.get(i);
            System.out.println("La position du Sprinteur du joueur " + joueur.getNomJoueur() + " est " + joueur.getSprinter().getPositionActuelle());
            System.out.println("La position du Rouleur du joueur " + joueur.getNomJoueur() + " est " + joueur.getRouleur().getPositionActuelle());
        }
    }


    /*
    METHODES Getters
     */
    public List<Joueur> getListeJoueur() {
        return listeJoueur;
    }

    public List<CarteFatigue> getPaquetFatigueSprinteur() {
        return paquetFatigueSprinteur;
    }

    public List<CarteFatigue> getPaquetFatigueRouleur() {
        return paquetFatigueRouleur;
    }

    public String getPhaseDeJeu() {
        return phaseDeJeu;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    /*
     methodes SETTERS
     */
    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public void setListeJoueur(List<Joueur> listeJoueur) {
        this.listeJoueur = listeJoueur;
    }

    public void setPaquetFatigueSprinteur(List<CarteFatigue> paquetFatigueSprinteur) {
        this.paquetFatigueSprinteur = paquetFatigueSprinteur;
    }

    public void setPaquetFatigueRouleur(List<CarteFatigue> paquetFatigueRouleur) {
        this.paquetFatigueRouleur = paquetFatigueRouleur;
    }

    public void setPhaseDeJeu(String phaseDeJeu) {
        this.phaseDeJeu = phaseDeJeu;
    }


}
