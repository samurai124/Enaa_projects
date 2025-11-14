package Etudiant_Cours;

import Instructeur_Cours.Cours;


import java.util.ArrayList;

public class Etudiant_ecc {
    private int id;
    private String nom;
    private ArrayList<Cours_ecc> coursSuivis = new ArrayList<>();
    public Etudiant_ecc(int id, String nom){
        this.id = id;
        this.nom = nom;
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
    public void Addcours(Cours_ecc c){
        coursSuivis.add(c);
    }
    public void AfficherCours(){
        System.out.println("Etudiant : "+nom);
        for (Cours_ecc cours : coursSuivis){
            System.out.println("Cours : "+cours.getTitre());
        }
    }
}
