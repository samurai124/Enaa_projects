package Paiement_Polymorphisme;

public class Paiement {
    protected double montant;
    public Paiement(double montant) {
        this.montant = montant;
    }
    public void effectuerPaiement(double montant){
        this.montant = montant;
        System.out.println("Paiement :"+montant+"$");
    }
}
