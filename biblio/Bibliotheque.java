import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    String nom;
    public List<Livre> listeLivres;
    public List<Emprunter> listeEmprunteurs;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.listeLivres = new ArrayList<>();
        this.listeEmprunteurs = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        listeLivres.add(livre);
        System.out.println("Le livre " + livre.titre + " a été ajouté à la bibliothèque.");
    }

    public void ajouterEmprunteur(Emprunter emprunteur) {
        listeEmprunteurs.add(emprunteur);
        System.out.println("L'emprunteur " + emprunteur.prenom + " " + emprunteur.nom + " a été ajouté.");
    }

    public void afficherLivresDisponibles() {
        System.out.println("\n Livres disponibles dans la bibliothèque " + nom + " :");
        boolean found = false;
        for (Livre livre : listeLivres) {
            if (livre.disponible) {
                System.out.println("- " + livre.titre + " de " + livre.auteur + ", ISBN: " + livre.isbn);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun livre disponible pour le moment.");
        }
    }
}