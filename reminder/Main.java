import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre prenom : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre age : ");
        int age = scanner.nextInt();

        System.out.print("Etes-vous responsable ? (1 = oui, 0 = non) : ");
        int typeInput = scanner.nextInt();
        boolean type = (typeInput == 1);

        System.out.print("Combien de notes : ");
        int length = scanner.nextInt();

        List<Double> notes = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            System.out.print("Entrez la note " + (i + 1) + " : ");
            notes.add(scanner.nextDouble());
        }

        Etudiant etudiant = new Etudiant(nom, prenom, age, type, notes);
        Etudiant.ajouterEtudiant(etudiant);
        Etudiant.afficherEtudiants();
        System.out.println("Moyenne de " + nom + " : " + etudiant.calculerMoyenne());
        scanner.close();
    }
}