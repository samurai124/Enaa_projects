package Paiement_Polymorphisme;

public class PaiementCash extends Paiement {
    private double montantRecu;

    public PaiementCash(double montant, double montantRecu) {
        super(montant);
        this.montantRecu = montantRecu;
    }

    @Override
    public void effectuerPaiement(double montant) {
        double monnaie = montantRecu - montant;
        System.out.println("Paiement en cash " + montant + " $. Monnaie  rendre: " + monnaie + " $");
    }
}