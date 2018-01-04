package entites;

import constants.Constants;

public abstract class Tuile {

    protected int pente;
    protected int nombreDeCases;
    protected char nomTuile;

    /**
     * @param pen      la pente de la tuile , 1 s'il s'agit d'une montagne , -1 s'il s'agit d'une descente ou 0 ligne droite
     * @param nbrCases le nombre de case de la entites.Tuile
     * @param lettre   les lettres attribué à chaque tuile de a à z
     */
    protected Tuile(int pen, int nbrCases, char lettre) {
        this.pente = pen;
        this.nombreDeCases = nbrCases;
        this.nomTuile = lettre;
    }


    /*
    ACCESSEURS
     */
    public int getPente() {
        return this.pente;
    }

    public int getNombreDeCases() {
        return nombreDeCases;
    }

    public void setNombreDeCases(int nombreDeCases) {
        this.nombreDeCases = nombreDeCases;
    }

    public char getNomTuile() {
        return nomTuile;
    }

    public void setNomTuile(char nomTuile) {
        this.nomTuile = nomTuile;
    }

    /*
    METHODES
     */

    public boolean estLigneDroite() {
        boolean droite = false;
        if (this.getPente() == Constants.TUILE_NORMALE) {
            droite = true;
        }
        return droite;

    }

    public boolean estMontee() {
        boolean monte = false;
        if (this.getPente() == Constants.TUILE_MONTAGNE) {
            monte = true;
        }
        return monte;

    }

    public boolean estDescente() {
        boolean descente = false;
        if (this.getPente() == Constants.TUILE_DESCENTE) {
            descente = true;
        }
        return descente;

    }


}