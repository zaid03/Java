package testing;

public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double solde){
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() { return titulaire; }
    public void setTitulaire(String titulaire) { this.titulaire = titulaire; }
    public double getSolde() { return solde; }
    public void setSolde(double solde) { this.solde = solde; }

    public void deposer(double montant) {
        this.solde += montant;
        System.out.println("Votre solde est :"+ this.solde);
    }

    public void retirer(double montant) {
        this.solde -= montant;
        System.out.println("Votre solde est :"+ this.solde);
    }

    public void afficherSolde(){
        System.out.println("Votre solde est :"+ this.solde);
    }
}
