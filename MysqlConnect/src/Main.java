import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le système de gestion des utilisateurs !");
        System.out.println("1. Ajouter un utilisateur");
        System.out.println("2. Supprimer un utilisateur");
        System.out.println("3. Mettre à jour un utilisateur");
        System.out.println("4. Afficher tous les utilisateurs");
        System.out.println("5. Quitter");

        while (true) {
            System.out.print("Veuillez choisir une option (1-5) : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom de l'utilisateur : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prénom de l'utilisateur : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Entrez l'email de l'utilisateur : ");
                    String email = scanner.nextLine();
                    Functions utilisateurajjoute = new Functions(nom, prenom, email);
                    utilisateurajjoute.ajouterutilisateur();                    
                    break;
                case 2:
                    System.out.print("Entrez l'ID de l'utilisateur à supprimer : ");
                    int id = scanner.nextInt();
                    Functions utilisateurSupp = new Functions("", "", "");
                    utilisateurSupp.supprimerutilisateur(id);
                    break;
                case 3:
                    System.out.print("Entrez l'ID de l'utilisateur à mettre à jour : ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nouveau nom : ");
                    String newNom = scanner.nextLine();
                    System.out.print("Entrez le nouveau prénom : ");
                    String newPrenom = scanner.nextLine();
                    System.out.print("Entrez le nouvel email : ");
                    String newEmail = scanner.nextLine();
                    Functions utilisateurupp = new Functions("", "", "");
                    utilisateurupp.updateutilisateurs(idUpdate, newNom, newPrenom, newEmail);
                    break;
                case 4:
                    Functions utilisateuraff = new Functions("", "", "");
                    utilisateuraff.afficherutilisateur();
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}