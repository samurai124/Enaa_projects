package Jeux_Video_Personnages;

public class Archer extends Personnage{
    public Archer(String nom,int pointsDeVie){
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer(Personnage t) {
        t.setPointsDeVie(t.getPointsDeVie() - 15);
        System.out.println("15 dammage !!!!!!");
    }
}
