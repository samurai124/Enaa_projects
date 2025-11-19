package Boutique_Produits;

public class ProduitElectronique extends Produit{

    public ProduitElectronique(String nom, double prix) {
        super(nom, prix);
    }

    @Override
    public void getPrixFinal() {
        System.out.println("Prox final apres  taxe écologique: "+ getPrix()+(getPrix()*0.20));
    }
}
