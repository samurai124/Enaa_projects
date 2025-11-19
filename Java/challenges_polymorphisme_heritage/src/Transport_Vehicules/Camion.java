package Transport_Vehicules;

public class Camion extends Vehicule{
    public Camion(String marque, int modele) {
        super(marque, modele);
    }

    @Override
    public void demarrer() {
        System.out.println("Camion !!!!!!!!!!!!!");
    }
}
