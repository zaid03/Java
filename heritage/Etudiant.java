public class Etudiant extends Personne{
    int[] note;
    String nom;
    String prenom;

    public Etudiant(String nom, String prenom, int[] note) {
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }

    @Override
    public void afficher_nom() {
        System.out.println("Nom : " + nom + " Prenom : " + prenom);
    }

    public void calcule_notes() {
        int res = 0;
        for (int i = 0; i < note.length; i++) {
            res += note[i];
        }
        res /= note.length;
        System.out.println("La moyenne est : " + res);
    }
}