package Projet1;

public class Voiture extends Vehicule{
    double prixInitial;

    Voiture(String marque, String modele, int annee, double prixInitial) {
        super(marque, modele, annee);
        this.prixInitial = prixInitial;
    }

    public void afficherInfo() {
        super.afficherInfo();
        System.out.println(", prix: "+ calculerValeurRevente() );
    }

    double calculerValeurRevente(){
        int annee_actuelle = 2020;
        prixInitial = prixInitial - (prixInitial *((annee_actuelle-annee)* 0.1));
        if (prixInitial < 0){
            prixInitial = 0;
        }
        return prixInitial;
    }


}
