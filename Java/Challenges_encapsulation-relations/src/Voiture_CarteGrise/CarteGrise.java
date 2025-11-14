package Voiture_CarteGrise;

public class CarteGrise {
    private String numero;
    private String dateEmission;
    private Voiture voiture;
    public CarteGrise(String numero, String dateEmission) {
        this.numero = numero;
        this.dateEmission = dateEmission;
    }
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
    public void afficher() {
        System.out.println("Carte Grise: " + numero + " | Date: " + dateEmission);
    }
}
