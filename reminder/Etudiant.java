import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    public String nom;
    public String prenom;
    public int age;
    public boolean type;
    public List<Double> notes;
    public static ArrayList<Etudiant> list = new ArrayList<>();

    public Etudiant(String nom, String prenom, int age, boolean type, List<Double> notes) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.type = type;
        this.notes = notes;
    }

    public static void ajouterEtudiant(Etudiant etudiant) {
        list.add(etudiant);
        System.out.println("Etudiant ajouté avec succès - " + etudiant.nom + " " + etudiant.prenom);
    }

    public static void afficherEtudiants() {
        for (Etudiant e : list) {
            System.out.println(e.nom + " " + e.prenom + " (" + e.typeString() + "), Age: " + e.age + ", Notes: " + e.notes);
        }
    }

    public String typeString(){
        return type ? "responsable" : "Normal";
    }

    public double calculerMoyenne() {
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.size();
    }
}