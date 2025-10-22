import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Functions {
    String nom;
    String prenom;  
    String email;

    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = "zaid.123";

    public Functions(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }    

    public void ajouterutilisateur() {
        Connection connexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver trouvé !");

            connexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données !");

            String requesteInsertion = "INSERT INTO utilisateurs (nom, prenom, email) VALUES (?, ?, ?)";
            PreparedStatement ps = connexion.prepareStatement(requesteInsertion);
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, email);
            ps.executeUpdate();
            System.out.println("Utilisateur ajouté avec succès !");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur lors de l'exécution de la requête SQL !" + e.getMessage());
        } finally {
            try {
                if (connexion != null) connexion.close();
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
            }
        }
    }

    public void afficherutilisateur() {
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver trouvé !");

            connexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données !");

            String requeteAfficher = "SELECT * FROM utilisateurs";
            statement = connexion.createStatement();
            resultSet = statement.executeQuery(requeteAfficher);

            System.out.println("\n--- Liste des utilisateurs ---");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nomDB = resultSet.getString("nom");
                String prenomDB = resultSet.getString("prenom");
                String emailDB = resultSet.getString("email");
                System.out.println("ID: " + id + " | Nom: " + nomDB + " | Prénom: " + prenomDB + " | Email: " + emailDB);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur lors de l'affichage des utilisateurs : " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connexion != null) connexion.close();
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture des ressources : " + e.getMessage());
            }
        }
    }

    public void supprimerutilisateur(int id) {
        Connection connexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver trouvé !");

            connexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données !");

            String requetesupprimer = "DELETE FROM utilisateurs WHERE id = ?";
            PreparedStatement ps = connexion.prepareStatement(requetesupprimer);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Utilisateur supprimé avec succès !");
            } else {
                System.out.println("Aucun utilisateur trouvé avec cet ID.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur lors de supprimer des utilisateurs : " + e.getMessage());
        } finally {
            try {
                if (connexion != null) connexion.close();
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
            }
        }
    }

    public void updateutilisateurs(int idUpdate, String newNom, String newPrenom, String newEmail){
        Connection connexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver trouvé !");

            connexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données !");

            String requeteupdater = "UPDATE utilisateurs SET nom=?, prenom=?, email=? WHERE id=?";
            PreparedStatement ps = connexion.prepareStatement(requeteupdater);
            ps.setString(1, newNom);
            ps.setString(2, newPrenom);
            ps.setString(3, newEmail);
            ps.setInt(4, idUpdate);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Utilisateur et á jour !");
            } else {
                System.out.println("Aucun utilisateur trouvé avec cet ID.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur lors de mise á jour des utilisateurs : " + e.getMessage());
        } finally {
            try {
                if (connexion != null) connexion.close();
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
            }
        }
    }
}