package test;

public class Etudiant extends Personna{
    final double note;

    public Etudiant(String nom, String prenom, Integer age, double note){
        super(nom, prenom, age);
        this.note = note;
    }

    public void afficherResultat(){
        if ( note >= 10) {
            System.out.println("Etudiant reussi");
        } else {
            System.out.println("Etudiant reussi pas");
        }
    }
}
