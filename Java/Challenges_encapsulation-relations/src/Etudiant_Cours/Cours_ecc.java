package Etudiant_Cours;

import java.util.ArrayList;

public class Cours_ecc {
    private int id;
    private String titre;
    private ArrayList<Etudiant_ecc>  inscrits = new ArrayList<>();
    public Cours_ecc(int id , String titre){
        this.id = id;
        this.titre = titre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void ajouterEtudiant(Etudiant_ecc e){
        inscrits.add(e);
    }
    public void afficherEtudiants(){
        System.out.println("Cours : "+titre);
        for (Etudiant_ecc etudiant : inscrits){
            System.out.println("Etudiant : "+etudiant.getNom());
        }
    }

}
