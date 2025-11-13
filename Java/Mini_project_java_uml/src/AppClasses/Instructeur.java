package AppClasses;

import java.util.ArrayList;

public class Instructeur {
    public int instructorId;
    public String nom;
    public String specialisation;
    public ArrayList<Cours> coursEnseignes;
    public Instructeur(int instructorId, String nom,String specialisation){
        this.instructorId = instructorId;
        this.nom = nom ;
        this.specialisation = specialisation;
        coursEnseignes = new ArrayList<>();
    }
    public void assignerCours(Cours cours){
        coursEnseignes.add(cours);
        System.out.println("Instructeur est ajouter avec succes");
    }
    public void afficherCours(){
        System.out.printf("Instractor : %s\n",nom);
        for (int i = 0 ; i < coursEnseignes.size();i++){
            System.out.println("Cours : "+coursEnseignes.get(i).courseid);
        }
    }

}
