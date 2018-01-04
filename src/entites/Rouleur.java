package entites;

import constants.Utilitaires;

public class Rouleur extends Cycliste {


    public Rouleur() {
        //paquet rouleur
        super(Utilitaires.creerPaquetsRouleur());
    }

    @Override
    protected String getTypeCycliste() {
        return "Rouleur";
    }
}
