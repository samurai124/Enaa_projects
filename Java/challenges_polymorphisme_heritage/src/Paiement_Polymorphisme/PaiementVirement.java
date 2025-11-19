package Paiement_Polymorphisme;

public class PaiementVirement extends Paiement {
    private String compteSource;
    private String compteDestination;

    public PaiementVirement(double montant, String compteSource, String compteDestination) {
        super(montant);
        this.compteSource = compteSource;
        this.compteDestination = compteDestination;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Virement " + montant + " $ de " + compteSource + " vers " + compteDestination);
    }
}