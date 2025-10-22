import java.util.Scanner;

public class table_de_multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un nombre pour obtenir son table de multiplication: ");
        int n = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(n +" * "+ (i + 1) +" = "+ n * (i + 1));
        }

        scanner.close();
    }
}
