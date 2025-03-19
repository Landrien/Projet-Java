package Projet2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Membre extends Personne implements GestionEmprunts{

       ArrayList<Livres> livres;

        Membre(String nom, String prenom, String adresse) {
            super(nom, prenom, adresse);
        }


    public void modifierMembre(String nouveauNom, String nouvelPrenom, String nouvelAdresse) {
        if (nouveauNom != null && !nouveauNom.isEmpty()) {
            this.nom = nouveauNom;
        }
        if (nouvelPrenom != null && !nouvelPrenom.isEmpty()) {
            this.prenom = nouvelPrenom;
        }
        if (nouvelAdresse != null && !nouvelAdresse.isEmpty()) {
            this.adresse = nouvelAdresse;
        }
    }


    @Override
    public void emprunterLivre(Membre membre,int id) {
            if(Library.RechercheLivreId(id)) {
                Livres livreTrouve = Library.library.get(id);
                if (livreTrouve.disponible) {
                    livreTrouve.disponible = false;
                    livres.add(livreTrouve);
                    System.out.println("Tu as empreinté le livre");
                } else {
                    System.out.println("Livre non disponible");
                }
            } else {
                System.out.println("Livre Inconnu");
            }
    }

    @Override
    public void retournerLivre(Membre membre,int id) {
        if(Library.RechercheLivreId(id)) {
            Livres livreTrouve = Library.library.get(id);
            if (!livreTrouve.disponible) {
                livreTrouve.disponible = true;
                livres.remove(livreTrouve);
                System.out.println("Livre rendu");
            } else {
                System.out.println("Livre déja rendu");
            }
        } else {
            System.out.println("Livre Inconnu");
        }
    }

    @Override
    public void verifierDisponibilite(int id) {
        if(Library.RechercheLivreId(id)) {
            Livres livreTrouve = Library.library.get(id);
            if (livreTrouve.disponible) {
                System.out.println("Le livre est disponible ");
            } else {
                System.out.println("Livre est déjà pris");
            }} else {
            System.out.println("Livre Inconnu");
        }
    }
}
