package Projet_Employe;

import java.util.ArrayList;

public class Employe {
    private String nom;
    private ArrayList<Projet> projets;

    public Employe(String nom) {
        this.nom = nom;
        this.projets = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Projet> getProjets() {
        return projets;
    }


    public void ajouterProjet(Projet p) {
        if (!projets.contains(p)) {
            projets.add(p);
            p.ajouterEmploye(this);
        }
    }

    public void afficherProjets() {
        System.out.println("Projets de " + nom + " :");
        for (Projet p : projets) {
            System.out.println("- " + p.getNom());
        }
    }
}
