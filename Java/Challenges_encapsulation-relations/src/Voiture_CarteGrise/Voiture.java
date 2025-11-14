package Voiture_CarteGrise;

public class Voiture {
    private String immatriculation;
    private String marque;
    private String modele;

    private CarteGrise carteGrise;  // One-to-one relationship

    public Voiture(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    // Method to link the Carte Grise
    public void lierCarteGrise(CarteGrise c) {
        this.carteGrise = c;
        c.setVoiture(this); // optional (bidirectional link)
    }

    public void afficher() {
        System.out.println("Voiture: " + immatriculation + " " + marque + " " + modele);
        if (carteGrise != null) {
            carteGrise.afficher();
        }
    }
}
