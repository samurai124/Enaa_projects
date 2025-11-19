package Employes_Salaires;

public class EmployeCommission extends EmployeHoraire{
    private double ventes;
    private double commission;
    public EmployeCommission(String nom, double salaireBase, int heuresTravaillees, double tauxHoraire,double ventes,double commission) {
        super(nom, salaireBase, heuresTravaillees, tauxHoraire);
        this.ventes = ventes;
        this.commission = commission;
    }

    public double getVentes() {
        return ventes;
    }

    public void setVentes(double ventes) {
        this.ventes = ventes;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = getTauxHoraire() * getHeuresTravaillees();
        double salaireCommission = ventes * commission;
        return salaireBase + salaireCommission;
    }
}
