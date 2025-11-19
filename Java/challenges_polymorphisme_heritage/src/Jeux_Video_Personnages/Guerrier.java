package Jeux_Video_Personnages;

public class Guerrier extends Personnage{
    public Guerrier(String nom,int pointsDeVie){
        super(nom, pointsDeVie);
    }
    @Override
    public void attaquer(Personnage t) {
        t.setPointsDeVie(t.getPointsDeVie() - 20);
        System.out.println("20 dammage !!!!!!");
    }
}
