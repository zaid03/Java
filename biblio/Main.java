import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de la bibliothèque: ");
        String nomBibliotheque = scanner.nextLine();
        Bibliotheque biblio = new Bibliotheque(nomBibliotheque);

        for (int i = 0; i < 2; i++){
            System.out.print("Entrez le titre du livre " + (i + 1) + ": ");
            String titre = scanner.nextLine();
            System.out.print("Entrez l'auteur du livre " + (i + 1) + ": ");
            String auteur = scanner.nextLine();
            System.out.print("Entrez l'ISBN du livre " + (i + 1) + ": ");
            String isbn = scanner.nextLine();
            Livre livre = new Livre(titre, auteur, isbn);
            biblio.ajouterLivre(livre);
        }
        
        for (int i = 0; i < 2; i++){
            System.out.print("Entrez le nom de l'emprunteur: ");
            String nomEmprunteur = scanner.nextLine();
            System.out.print("Entrez le prénom de l'emprunteur: ");
            String prenomEmprunteur = scanner.nextLine();
            System.out.print("Entrez l'ID de l'emprunteur: ");
            int idEmprunteur = scanner.nextInt();
            scanner.nextLine();
            Emprunter emprunteur = new Emprunter(nomEmprunteur, prenomEmprunteur, idEmprunteur);
            biblio.ajouterEmprunteur(emprunteur);
        }

        System.out.println("Livres disponibles avant emprunt:");
        biblio.afficherLivresDisponibles();

        System.out.print("Entrez l'ISBN du livre à emprunter: ");
        String isbnEmprunt = scanner.nextLine();
        Livre livreAEmprunter = null;
        for (Livre livre : biblio.listeLivres) {
            if (isbnEmprunt.equals(livre.isbn)) {
                livreAEmprunter = livre;
                break;
            }
        }

        if(livreAEmprunter != null){
            System.out.print("Entrez l'ID de l'emprunteur: ");
            int idEmprunteur = scanner.nextInt();
            scanner.nextLine();
            Emprunter emprunteur = null;
            for (Emprunter emprunteur1 : biblio.listeEmprunteurs) {
                if (idEmprunteur == emprunteur1.id) {
                    emprunteur = emprunteur1;
                    break;
                }
            }
            if(emprunteur != null){
                emprunteur.emprunterLivre(livreAEmprunter);
            }
            else{
                System.out.println("Emprunteur non trouvé.");
            }
        }
        else{
            System.out.println("Livre non trouvé.");
        }

        System.out.println("Livres disponibles après emprunt:");
        biblio.afficherLivresDisponibles();

        System.out.print("Entrez l'ISBN du livre à rendre: ");
        String isbnRendre = scanner.nextLine();
        Livre livreARendre = null;
        for (Livre livre : biblio.listeLivres) {
            if (isbnRendre.equals(livre.isbn)) {
                livreARendre = livre;
                break;
            }
        }

        if (livreARendre != null) {
            System.out.print("Entrez l'ID de l'emprunteur: ");
            int idEmprunteur = scanner.nextInt();
            scanner.nextLine();
        
            Emprunter emprunteur = null;
            for (Emprunter emprunteur1 : biblio.listeEmprunteurs) {
                if (idEmprunteur == emprunteur1.id && emprunteur1.livresEmpruntes.contains(livreARendre)) {
                    emprunteur = emprunteur1;
                    break;
                }
            }
        
            if (emprunteur != null) {
                emprunteur.rendreLivre(livreARendre);
            } else {
                System.out.println("Aucun emprunteur trouvé avec cet ID ayant emprunté ce livre.");
            }
        } else {
            System.out.println("Livre non trouvé.");
        }
        
        
        System.out.println("Livres disponibles après retour:");
        biblio.afficherLivresDisponibles();

        scanner.close();
    }
}