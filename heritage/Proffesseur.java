public class Proffesseur extends Personne { 
    String addresse;
    String nom;
    String prenom;
    
    public Proffesseur(String nom, String prenom, String addresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
    }

    @Override
    public void afficher_nom() {
        System.out.println("Nom : " + nom + " Prenom : " + prenom);
    }

    public void afficher_Addresse() {
        System.out.println("Addresse : " + addresse);
    }
}
