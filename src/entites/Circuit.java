package entites;

import java.util.List;

public class Circuit {

    private List<Tuile> listTuiles;
    private String nomCircuit;


    public Circuit(List<Tuile> listTuiles, String nomCircuit) {
        this.listTuiles = listTuiles;
        this.nomCircuit = nomCircuit;
    }

    public List<Tuile> getListTuiles() {
        return listTuiles;
    }

    public void setListTuiles(List<Tuile> listTuiles) {
        this.listTuiles = listTuiles;
    }

    public String getNomCircuit() {
        return nomCircuit;
    }

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
                /* 2eme methode
                  Tuile t = null;
            for (Tuile tuile : listTuiles) {
                int nbTuile = tuile.nombreDeCases;
                sommeNombreDecaseTuile += nbTuile;
                if (sommeNombreDecaseTuile >= position) {
                    t = tuile;
                    break;
                }
            }

            return t;
            */

            int i = 0;
            while (sommeNombreDecaseTuile < position) {
                int nbTuile = listTuiles.get(i).nombreDeCases;
                sommeNombreDecaseTuile += nbTuile;
                i++;
            }
            return listTuiles.get(i - 1);
        }
    }

    public boolean positionEnMontee(int position) {
        Tuile tuile = tuileAlaPosition(position);
        return tuile.estMontee();
    }

    public boolean positionEnDescente(int position) {
        Tuile tuile = tuileAlaPosition(position);
        return tuile.estDescente();
    }

    public boolean positionEnVoieNormale(int position) {
        Tuile tuile = tuileAlaPosition(position);
        return tuile.estLigneDroite();
    }

    public int positionDerniereCase() {
        int somme = 0;
        for (int i = 0; i < listTuiles.size(); i++) {
            int nbTuile = listTuiles.get(i).nombreDeCases;
            somme += nbTuile;
        }
        return somme;
    }


}
