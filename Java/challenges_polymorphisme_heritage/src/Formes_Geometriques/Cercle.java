package Formes_Geometriques;

public class Cercle extends Forme{
    private double rayon;
    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    @Override
    public double calculerAire(){
        return   Math.PI * Math.pow(rayon,2);

    }
}
