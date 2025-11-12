package AppClasses;

import java.util.ArrayList;

public class Etudiant {
    public int studentId;
    public String nom;
    public String email;
    public ArrayList<Cours> coursinscritList ;
    public Etudiant(int studentId,String nom,String email){
        this.studentId = studentId;
        this.nom = nom;
        this.email = email;
        this.coursinscritList = new ArrayList<>();
    }
    public  void inscrire(Cours cours){
        coursinscritList.add(cours);
        System.out.println("Course est ajouter avec succes");
    }
    public void afficherCourse(){
        for (int i = 0 ; i < coursinscritList.size();i++){
            System.out.println(coursinscritList.get(i));
        }
    }
    public void afficherinfo(){
        System.out.println(studentId);
        System.out.println(nom);
        System.out.println(email);
    }
}
