import constants.Constants;
import constants.Utilitaires;
import entites.Circuit;
import entites.Jeu;
import entites.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Programme {

    public static void main(String[] args) {
        //creer circuit
        Circuit circuit = Utilitaires.creerCircuitFacile();

        //creer 4 joueurs et les mettre dans une liste

        Joueur joueur1 = new Joueur("Bernard" , Constants.EQUIPE_1);
        Joueur joueur2 = new Joueur("koko" , Constants.EQUIPE_2);
        Joueur joueur3 = new Joueur("kiki" , Constants.EQUIPE_3);
        Joueur joueur4 = new Joueur("kava" , Constants.EQUIPE_4);

        List <Joueur> joueurList = new ArrayList<>();
        joueurList.add(joueur1);
        joueurList.add(joueur2);
      //  joueurList.add(joueur3);
      //  joueurList.add(joueur4);

        //creer le jeu
        Jeu game = new Jeu(joueurList,circuit);

        //demarrer le jeu
        game.demarrerJeu();

    }

}
