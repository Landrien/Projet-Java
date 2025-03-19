package Projet1;

import java.util.List;

import java.util.ArrayList;

public class GestionVehicules {
    List<Vehicule> vehicules;

    GestionVehicules() {
        vehicules = new ArrayList<>();
    }
    void ajouterVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public static void main(String[] args) {
        /*Voiture voiture1 = new Voiture("Ferrari", "F1", 2010, 100000);
        Voiture voiture2 = new Voiture("Porsche", "911", 2015, 150000);
        Moto moto1 = new Moto("Honda","550",2015,5000 );
        Moto moto2 = new Moto("Honda", "650", 2020, 7500);
        Camion camion1 = new Camion("Yamaha", "2008", 2015,180,180000);

        voiture1.afficherInfo();
        voiture2.afficherInfo();
        moto1.afficherInfo();
        moto2.afficherInfo();
        camion1.afficherInfo();*/


    }
}
