package entites;

import java.util.List;

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

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Rouleur getRouleur() {
        return rouleur;
    }

    public Sprinter getSprinter() {
        return sprinter;
    }

    public void piocher() {
        //rouleur doit piocher
        rouleur.choisirCarte();

        //sprinteur doit piocher
        sprinter.choisirCarte();
    }

    public void avancer(List<Cycliste> cyclisteList, Circuit circuit) {
        //avancer rouleur
        rouleur.avancer(cyclisteList, circuit);

        //avance sprinter
        sprinter.avancer(cyclisteList, circuit);
    }

}
