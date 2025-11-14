package Instructeur_Cours;

import java.util.ArrayList;

public class Instructeur {
    private int id;
    private String nom;
    private String specialisation;
    private ArrayList<Cours> coursEnseignes = new ArrayList<>();
    public Instructeur(int id , String nom , String specialisation){
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public ArrayList<Cours> getCoursEnseignes() {
        return coursEnseignes;
    }

    public void Ajoutercours(Cours cours) {
        this.coursEnseignes.add(cours);
    }

    public  void afficherCours(){
        for (Cours cours : coursEnseignes){
            System.out.println("Cours titre : "+cours.getTitre());
        }
    }
}
