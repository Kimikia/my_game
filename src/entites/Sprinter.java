package entites;

import constants.Utilitaires;

public class Sprinter extends Cycliste {

    public Sprinter() {
        super(Utilitaires.creerPaquetSprinter());
    }


    @Override
    protected String getTypeCycliste() {
        return "Sprinter";
    }

}
