package Projet1;

public class Moto extends Vehicule{
    double prixInitial;

    Moto(String marque, String modele, int annee, double prixInitial) {
        super(marque, modele, annee);
        this.prixInitial = prixInitial;
    }
    public double calculerValeurRevente(){
        int annee_actuelle = 2020;
        prixInitial = prixInitial - (prixInitial *((annee_actuelle-annee)* 0.08));
        if (prixInitial < 0){
            prixInitial = 0;
        }
        return prixInitial;
    }

    @Override
    public void afficherInfo() {
            super.afficherInfo();
        System.out.println(", prix "+ calculerValeurRevente());
    }
}
