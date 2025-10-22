import java.util.ArrayList;
import java.util.List;

public class Emprunter {
    String nom;
    String prenom;
    int id;
    public List<Livre> livresEmpruntes;

    public Emprunter(String nom, String prenom, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.livresEmpruntes = new ArrayList<>();
    }

    public void emprunterLivre(Livre livre){
        if(livre.disponible){
            livresEmpruntes.add(livre);
            livre.emprunter();
            System.out.println(prenom + " " + nom + " a emprunté le livre : " + livre.titre);
        }
        else{
            System.out.println("Le livre " + livre.titre + " n'est pas disponible");
        }
    }

    public void rendreLivre(Livre livre) {
        if (livresEmpruntes.contains(livre)) {
            livresEmpruntes.remove(livre);
            livre.rendre();
            System.out.println(prenom + " " + nom + " a rendu le livre : " + livre.titre);
        } else {
            System.out.println("Ce livre ne fait pas partie des livres empruntés par " + prenom);
        }
    }
}
