package Banque_Comptes;

public class CompteEpargne extends Compte{
    private double taux_intere;
    public CompteEpargne(int numero, double solde,double taux_intere) {
        super(numero, solde);
        this.taux_intere = taux_intere;
    }

    public double getTaux_intere() {
        return taux_intere;
    }

    public void setTaux_intere(double taux_intere) {
        this.taux_intere = taux_intere;
    }
    public void appliquerInteret() {
        double interet = getSolde() * taux_intere;
        setSolde(getSolde() + interet);
    }
}
