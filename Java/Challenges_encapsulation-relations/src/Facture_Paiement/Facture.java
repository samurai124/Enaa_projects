package Facture_Paiement;

import java.util.ArrayList;

public class Facture {
    private int id;
    ArrayList<Paiement> paiements = new ArrayList<>();
    public Facture(int id){
        this.id= id;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void ajouterPaiement(Paiement p){
        paiements.add(p);
        System.out.println("Paiment ajouter avec success");
    }
    public void calculerTotalPaiements(){
        double total = 0;
        for(Paiement paiement : paiements){
            total += paiement.getMontant();
            System.out.printf("Paiment  : %.2f$\n",paiement.getMontant());
        }
        System.out.printf("Totale : %.2f$\n",total);
    }
}
