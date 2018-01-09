package entites;

public class Joueur {

    private String nomJoueur;
    private String nomEquipe;
    private Rouleur rouleur;
    private Sprinter sprinter;

    public Joueur(String nomJoueur, String nomEquipe) {
        this.nomJoueur = nomJoueur;
        this.nomEquipe = nomEquipe;
        this.rouleur = new Rouleur();
        this.sprinter = new Sprinter();
    }

    /**
     *
     * METHODES GETTERS
     */
    public String getNomJoueur() {
        return nomJoueur;
    }
    public Rouleur getRouleur() {
        return rouleur;
    }
    public Sprinter getSprinter() {
        return sprinter;
    }

    /**
     *
     * METHODES SETTERS
     */
    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }
    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }


    /**
     * permer de  Choisir carte pou le sprinter et le rouleur du joueur
     */
    public void piocher() {
        //rouleur doit piocher
        rouleur.choisirCarte();

        //sprinteur doit piocher
        sprinter.choisirCarte();
    }

    /**
     *
     * @param cyclisteList
     * @param circuit
     */


}
