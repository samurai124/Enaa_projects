package Boutique_Produits;

public class ProduitAlimentaire extends Produit{
    public ProduitAlimentaire(String nom, double prix) {
        super(nom, prix);
    }

    @Override
    public void getPrixFinal() {
        double tax = 0.10;
        double prixFinal = getPrix() - (getPrix() * tax);
        System.out.println("Prix final apres la réduction  selon date d’expiration: "+ prixFinal);
    }
}
