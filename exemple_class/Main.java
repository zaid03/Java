import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre age : ");
        int age = scanner.nextInt();

        System.out.print("Combien de notes : ");
        int length = scanner.nextInt();
        
        int[] notes = new int[length];
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez la note " + (i + 1) + " : ");
            notes[i] = scanner.nextInt();
        }
        Personne personne = new Personne(nom, age, notes);
        personne.afficher_nom();
        personne.calcule_notes();
        scanner.close();
    }
}