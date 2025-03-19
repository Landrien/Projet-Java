package Projet1;

public class Test {
    public static void main(String[] args) {

        testAfficherTousVehicules();
    }
    public static void testAfficherTousVehicules() {
        GestionVehicules gestionVehicules = new GestionVehicules();


        Voiture voiture1 = new Voiture("Ferrari", "F1", 2010, 100000);
        Voiture voiture2 = new Voiture("Porsche", "911", 2015, 150000);
        Moto moto1 = new Moto("Honda", "550", 2015, 5000);
        Moto moto2 = new Moto("Honda", "650", 2020, 7500);
        Camion camion1 = new Camion("Yamaha", "2008", 2015, 180, 180000);

        gestionVehicules.ajouterVehicule(voiture1);
        gestionVehicules.ajouterVehicule(voiture2);
        gestionVehicules.ajouterVehicule(moto1);
        gestionVehicules.ajouterVehicule(moto2);
        gestionVehicules.ajouterVehicule(camion1);

        for (Vehicule vehicule : gestionVehicules.getVehicules()) {
            vehicule.afficherInfo();
        }
    }
}
