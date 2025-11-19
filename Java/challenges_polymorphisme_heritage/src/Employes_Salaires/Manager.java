package Employes_Salaires;

public class Manager extends EmployeHoraire {

    private double prime;

    public Manager(String nom, double salaireBase, int heuresTravaillees, double tauxHoraire,double prime) {
        super(nom, salaireBase, heuresTravaillees, tauxHoraire);
        this.prime = prime;
    }
    @Override
    public double calculerSalaire() {
        double salaireBase = super.calculerSalaire();
        return salaireBase + prime;
    }
}
