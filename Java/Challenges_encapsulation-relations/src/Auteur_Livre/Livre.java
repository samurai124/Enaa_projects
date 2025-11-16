package Auteur_Livre;

import java.util.ArrayList;

public class Livre {
    private String titre;
    private ArrayList<Auteur> auteurs = new ArrayList<>();

    public Livre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void ajouterAuteur(Auteur a){
        auteurs.add(a);
        System.out.printf("Livre %s est ajouter avec success",a.getNom());
    }
}
