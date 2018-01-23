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

    // pour 2 joueurs , niveau de diffuculte : 1
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

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Facile", circuit.getNomCircuit());

    }

    // pour 2 joueurs , niveau de diffuculte : 2
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

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Moyen", circuit.getNomCircuit());

    }

    // pour 2 joueurs , niveau de diffuculte : 3
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

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Difficile", circuit.getNomCircuit());

    }

    // pour 3 joueurs , niveau de diffuculte : 1
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

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(3).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Facile", circuit.getNomCircuit());

    }

    // pour 3 joueurs , niveau de diffuculte : 2
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

        assertEquals("nom joueur Joueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur Joueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur Joueur3 ", "Joueur3", joueurList.get(3).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Moyen", circuit.getNomCircuit());

    }

    // pour 3 joueurs , niveau de diffuculte : 3
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

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(3).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Difficile", circuit.getNomCircuit());

    }

    // pour 4 joueurs , niveau de diffuculte : 1
    public void test_07_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(3).getNomJoueur());
        assertEquals("nom joueur nomJoueur4 ", "Joueur4", joueurList.get(4).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Facile", circuit.getNomCircuit());

    }

    // pour 4 joueurs , niveau de diffuculte : 2
    public void test_08_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(2);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(3).getNomJoueur());
        assertEquals("nom joueur nomJoueur4 ", "Joueur4", joueurList.get(4).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Moyen", circuit.getNomCircuit());

    }

    // pour 4 joueurs , niveau de diffuculte : 3
    public void test_09_contructeurJeu() {
        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        String nomJoueur3 = "Joueur3";
        Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);
        String nomJoueur4 = "Joueur4";
        Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_3);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        joueurList.add(joueur3);
        joueurList.add(joueur4);
        Circuit circuit = Utilitaires.circuitChoisis(3);
        Jeu j = new Jeu(joueurList, circuit);

        assertEquals("nom joueur nomJoueur1 ", "Joueur1", joueurList.get(1).getNomJoueur());
        assertEquals("nom joueur nomJoueur2 ", "Joueur1", joueurList.get(2).getNomJoueur());
        assertEquals("nom joueur nomJoueur3 ", "Joueur3", joueurList.get(3).getNomJoueur());
        assertEquals("nom joueur nomJoueur4 ", "Joueur4", joueurList.get(4).getNomJoueur());
        assertEquals("circuit facile ", "Circuit Facile", circuit.getNomCircuit());

    }

    public void test_03_verifieMethodes() {
    // pour 2 joueurs phase 1

        List<Joueur> joueurList = new ArrayList<>();
        String nomJoueur1 = "Joueur1";
        Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);
        String nomJoueur2 = "Joueur2";
        Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);
        joueurList.add(joueur1);
        joueurList.add(joueur2);
        Circuit circuit = Utilitaires.circuitChoisis(1);
        Jeu j = new Jeu(joueurList, circuit);
        j.demarrerJeu();
        // je peux pas tester chaque methode , psq elles sont en relaion entre elles ...

}
}
