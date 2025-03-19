package Projet1;

public class Voiture {
    String marque;
    String modele;
    int annee;

    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    

    public void afficherInfo() {
        System.out.println("Marque :"+marque + ", modèle :" + modele + ", année :" + annee);
    }
}
