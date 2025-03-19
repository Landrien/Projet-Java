package Projet2;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Membre {

    Admin(String nom, String prenom, String adresse){
    super(nom, prenom, adresse);
    }

    public void addBook(String titre, String auteur, int annee) {
        livres.add(new Livres(titre, auteur, annee));

    }

    public void removeBook(int id) {
        if (Library.RechercheLivreId(id)) {
            Library.library.remove(id);
            System.out.println("Le livre est supprimé");
        } else {
            System.out.println("Livre Inconnu");
        }

    }
}
