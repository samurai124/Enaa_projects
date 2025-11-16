package Bibliotheque_livre;

import java.util.ArrayList;

public class Bibliotheque {
    private String nom;
    ArrayList<Livre> livres = new ArrayList<>();
    public Bibliotheque(String nom){
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void ajouterLivre(Livre livre){
        livres.add(livre);
        System.out.printf("Livre %s est ajouter avec success \n",livre.getTitre());
    }
    public void supprimerLivre(Livre livre){
        for (Livre l : livres){
            if (l == livre){
                livres.remove(l);
            }
        }
        System.out.printf("Livre %s est supprimer avec success \n",livre.getTitre());
    }
    public void afficherLivres(){
        System.out.printf("La bibliotheque %s contient : \n",nom);
        for (Livre live : livres){
            System.out.printf("Livre : %s\n",live.getTitre());
        }
    }
}
