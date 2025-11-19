package Transport_Vehicules;

public class Moto extends Vehicule{
    public Moto(String marque, int modele) {
        super(marque, modele);
    }

    @Override
    public void demarrer() {
        System.out.println("moto!!!!!!!!!!!!!");
    }
}
