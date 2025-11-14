package Commande_Produit;

import java.util.ArrayList;

public class Commande {
    private int id;
    ArrayList<Produit> produits = new ArrayList<>();
    public Commande(int id){
        this.id = id;
    }
    public void ajouterProduit(Produit p){
        produits.add(p);
    }
    public void calculerTotal(){
        double totale = 0;
        for (Produit produit : produits){
            totale += produit.getPrixUnitaire();
            System.out.println("Produit : "+produit.getNom()+" : "+produit.getPrixUnitaire()+"$");
        }
        System.out.printf("Le prix totale est : %.2f",totale);
    }
}
