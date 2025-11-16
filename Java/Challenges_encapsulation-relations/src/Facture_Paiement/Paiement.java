package Facture_Paiement;

public class Paiement {
    private double montant;
    private String date;
    public Paiement(double montant,String date){
        this.montant = montant;
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
