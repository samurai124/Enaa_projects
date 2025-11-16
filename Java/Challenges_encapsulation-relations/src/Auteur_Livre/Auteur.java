package Auteur_Livre;

import java.util.ArrayList;

public class Auteur {
    private String nom;
    private ArrayList<Livre> livresEcrits = new ArrayList<>();
    public  Auteur(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void ajouterLivre (Livre livre){
        livresEcrits.add(livre);
        System.out.printf("Livre %s est ajouter avec success",livre.getTitre());
    }
}
