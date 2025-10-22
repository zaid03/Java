package testing;

public class Main {
    public static void main(String[] args){
        CompteBancaire cuentaUno = new CompteBancaire("Zaid", 9000);
        cuentaUno.deposer(500);
        cuentaUno.retirer(9000);
        cuentaUno.afficherSolde();

        CompteBancaire cuentaDos = new CompteBancaire("john", 500);
        cuentaDos.afficherSolde();
        cuentaDos.deposer(800);
        cuentaDos.retirer(200);
    }
}
