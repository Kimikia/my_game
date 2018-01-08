import constants.Constants;
import constants.Utilitaires;
import entites.Circuit;
import entites.Jeu;
import entites.Joueur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programme {

    public static void main(String[] args) {

        //creer 4 joueurs et les mettre dans une liste

        System.out.println("Hello Les Cyclistes =) ! Préts pour une nouvelle course ??!!  Allez C'est partie!!! ");
        System.out.println("Commencer par : ");
        System.out.println("Entrer le nombre de joueurs (entre 2 et 4)");
        List<Joueur> joueurList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int nbJoueur = sc.nextInt();
        while (nbJoueur < 2 || nbJoueur > 4) {
            System.out.println("Oups! , le nombre de joueur doit étre entre 2 et 4 , veuillez resaisir !");
            nbJoueur = sc.nextInt();

        }

        if (nbJoueur == 2) {
            System.out.println("Entrer le nom du joueur1");
            String nomJoueur1 = sc.next();
            Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);

            System.out.println("Entrer le nom du joueur2");
            String nomJoueur2 = sc.next();
            Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);

            joueurList.add(joueur1);
            joueurList.add(joueur2);

        } else if (nbJoueur == 3) {
            System.out.println("Entrer le nom du joueur1");
            String nomJoueur1 = sc.next();
            Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);

            System.out.println("Entrer le nom du joueur2");
            String nomJoueur2 = sc.next();
            Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);

            System.out.println("Entrer le nom du joueur3");
            String nomJoueur3 = sc.next();
            Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);


            joueurList.add(joueur1);
            joueurList.add(joueur2);
            joueurList.add(joueur3);
        } else {
            System.out.println("Entrer le nom du joueur1");
            String nomJoueur1 = sc.next();
            Joueur joueur1 = new Joueur(nomJoueur1, Constants.EQUIPE_1);

            System.out.println("Entrer le nom du joueur2");
            String nomJoueur2 = sc.next();
            Joueur joueur2 = new Joueur(nomJoueur2, Constants.EQUIPE_2);

            System.out.println("Entrer le nom du joueur3");
            String nomJoueur3 = sc.next();
            Joueur joueur3 = new Joueur(nomJoueur3, Constants.EQUIPE_3);

            System.out.println("Entrer le nom du joueur4");
            String nomJoueur4 = sc.next();
            Joueur joueur4 = new Joueur(nomJoueur4, Constants.EQUIPE_4);

            joueurList.add(joueur1);
            joueurList.add(joueur2);
            joueurList.add(joueur3);
            joueurList.add(joueur4);
        }


        System.out.println("Choisissez le niveau de difficulté du Circuit (entre 1 et 3 ):");
        System.out.println("1-Facile  ou 2-Moyen ou 3-Difficile");

        int niveau = sc.nextInt();
        while (niveau < 1 || niveau > 3) {
            System.out.println("Oups ! le niveau doit étre compris entre 1 et 3 , Vuillez resaisir ");
            niveau = sc.nextInt();
        }

        Circuit circuit = Utilitaires.circuitChoisis(niveau);

        //creer le jeu
        Jeu game = new Jeu(joueurList, circuit);

        //demarrer le jeu
        game.demarrerJeu();

    }

}
