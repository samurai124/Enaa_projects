package Jeux_Video_Personnages;

public class Mage extends Personnage{
    public Mage(String nom,int pointsDeVie){
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer(Personnage t) {
        t.setPointsDeVie(t.getPointsDeVie() - 30);
        System.out.println("30 dammage !!!!!!");
    }
}
