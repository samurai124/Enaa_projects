package Transport_Vehicules;

public class Voiture extends Vehicule{
    public Voiture(String marque, int modele) {
        super(marque, modele);
    }

    @Override
    public void demarrer() {
        System.out.println("Voiture!!!!!!!!!!!!!");
    }
}
