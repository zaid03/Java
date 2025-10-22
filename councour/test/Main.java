package test;

public class Main {
    public static void main(String[] args) {
        Personna personnaUno = new Personna("Zaid", "terguy", 22);
        personnaUno.afficherInfos();
        Personna personnados = new Personna("john", "doe", 69);
        personnados.afficherInfos();   

        Etudiant etudiantUno = new Etudiant("zaid", "terguy", 22, 18);
        etudiantUno.afficherResultat();
        Etudiant etudiantDos = new Etudiant("john", "doe", 69, 8);
        etudiantDos.afficherResultat();
    }
}