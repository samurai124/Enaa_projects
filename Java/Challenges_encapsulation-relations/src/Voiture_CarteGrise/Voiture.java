package Voiture_CarteGrise;

public class Voiture {
    private String immatriculation;
    private String marque;
    private String modele;
    private CarteGrise carteGrise;
    public Voiture(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }
    public void lierCarteGrise(CarteGrise c) {
        this.carteGrise = c;
        c.setVoiture(this);
    }
    public void afficher() {
        System.out.println("Voiture: " + immatriculation + " " + marque + " " + modele);
        if (carteGrise != null) {
            carteGrise.afficher();
        }
    }
}
