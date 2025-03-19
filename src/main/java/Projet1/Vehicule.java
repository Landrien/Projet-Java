package Projet1;

public class Vehicule {
    String marque;
    String modele;
    int annee;

    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }



    public void afficherInfo() {
        System.out.print("Marque :"+marque + ", modèle :" + modele + ", année :" + annee);
    }
}
