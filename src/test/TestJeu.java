package test;

import constants.Constants;
import constants.Utilitaires;
import entites.Circuit;
import entites.Jeu;
import entites.Joueur;

import java.util.ArrayList;
import java.util.List;

import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;

public class TestJeu {
    /**
     * methode de lancement des tests
     *
     * @param args args
     */
    public static void main(String[] args) {
        lancer(new TestJeu(), args);
    }
// test de constructeur

    /**
     * test  pour 2 joueurs , niveau de diffuculte : 1
     */

    public void test_01_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Facile", circuit.getNomCircuit());

    }

    /**
     * test pour 2 joueurs , niveau de diffuculte : 2
     */

    public void test_02_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Moyen", circuit.getNomCircuit());

    }

    /**
     * test pour 2 joueurs , niveau de diffuculte : 3
     */
    public void test_03_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("circuit 3 dificille", "Circuit Difficile", circuit.getNomCircuit());

    }

    /**
     * test pour 3 joueurs , niveau de diffuculte : 1
     */

    public void test_04_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(2).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Facile", circuit.getNomCircuit());

    }

    /**
     * pour 3 joueurs , niveau de diffuculte : 2
     */

    public void test_05_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);


        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(2).getNomJoueur());
        assertEquals("circuit moyen ", "Circuit Moyen", circuit.getNomCircuit());

    }

    /**
     * pour 3 joueurs , niveau de diffuculte : 3
     */

    public void test_06_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);


        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(2).getNomJoueur());

        assertEquals("circuit difficile  ", "Circuit Difficile", circuit.getNomCircuit());

    }

    /**
     * pour 4 joueurs , niveau de diffuculte : 1
     */

    public void test_07_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur4 ", "Joueur4", joueurList.get(3).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Facile", circuit.getNomCircuit());

    }

    /**
     * tst pour 4 joueurs , niveau de diffuculte : 2
     */

    public void test_08_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur4 ", "Joueur4", joueurList.get(3).getNomJoueur());
        assertEquals("circuit moyen ", "Circuit Moyen", circuit.getNomCircuit());

    }

    /**
     * test pour 4 joueurs , niveau de diffuculte : 3
     */

    public void test_09_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);


        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(0).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur2", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur4 ", "Joueur4", joueurList.get(3).getNomJoueur());
        assertEquals("circuit difficile  ", "Circuit Difficile", circuit.getNomCircuit());

    }

    public void test_10_verifieMethodes() {
        // pour 2 joueurs niveau dif : 1

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 2, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 1, joueurList.get(1).getSprinter().getPositionActuelle());

    }

    public void test_11_verifieMethodes() {
        // pour 3 joueurs niveau dif : 1

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 3, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 2, joueurList.get(1).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 3 ", 3, joueurList.get(2).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 3 ", 1, joueurList.get(2).getSprinter().getPositionActuelle());

    }

    public void test_12_verifieMethodes() {
        // pour 4 joueurs niveau dif : 1

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 4, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 3, joueurList.get(1).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 3 ", 3, joueurList.get(2).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 3", 2, joueurList.get(2).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 4", 4, joueurList.get(3).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 4 ", 1, joueurList.get(3).getSprinter().getPositionActuelle());

    }

    public void test_13_verifieMethodes() {
        // pour 2 joueurs niveau dif : 2

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 2, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 1, joueurList.get(1).getSprinter().getPositionActuelle());

    }

    public void test_14_verifieMethodes() {
        // pour 3 joueurs niveau dif : 2

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 3, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 2, joueurList.get(1).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 3 ", 3, joueurList.get(2).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 3 ", 1, joueurList.get(2).getSprinter().getPositionActuelle());

    }

    public void test_15_verifieMethodes() {
        // pour 4 joueurs niveau dif :2

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 4, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 3, joueurList.get(1).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 3 ", 3, joueurList.get(2).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 3", 2, joueurList.get(2).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 4", 4, joueurList.get(3).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 4 ", 1, joueurList.get(3).getSprinter().getPositionActuelle());

    }

    public void test_16_verifieMethodes() {
        // pour 2 joueurs niveau dif : 3

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 2, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 1, joueurList.get(1).getSprinter().getPositionActuelle());

    }

    public void test_17_verifieMethodes() {
        // pour 3 joueurs niveau dif : 3

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 3, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 2, joueurList.get(1).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 3 ", 3, joueurList.get(2).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 3 ", 1, joueurList.get(2).getSprinter().getPositionActuelle());

    }

    public void test_18_verifieMethodes() {
        // pour 4 joueurs niveau dif : 3

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);
        j.positionDepart();

        assertEquals("la position du rouleur du joueur 1 ", 1, joueurList.get(0).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 1 ", 4, joueurList.get(0).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 2 ", 2, joueurList.get(1).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 2 ", 3, joueurList.get(1).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 3 ", 3, joueurList.get(2).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 3", 2, joueurList.get(2).getSprinter().getPositionActuelle());
        assertEquals("la position du rouleur du joueur 4", 4, joueurList.get(3).getRouleur().getPositionActuelle());
        assertEquals("la position du sprinter du joueur 4 ", 1, joueurList.get(3).getSprinter().getPositionActuelle());

    }

    public void test_19_verifieMethodes() {
        // pour 4 joueurs niveau dif : 3

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);
        joueur3.getSprinter().setPositionActuelle(circuit.positionDerniereCase());
        joueur2.getRouleur().setPositionActuelle(circuit.positionDerniereCase());
        j.estFini();

        assertEquals("jeu est fini",true ,j.estFini());




        }
    public void test_20_verifieMethodes() {
        // pour 3 joueurs niveau dif : 3

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);
        joueur3.getSprinter().setPositionActuelle(circuit.positionDerniereCase());
        joueur2.getRouleur().setPositionActuelle(circuit.positionDerniereCase());
        j.estFini();

        assertEquals("jeu est fini",true ,j.estFini());
}
    // pour 2 joueurs niveau dif : 3
    public void test_21_verifieMethodes() {
    List<Joueur> joueurList = new ArrayList<>();
    String nomJoueur1 = "Joueur1";
    Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
    String nomJoueur2 = "Joueur2";
    Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
    Circuit circuit = Utilitaires.circuitChoisis(3);
    Jeu j = new Jeu(joueurList, circuit);
        joueur1.getSprinter().setPositionActuelle(circuit.positionDerniereCase());
        joueur2.getRouleur().setPositionActuelle(circuit.positionDerniereCase());
        j.estFini();

        assertEquals("jeu est fini",true ,j.estFini());
}

    public void test_22_verifieMethodes() {
        // pour 4 joueurs niveau dif : 2

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);
        joueur3.getSprinter().setPositionActuelle(circuit.positionDerniereCase());
        joueur2.getRouleur().setPositionActuelle(circuit.positionDerniereCase());
        j.estFini();

        assertEquals("jeu est fini",true ,j.estFini());




    }
    public void test_23_verifieMethodes() {
        // pour 3 joueurs niveau dif : 2

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);
        joueur3.getSprinter().setPositionActuelle(circuit.positionDerniereCase());
        joueur2.getRouleur().setPositionActuelle(circuit.positionDerniereCase());
        j.estFini();

        assertEquals("jeu est fini",true ,j.estFini());
    }
    // pour 2 joueurs niveau dif : 2
    public void test_24_verifieMethodes() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);
        joueur1.getSprinter().setPositionActuelle(circuit.positionDerniereCase());
        joueur2.getRouleur().setPositionActuelle(circuit.positionDerniereCase());
        j.estFini();

        assertEquals("jeu est fini",true ,j.estFini());
    }

}
