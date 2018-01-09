package entites;

import java.util.List;

public class Circuit {

    private List<Tuile> listTuiles;
    private String nomCircuit;


    public Circuit(List<Tuile> listTuiles, String nomCircuit) {
        this.listTuiles = listTuiles;
        this.nomCircuit = nomCircuit;
    }

    /**
     *
     * @param nomCircuit attribuee au circuit
     */
    public void setNomCircuit(String nomCircuit) {
        this.nomCircuit = nomCircuit;
    }

    /**
     * @param position position dans le circuit
     * @return la tuile correspendante
     */
    private Tuile tuileAlaPosition(int position) {
        if (position < 0 || position >= positionDerniereCase()) {
            throw new IllegalArgumentException("la position: '" + position + "' ne peut pas " +
                    "etre negative ou superieur a la position de la derniereCase : " + positionDerniereCase());
        } else if (position == 0) {
            return listTuiles.get(0);
        } else {
            int sommeNombreDecaseTuile = 0;
            int i = 0;
            while (sommeNombreDecaseTuile < position) {
                int nbTuile = listTuiles.get(i).nombreDeCases;
                sommeNombreDecaseTuile += nbTuile;
                i++;
            }
            return listTuiles.get(i - 1);
        }
    }

    /**
     * determiner si la position est dans une monte
     * @param position  a verifier
     * @return boolean si la position est en montee ou pas
     */
    public boolean positionEnMontee(int position) {
        Tuile tuile = tuileAlaPosition(position);
        return tuile.estMontee();
    }

    /**
     *  determine si la position est dans une descente
     * @param position a verifier
     * @return boolean si la position est en montee ou pas
     */
    public boolean positionEnDescente(int position) {
        Tuile tuile = tuileAlaPosition(position);
        return tuile.estDescente();
    }

    /**
     * determine si la position est en voie normale
     * @param position a verifier
     * @return boolean si la position est en ligne droite
     */
    public boolean positionEnVoieNormale(int position) {
        Tuile tuile = tuileAlaPosition(position);
        return tuile.estLigneDroite();
    }

    /**
     *
     * @return la position de la dernier case
     */
    public int positionDerniereCase() {
        int somme = 0;
        for (int i = 0; i < listTuiles.size(); i++) {
            int nbTuile = listTuiles.get(i).nombreDeCases;
            somme += nbTuile;
        }
        return somme;
    }


}
