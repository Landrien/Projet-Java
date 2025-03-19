package Projet2;

public interface GestionEmprunts {

    void emprunterLivre(Membre membre,int id);
    void retournerLivre(Membre membre,int id);
    void verifierDisponibilite(int id);
}
