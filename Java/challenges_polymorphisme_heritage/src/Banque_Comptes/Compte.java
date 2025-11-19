package Banque_Comptes;

public class Compte {
    private int numero;
    private double solde;
    public Compte(int numero,double solde){
        this.numero = numero;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void verser(double montant){
        this.solde += montant;
    }
    public void retirer(double montant){
        if (solde - montant < 0){
            System.out.println("solde insuffisantes !!!");
        }else {
            this.solde -= montant;
        }
    }
}
