public class Personne {
    String nom;
    int age;
    int[] note;

    public Personne(String nom, int age, int[] note) {
        this.nom = nom;
        this.age = age;
        this.note = note;
    }

    public void afficher_nom() {
        System.out.println("Nom : " + nom+" age: "+ age);
    }

    public void calcule_notes() {
        int res = 0;
        for (int i =0 ; i<note.length; i++){
            res = (res + note[i])/note.length;
        }
        System.out.println("La moyenne est : "+res);
    }
}