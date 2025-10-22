import java.util.ArrayList;

public class Bibliotheque {
    public static ArrayList<Livre> list = new ArrayList<>();    

    public static void ajouterlivre(Livre livre){
        Bibliotheque.list.add(livre);
        System.out.println("Livre ajouté avec succés - " + livre.titre);
    }

    public static void afficherlivre(){
        System.out.println("il ya " + list.size() + " livres dans le Bibliotheque : ");

        for (Livre livre : list){
            System.out.println("Titre : " + livre.titre + " \nAuteur : " + livre.auteur + " \nAnnée de publication : " + livre.annepublication + "\n");
        }
    }

    public static void rechercherlivre(String titre){
        for (Livre livre : list){
            if (livre.titre.equals(titre)){
                System.out.println("Titre : " + livre.titre + " \nAuteur : " + livre.auteur + " \nAnnée de publication : " + livre.annepublication);
            }
            else{
                System.err.println("Ce livre n'éxiste pas");
            }
        }
    }
    public static void supprimerlivre(String titre){
        boolean found = false;
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            Livre livre = iterator.next();
            if (livre.titre.equals(titre)) {
                iterator.remove();
                System.out.println("Livre supprimé avec succés - " + livre.titre);
                afficherlivre();
                found = true;
                break;
            }
        }
        if (!found) {
            System.err.println("ce livre n'a pas été trouvé.");
        }
    }
}
