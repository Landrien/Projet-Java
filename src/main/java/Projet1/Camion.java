package Projet1;

public class Camion extends Vehicule{
    double capacite;
    double prixInitial;
    Camion(String marque, String modele, int annee, double capacite, double prixInitial) {
        super(marque, modele, annee);
        this.capacite = capacite;
        this.prixInitial = prixInitial;
    }

    double calculerValeurRevente(){
        int annee_actuelle = 2020;
        prixInitial = prixInitial - (prixInitial *((annee_actuelle-annee)* 0.12));
        if (prixInitial < 0){
            prixInitial = 0;
        }
        return prixInitial;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println(", prix :"+ calculerValeurRevente()+ ", capacité :"+capacite);
    }
}
