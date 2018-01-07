package constants;

import entites.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilitaires {

    /*
    Le paquet de carte du rouleur est constitué de :
    3 cartes '3'
    3 cartes '4'
    3 cartes '5'
    3 cartes '6'
    3 cartes '7'

    */

    /**
     * creation de paquet de carte pour le rouleur
     * @return liste paquet de carte
     */
    public static List<Carte> creerPaquetsRouleur() {


        List<Carte> carteList = new ArrayList<>();
        carteList.add(new CarteEnergie(7));
        carteList.add(new CarteEnergie(7));
        carteList.add(new CarteEnergie(7));
        carteList.add(new CarteEnergie(6));
        carteList.add(new CarteEnergie(6));
        carteList.add(new CarteEnergie(6));
        carteList.add(new CarteEnergie(5));
        carteList.add(new CarteEnergie(5));
        carteList.add(new CarteEnergie(5));
        carteList.add(new CarteEnergie(4));
        carteList.add(new CarteEnergie(4));
        carteList.add(new CarteEnergie(4));
        carteList.add(new CarteEnergie(3));
        carteList.add(new CarteEnergie(3));
        carteList.add(new CarteEnergie(3));

        Collections.shuffle(carteList);


        return carteList;
    }

    /**
     * creation de paquet de carte pour le Sprinteur
     * @return liste paquet de carte
     */
    public static List<Carte> creerPaquetSprinter() {
    /*
    Le paquet de carte du Sprinteur est constitué de :
    3 cartes '2'
    3 cartes '3'
    3 cartes '4'
    3 cartes '5'
    3 cartes '9'
    */


        List<Carte> carteList = new ArrayList<>();
        carteList.add(new CarteEnergie(9));
        carteList.add(new CarteEnergie(9));
        carteList.add(new CarteEnergie(9));
        carteList.add(new CarteEnergie(5));
        carteList.add(new CarteEnergie(5));
        carteList.add(new CarteEnergie(5));
        carteList.add(new CarteEnergie(4));
        carteList.add(new CarteEnergie(4));
        carteList.add(new CarteEnergie(4));
        carteList.add(new CarteEnergie(3));
        carteList.add(new CarteEnergie(3));
        carteList.add(new CarteEnergie(3));
        carteList.add(new CarteEnergie(2));
        carteList.add(new CarteEnergie(2));
        carteList.add(new CarteEnergie(2));

        Collections.shuffle(carteList);

        return carteList;
    }


    /**
     * creation de paquet de carte fatigue
     * @return liste paquet de carte
     */
    public static List<CarteFatigue> creerPaquetFatigues() {
        // le paquet de fatigue est constitué de 30 cartes Fatigue

        List<CarteFatigue> carteList = new ArrayList<>();
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());
        carteList.add(new CarteFatigue());


        return carteList;
    }

    //on va creer 3 circuits , le joueur devrait choisr le circuit qu'il veut selon le degrée de difficulté

    /**
     * creation de circuit
     * @return circuit
     */
    public static Circuit creerCircuitFacile() {

        List<Tuile> list = new ArrayList<>();
        list.add(TuilesDefinies.depart);
        list.add(TuilesDefinies.b);
        list.add(TuilesDefinies.c);
        list.add(TuilesDefinies.d);
        list.add(TuilesDefinies.e);
        list.add(TuilesDefinies.f);
        list.add(TuilesDefinies.g);
        list.add(TuilesDefinies.h);
        list.add(TuilesDefinies.i);
        list.add(TuilesDefinies.j);
        list.add(TuilesDefinies.k);
        list.add(TuilesDefinies.l);
        list.add(TuilesDefinies.m);
        list.add(TuilesDefinies.n);
        list.add(TuilesDefinies.o);
        list.add(TuilesDefinies.p);
        list.add(TuilesDefinies.q);
        list.add(TuilesDefinies.r);
        list.add(TuilesDefinies.s);
        list.add(TuilesDefinies.t);
        list.add(TuilesDefinies.arrive);


        Circuit circuit = new Circuit(list, "Circuit Facile");
        return circuit;

    }

    /**
     * creation de circuit niveau moyen
     * @returncircuit moyen
     */
    public static Circuit creerCircuitMoyen(){
        List<Tuile> list = new ArrayList<>();
        list.add(TuilesDefinies.depart);
        list.add(TuilesDefinies.d);
        list.add(TuilesDefinies.e);
        list.add(TuilesDefinies.m);
        list.add(TuilesDefinies.o);
        list.add(TuilesDefinies.q);
        list.add(TuilesDefinies.g);
        list.add(TuilesDefinies.h);
        list.add(TuilesDefinies.c);
        list.add(TuilesDefinies.j);
        list.add(TuilesDefinies.k);
        list.add(TuilesDefinies.l);
        list.add(TuilesDefinies.b);
        list.add(TuilesDefinies.i);
        list.add(TuilesDefinies.r);
        list.add(TuilesDefinies.p);
        list.add(TuilesDefinies.f);
        list.add(TuilesDefinies.n);
        list.add(TuilesDefinies.s);
        list.add(TuilesDefinies.t);
        list.add(TuilesDefinies.arrive);
        Circuit circuit = new Circuit(list, "Circuit Moyen");
        return circuit;
    }

    public static Circuit creerCircuitHard(){
        List<Tuile> list = new ArrayList<>();
        list.add(TuilesDefinies.depart);
        list.add(TuilesDefinies.b);
        list.add(TuilesDefinies.r);
        list.add(TuilesDefinies.s);
        list.add(TuilesDefinies.e);
        list.add(TuilesDefinies.q);
        list.add(TuilesDefinies.i);
        list.add(TuilesDefinies.h);
        list.add(TuilesDefinies.d);
        list.add(TuilesDefinies.j);
        list.add(TuilesDefinies.k);
        list.add(TuilesDefinies.o);
        list.add(TuilesDefinies.c);
        list.add(TuilesDefinies.g);
        list.add(TuilesDefinies.l);
        list.add(TuilesDefinies.p);
        list.add(TuilesDefinies.f);
        list.add(TuilesDefinies.n);
        list.add(TuilesDefinies.m);
        list.add(TuilesDefinies.t);
        list.add(TuilesDefinies.arrive);
        Circuit circuit = new Circuit(list, "Circuit Hard");
        return circuit;
    }

}
