import AppClasses.Cours;
import AppClasses.Etudiant;
import AppClasses.Instructeur;

import java.util.*;
public class Systeme {
    static Scanner input = new Scanner(System.in);
    // menu
    public static int menu(){
        int choix = 0;
            System.out.print("1. Ajouter un étudiant \n2. Ajouter un instructeur \n3. Ajouter un cours \n4. Inscrire un étudiant à un cours \n5. Assigner un instructeur à un cours \n6. Afficher les détails d’un cours \n7. Quitter");
            System.out.print("Entrer un choix valide :");
        if (input.hasNextInt()) {
            choix = input.nextInt(); // safe to assign
        } else {
            System.out.println("That's not a valid integer!");
        }
        return  choix;
    }
    //  Ajouter un étudiant
    public static void ajouter_etudiant(ArrayList<Etudiant> etudiants){
        int id = 0;
        String nom;
        String email;
        System.out.print("`\nEntrer l'etudient id :");
        if (input.hasNextInt()){
            id = input.nextInt();
            input.nextLine();
        }else{
            input.nextLine();
            System.out.print("Invalid !!!");
            System.out.print("`\nEntrer l'etudient id :");
            id = input.nextInt();
            input.nextLine();
        }
        System.out.print("\nEntrer l'etudient nom :");
        nom = input.nextLine();
        System.out.print("\nEntrer l'etudient email :");
        email = input.nextLine();
        Etudiant e = new Etudiant(id,nom,email);
        etudiants.add(e);
        System.out.println("\netudient est ajouter avec success");


    }
    // Ajouter un instructeur
    public static void ajouter_instructeur(ArrayList<Instructeur> instructeurs){
        int id = 0;
        String nom;
        String specialisation;
        System.out.print("\nEntrer l'instructeur id :");
        if (input.hasNextInt()){
            id = input.nextInt();
            input.nextLine();
        }else{
            input.nextLine();
            System.out.print("\nInvalid !!!");
            System.out.println("\nEntrer l'instructeur id :");
            id = input.nextInt();
            input.nextLine();
        }
        System.out.println("\nEntrer l'instructeur nom :");
        nom = input.nextLine();
        System.out.println("\nEntrer l'instructeur specialisation :");
        specialisation = input.nextLine();
        Instructeur e = new Instructeur(id,nom,specialisation);
        instructeurs.add(e);
    }
    //  Ajouter un cours
    public static void ajouter_cours(ArrayList<Instructeur> instructeurs , ArrayList<Cours> cours){
        int id = 0;
        String titre;
        String description;
        int instructeur_id = 0;
        Instructeur instructeur = null;
        // id verrification
        System.out.println("Entrer le cours id :");
        if (input.hasNextInt()){
            id = input.nextInt();
            input.nextLine();
        }else{
            System.out.print("Invalid !!!");
            input.nextLine();
        }
        System.out.println("Entrer le cours  titre :");
        titre = input.nextLine();
        System.out.println("Entrer le description  titre :");
        description = input.nextLine();
        // Instructeur verrification
        System.out.println("Entrer l'instruteur  id :");
        if (input.hasNextInt()){
            id = input.nextInt();
        }else{
            System.out.print("Invalid !!!");
        }
        for(int i = 0; i < instructeurs.size();i++){
            if(instructeurs.get(i).instructorId == instructeur_id){
                instructeur = instructeurs.get(i);
            }
        }
        if (instructeur != null){
            Cours c = new Cours(id,titre,description,instructeur);
            cours.add(c);
            System.out.println("Cours est ajouter avec success");
        }else{
            System.out.println("Instructeur n'exist pas !!!");
        }
    }
    // 4. Inscrire un étudiant à un cours


    public static void main(String[] args) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        ArrayList<Instructeur> instructeurs = new ArrayList<>();
        ArrayList<Cours> cours = new ArrayList<>();

//        ajouter_etudiant(etudiants);
//        ajouter_etudiant(etudiants);
//        ajouter_etudiant(etudiants);
//        for (int i = 0 ; i < etudiants.size();i++){
//            int id = etudiants.get(i).studentId ;
//            System.out.println(id);
//        }
        ajouter_instructeur(instructeurs);
//        for (int i = 0 ; i < instructeurs.size();i++){
//            int id = instructeurs.get(i).instructorId ;
//            System.out.println(id);
//        }
        ajouter_cours(instructeurs,cours);

        for (int i = 0 ; i < instructeurs.size();i++){
            int id = instructeurs.get(i).instructorId ;
            System.out.println(id);
        }




    }
}