package entites;

import constants.Constants;

public class TuileLigneDroite extends Tuile {


    public TuileLigneDroite(int pen, int nbrCases, char lettre) {
        super(pen, nbrCases, lettre);
    }

    public boolean estLigneDepart() {
        return nomTuile == Constants.LETTRE_TUILE_DEPART;
    }

    public boolean estLigneArrive() {
        return nomTuile == Constants.LETTRE_TUILE_ARRIVE;

    }

    public boolean estLigneNormale() {
        if (!estLigneDepart() && !estLigneArrive()) {
            return true;
        } else {
            return false;
        }
    }

}
