public class Livre {
    String titre;
    String auteur;
    String isbn;
    boolean disponible;

    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = true;
    }

    public void afficherInfos(){
        System.out.println("Titre : " + titre +
                           "\nAuteur : " + auteur +
                           "\nISBN : " + isbn +
                           "\nDisponible : " + (disponible ? "true" : "false"));
    }

    public void emprunter(){
        if (disponible){
            disponible = false;
            System.out.println("Le livre " + titre + " a été emprunté.");
        }else{
            System.out.println("Le livre " + titre + " est déja emprunté.");
        }
    }

    public void rendre(){
        if (!disponible) {
            disponible = true;
            System.out.println("Le livre " + titre + " a été rendu.");
        } else {
            System.out.println("Le livre " + titre + " est déjà disponible.");
        }
    }
}
