import java.util.Scanner;

public class aire_surface_cercle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Entrer Rayon pour calculer l'aire et la surface de cercle: ");
        double r = scanner.nextFloat();

        double A = PI * r * r;
        double P = 2 * PI * r;
        
        System.out.println("L'aire = "+ A);
        System.out.println("Périmetre = "+ P);
        scanner.close();
    }
}
