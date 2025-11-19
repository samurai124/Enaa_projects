package Paiement_Polymorphisme;

public class PaiementCarte extends Paiement {
    private String numeroCarte;
    private String nomProprietaire;

    public PaiementCarte(double montant, String numeroCarte, String nomProprietaire) {
        super(montant);
        this.numeroCarte = numeroCarte;
        this.nomProprietaire = nomProprietaire;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement par carte " + montant + " $ pour " + nomProprietaire);
    }
}
