package Banque_Comptes;

public class CompteCourant extends Compte{
    private double limit;
    public CompteCourant(int numero, double solde,double limit) {
        super(numero, solde);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void retirer(double montant) {
        if ((getSolde()-montant) >= -limit){
            setSolde(getSolde() - montant);
        }
        else {
            System.out.println("solde insuffisantes !!!");
        }
    }
}
