package constants;

import entites.Tuile;
import entites.TuileLigneDroite;
import entites.TuileVirage;

/**
 * les tuiles definies 
 */
public class TuilesDefinies {

    public static final Tuile depart = new TuileLigneDroite(Constants.TUILE_NORMALE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'a');
    public static final Tuile b = new TuileLigneDroite(Constants.TUILE_MONTAGNE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'b');
    public static final Tuile c = new TuileLigneDroite(Constants.TUILE_NORMALE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'c');
    public static final Tuile d = new TuileLigneDroite(Constants.TUILE_NORMALE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'd');
    public static final Tuile e = new TuileVirage(Constants.TUILE_DESCENTE, 'e', false);
    public static final Tuile f = new TuileLigneDroite(Constants.TUILE_MONTAGNE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'f');
    public static final Tuile g = new TuileVirage(Constants.TUILE_DESCENTE, 'g', false);
    public static final Tuile h = new TuileVirage(Constants.TUILE_MONTAGNE, 'h', true);
    public static final Tuile i = new TuileVirage(Constants.TUILE_NORMALE, 'i', false);
    public static final Tuile j = new TuileVirage(Constants.TUILE_MONTAGNE, 'j', true);
    public static final Tuile k = new TuileVirage(Constants.TUILE_DESCENTE, 'k', true);
    public static final Tuile l = new TuileLigneDroite(Constants.TUILE_NORMALE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'l');
    public static final Tuile m = new TuileLigneDroite(Constants.TUILE_NORMALE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'm');
    public static final Tuile n = new TuileLigneDroite(Constants.TUILE_DESCENTE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'n');
    public static final Tuile o = new TuileVirage(Constants.TUILE_DESCENTE, 'o', true);
    public static final Tuile p = new TuileVirage(Constants.TUILE_MONTAGNE, 'p', false);
    public static final Tuile q = new TuileVirage(Constants.TUILE_DESCENTE, 'q', true);
    public static final Tuile r = new TuileVirage(Constants.TUILE_NORMALE, 'r', false);
    public static final Tuile s = new TuileVirage(Constants.TUILE_DESCENTE, 's', false);
    public static final Tuile t = new TuileVirage(Constants.TUILE_NORMALE, 't', true);
    public static final Tuile arrive = new TuileLigneDroite(Constants.TUILE_DESCENTE, Constants.NOMBRE_CASES_LIGNE_DROITE, 'u');
}
