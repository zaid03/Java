import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Nom du fichier

        // Écriture dans le fichier
        writeToFile(filePath, "Bonjour ! Ceci est un test d'écriture dans un fichier.\nBienvenue en Java !");

        // Lecture du fichier
        readFromFile(filePath);
    }

    // Méthode pour écrire dans un fichier
    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Texte écrit avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture : " + e.getMessage());
        }
    }

    // Méthode pour lire un fichier
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nContenu du fichier :");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
