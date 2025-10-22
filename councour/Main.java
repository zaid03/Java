import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrer le premier nombre: ");
        int a = scanner.nextInt();

        System.out.print("entrer le deuxième  nombre: ");
        int b = scanner.nextInt();

        int res = a + b;
        int res2 = a * b;
        int res3 = a / b;
        int res4= a - b;

        System.out.println(a +" + "+ b +" = "+ res);
        System.out.println(a +" * "+ b +" = "+ res2);
        System.out.println(a +" / "+ b +" = "+ res3);
        System.out.println(a +" - "+ b +" = "+ res4);

        scanner.close();
    }
}