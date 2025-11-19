package Boutique_Produits;

public class ProduitVestimentaire extends Produit{
    public ProduitVestimentaire(String nom, double prix) {
        super(nom, prix);
    }

    @Override
    public void getPrixFinal() {
        double remise = getPrix() * 0.30;
        double prixfinale = getPrix() - remise;
        System.out.println("Prix final apres la remise saisonnière : " + prixfinale);
    }
}
