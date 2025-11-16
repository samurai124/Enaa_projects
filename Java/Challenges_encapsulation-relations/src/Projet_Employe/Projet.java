package Projet_Employe;
import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    private List<Employe> equipe;

    public Projet(String nom) {
        this.nom = nom;
        this.equipe = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Employe> getEquipe() {
        return equipe;
    }


    public void ajouterEmploye(Employe e) {
        if (!equipe.contains(e)) {
            equipe.add(e);
            e.ajouterProjet(this);
        }
    }

    public void afficherEmployes() {
        System.out.println("Employés du projet " + nom + " :");
        for (Employe e : equipe) {
            System.out.println("- " + e.getNom());
        }
    }
}