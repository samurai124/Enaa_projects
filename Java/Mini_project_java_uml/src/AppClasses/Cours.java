package AppClasses;
import java.util.ArrayList;

public class Cours {
    public int courseid;
    public String titre;
    public String description;
    public Instructeur instructeur;
    public ArrayList<Etudiant> etudiants;
    public  Cours(int courseid, String titre, String description, Instructeur instructeur){
        this.courseid = courseid;
        this.titre = titre;
        this.description = description;
        this.instructeur = instructeur;
        etudiants = new ArrayList<>();
    }
    public void ajouterEtudiant(Etudiant etudiant){
        etudiants.add(etudiant);
        System.out.println("Etudient est ajouter avec succes");
    }
    public void assignerInstructeur(Instructeur instructeur){
        this.instructeur = instructeur;
        System.out.println("Instructeur est ajouter avec success");
    }
    public void afficherDetails(){
        System.out.printf("Cours id : %d \n Cours titre : %s\nCours description : %S\n Cours assigne par %s\n",courseid,titre,description);
        for (int i = 0 ; i < etudiants.size();i++){
            System.out.println("Student : "+etudiants.get(i).studentId);
        }
    }

}
