public class Main {
    
    public static void main(String[] args) {
        int[] table = {12,14,15};
        Etudiant etu1 = new Etudiant("zaid", "terguy", table);
        etu1.afficher_nom();
        etu1.calcule_notes();

        Proffesseur prof1 = new Proffesseur("zaid", "terguy", "New york");
        prof1.afficher_nom();
        prof1.afficher_Addresse();
    }
}