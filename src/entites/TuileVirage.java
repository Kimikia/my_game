package entites;

import constants.Constants;

public class TuileVirage extends Tuile {

    private boolean estLeger;

    public TuileVirage(int pen, char lettre, boolean estLeger) {
        super(pen, Constants.NOMBRE_CASES_VIRAGE, lettre);

        if (lettre == 'a' || lettre == 'u') {
            throw new IllegalArgumentException("les lettres 'a' et 'u' sont reservée pour la tuile depart et la tuile arrivé");
        }

        this.estLeger = estLeger;
    }

    public boolean estLeger() {
        return estLeger;
    }

    public boolean estSeree() {
        return !estLeger;
    }


}