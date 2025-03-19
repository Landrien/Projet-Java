package Projet2;

import java.util.HashMap;
import java.util.Map;

public class Library {
    static HashMap<Integer,Livres> library = new HashMap<>();

    public static boolean RechercheLivreId(int id) {
        Livres livreTrouve = library.get(id);
        if (livreTrouve != null) {
            System.out.println("Livre trouvé :" + livreTrouve);
            return true;

        } else {
            System.out.println("Livre non trouvé");
            return false;
        }
    }

    void RechercheLivreTitre(String titre) {
        Livres livreTrouve = library.get(titre);
        if (livreTrouve != null) {
            System.out.println("Livre trouvé :" + livreTrouve);
        } else {
            System.out.println("Livre non trouvé");
        }
    }



    public static void main(String[] args) {


        Livres livre1 = new Livres("Les Misérables", "Victor Hugo", 1862);
        Livres livre2 = new Livres("Le petit prince", "Saint-Exupéry", 1865);
        Livres livres3 = new Livres("Les trois Mousquetaires", "Alexandre Dumas", 1866);

        library.put(livre1.getId(), livre1);
        library.put(livre2.getId(), livre2);
        library.put(livres3.getId(), livres3);


    }


    }


