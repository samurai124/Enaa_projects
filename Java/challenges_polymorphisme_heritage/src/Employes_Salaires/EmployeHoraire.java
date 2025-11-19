package Employes_Salaires;

public class EmployeHoraire extends Employe {
    private int heuresTravaillees;
    private  double tauxHoraire;

    public EmployeHoraire(String nom, double salaireBase,int heuresTravaillees,double tauxHoraire) {
        super(nom, salaireBase);
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    public int getHeuresTravaillees() {
        return heuresTravaillees;
    }

    public void setHeuresTravaillees(int heuresTravaillees) {
        this.heuresTravaillees = heuresTravaillees;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}
