package test;

public class Personna {
    private String nom;
    private String prenom;
    private Integer age;

    public Personna(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public void afficherInfos() {
        System.out.println("Votre nom complet: "+ nom + prenom +", Vous avez: "+ age + " ans.");
    }
}
