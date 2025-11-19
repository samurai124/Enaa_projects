package Formes_Geometriques;

public class Rectangle extends Forme{
    private double hauteur ;
    private double largeur;
    public  Rectangle(double hauteur,double largeur){
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double calculerAire(){
        return largeur*hauteur;
    }
}