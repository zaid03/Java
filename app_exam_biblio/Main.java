import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i != 5){
            System.out.println("\n1. Ajouter un livre");
            System.out.println("\n2. Afficher tous les livres");
            System.out.println("\n3. Rechercher un livre");
            System.out.println("\n4. Supprimer un livre");
            System.out.println("\n5. Quitter le prgram\n");
            System.out.print("Entrez votre choix : ");
            i = scanner.nextInt();
            scanner.nextLine();
            switch (i){
                    case 1 -> {
                        boolean stayinajouter = true;
                        while (stayinajouter) {
                            System.out.println("Entrez le titre du livre : ");
                            String titre = scanner.nextLine();
                            System.out.println("Entrez l'auteur du livre : ");
                            String auteur = scanner.nextLine();
                            System.out.println("Entrez l'année de publication");
                            int annepublication = scanner.nextInt();
                            scanner.nextLine();

                            Livre livre = new Livre(titre, auteur, annepublication);
                            Bibliotheque.ajouterlivre(livre);

                            System.out.println("\nVoulez-vous ajouter un autre livre ? (oui/non) : ");
                            String answering = scanner.nextLine().trim().toLowerCase();
                            if (answering.equals("non")) {
                                stayinajouter = false;
                            }
                        }
                        
                    }

                    case 2 -> {
                        Bibliotheque.afficherlivre();
                        System.out.println("Retourner? ");
                        scanner.nextLine();
                    }

                    case 3 -> {
                        boolean stayinsearch = true;
                        while (stayinsearch) {
                            System.out.println("Enter le titre du livre vous voulez rechercher: ");
                            String titre = scanner.nextLine();
                            Bibliotheque.rechercherlivre(titre);
                            
                            System.out.println("\nVoulez-vous rechercher un autre livre ? (oui/non) : ");
                            String answering = scanner.nextLine().trim().toLowerCase();
                            if (answering.equals("non")) {
                                stayinsearch = false;
                            }
                        }
                        
                    }  
                    
                    case 4 -> {
                        boolean stayindelete = true;
                        while (stayindelete) {
                            System.out.println("Entrez le titre que vous pouvez supprimer: ");
                            String titre = scanner.nextLine();
                            Bibliotheque.supprimerlivre(titre);

                            System.out.println("\nVoulez-vous Supprimer un autre livre ? (oui/non) : ");
                            String answering = scanner.nextLine().trim().toLowerCase();
                            if (answering.equals("non")) {
                                stayindelete = false;
                            }
                        }
                        
                    }

                    case 5 -> {
                        System.out.println("bye");
                        i = 5;
                    }

                    default -> {
                        System.err.println("Option invalide, réessayer.");
                    }
            }
        }
        scanner.close();
    }
}