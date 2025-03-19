package Projet2;

public class Livres {
    int id;
    int idCount = 1;
    String titre;
    String auteur;
    int annee;
    boolean disponible;

    Livres(String titre, String auteur, int annee) {
        this.id = idCount++;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void modifierLivre(String nouveauTitre, String nouvelAuteur, int nouvelAnnee) {
        if (nouveauTitre != null && !nouveauTitre.isEmpty()) {
            this.titre = nouveauTitre;
        }
        if (nouvelAuteur != null && !nouvelAuteur.isEmpty()) {
            this.auteur = nouvelAuteur;
        }
        if (nouvelAnnee > 0){
            this.annee = nouvelAnnee;
        }
    }


    public String toString() {
        return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", annee=" + annee + "]";
    }





}
