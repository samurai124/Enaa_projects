import AppClasses.Cours;
import AppClasses.Etudiant;
import AppClasses.Instructeur;

import java.util.*;
public class Systeme {
    static Scanner input = new Scanner(System.in);
    // menu
    public static int menu(){
        int choix = 0;
        do {
            System.out.print("1. Ajouter un étudiant \n2. Ajouter un instructeur \n3. Ajouter un cours \n4. Inscrire un étudiant à un cours \n5. Assigner un instructeur à un cours \n6. Afficher les détails d’un cours \n7. Quitter");
            System.out.print("\nEntrer un choix valide :");
            if (input.hasNextInt()) {
                choix = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("That's not a valid integer!");
                input.nextLine();
            }
        }while (choix == 0);
        return  choix;
    }
    //  Ajouter un étudiant
    public static void ajouter_etudiant(ArrayList<Etudiant> etudiants){
        int id = 0;
        String nom;
        String email;
        do {
            System.out.print("`\nEntrer l'etudient id :");
            if (input.hasNextInt()) {
                id = input.nextInt();
                input.nextLine();
            } else {
                input.nextLine();
                System.out.print("Invalid !!!");
                System.out.print("`\nEntrer l'etudient id :");
                id = input.nextInt();
                input.nextLine();
            }
        }while (id == 0);
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
        do {
            if (input.hasNextInt()) {
                id = input.nextInt();
                input.nextLine();
            } else {
                input.nextLine();
                System.out.print("\nInvalid !!!");
                System.out.print("\nEntrer l'instructeur id :");
                id = input.nextInt();
                input.nextLine();
            }
        }while (id == 0);
        System.out.print("\nEntrer l'instructeur nom :");
        nom = input.nextLine();
        System.out.print("\nEntrer l'instructeur specialisation :");
        specialisation = input.nextLine();
        Instructeur e = new Instructeur(id,nom,specialisation);
        instructeurs.add(e);
        System.out.print("\nInstructeur est ajouter avec success\n");
    }
    //  Ajouter un cours
    public static void ajouter_cours(ArrayList<Cours> cours) {
        int id = 0;
        String titre;
        String description;
        do {
            System.out.print("\nEntrer le cours id :");
            if (input.hasNextInt()) {
                id = input.nextInt();
                input.nextLine();
            } else {
                System.out.print("\nInvalid !!!");
                input.nextLine();
            }
        }while (id == 0);
        System.out.print("\nEntrer le cours  titre :");
        titre = input.nextLine();
        System.out.print("\nEntrer le description  titre :");
        description = input.nextLine();
        Cours c = new Cours(id, titre, description);
        cours.add(c);
        System.out.print("\nCours est ajouter avec success");
    }
    // 4. Inscrire un étudiant à un cours
    public static void inscrire_etudiant(ArrayList<Etudiant> etudiants ,ArrayList<Cours> cours){
        int id = 0;
        Etudiant etudiant = null;
        int coursId = 0;
        Cours c = null;
        do {
            do {
                System.out.print("\nEntrer l'etudiant id :");
                if (input.hasNextInt()) {
                    id = input.nextInt();
                    input.nextLine();
                } else {
                    input.nextLine();
                    System.out.print("\nInvalid !!!");
                }
            }while (id == 0);
            for (int i = 0; i < etudiants.size(); i++) {
                if (etudiants.get(i).studentId == id) {
                    etudiant = etudiants.get(i);
                }
            }
            if (etudiant == null) {
                System.out.println("Etudiant n'exist pas !!!!");
            }
        }while (etudiant == null);
        do {
            do {
                System.out.print("\nEntrer le cours id :");
                if (input.hasNextInt()) {
                    coursId = input.nextInt();
                    input.nextLine();
                } else {
                    input.nextLine();
                    System.out.print("\nInvalid !!!");
                }
            }while (id == 0);
            for (int i = 0; i < cours.size(); i++) {
                if (cours.get(i).courseid == coursId) {
                    c = cours.get(i);
                }
            }
            if (c == null) {
                System.out.println("Cours n'exist pas !!!!");
            }
        }while (c == null);
        etudiant.inscrire(c);
        c.ajouterEtudiant(etudiant);
        System.out.printf("%s est inscrie a %s",etudiant.nom,c.titre);
    }
    //  Assigner un instructeur à un cours
    public static void Assigner_instructeur( ArrayList<Instructeur> instructeurs,ArrayList<Cours> cours){
        int cours_id = 0;
        Cours c = null;
        int instructeur_id = 0;
        Instructeur instructeur = null;
        do {
            do {
                System.out.print("\nEntrer l'instruteur  id :");
                if (input.hasNextInt()) {
                    instructeur_id = input.nextInt();
                    input.nextLine();
                } else {
                    input.nextLine();
                    System.out.print("\nInvalid !!!");
                }
            }while (instructeur_id == 0);
            for (int i = 0; i < instructeurs.size(); i++) {
                if (instructeurs.get(i).instructorId == instructeur_id) {
                    instructeur = instructeurs.get(i);
                }
            }
            if (instructeur == null ){
                System.out.println("\nInstructeur n'exist pas !!!");
            }
        }while (instructeur == null);
        do {
            do {
                System.out.print("\nEntrer le cours id :");
                if (input.hasNextInt()) {
                    cours_id = input.nextInt();
                    input.nextLine();
                } else {
                    input.nextLine();
                    System.out.print("\nInvalid !!!");
                }
            }while (cours_id == 0);
            for (int i = 0; i < cours.size(); i++) {
                if (cours.get(i).courseid == cours_id) {
                    c = cours.get(i);
                }
            }
            if (c == null) {
                System.out.println("\nCours n'exist pas !!!!");
            }
        }while (c == null);
        if(c.instructeur != null){
            System.out.print("\n le cours a déjà un instructeur !!! ");
        }else {
            instructeur.assignerCours(c);
            c.assignerInstructeur(instructeur);
        }
    }
    //  Afficher les détails d’un cours
    public static void afficher_cours_details(ArrayList<Cours> cours){
        int cours_id = 0;
        Cours c = null;
        do {
            do {
                System.out.print("\nEntrer l'id du cours : ");
                if (input.hasNextInt()) {
                    cours_id = input.nextInt();
                    input.nextLine();
                } else {
                    input.nextLine();
                    System.out.print("\nInvalide id !!!!");
                    cours_id = 0;
                }
            } while (cours_id == 0);
            for (int i = 0 ; i < cours.size();i++){
                if (cours.get(i).courseid == cours_id){
                    c = cours.get(i);
                }
            }
        }while(c == null);
        if(c != null){
            c.afficherDetails();
        }
    }
    // Système de Gestion de Cours
    public static void Systeme_Gestion_Cours(){
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        ArrayList<Instructeur> instructeurs = new ArrayList<>();
        ArrayList<Cours> cours = new ArrayList<>();
        int choice = 0;
        do {
            choice = menu();
            switch (choice){
                case 1 -> ajouter_etudiant(etudiants);
                case 2 -> ajouter_instructeur(instructeurs);
                case 3 -> ajouter_cours(cours) ;
                case 4 -> inscrire_etudiant( etudiants , cours);
                case 5 -> Assigner_instructeur( instructeurs,cours);
                case 6 -> afficher_cours_details(cours);
                case 7 -> System.out.println("ok");
            }
        }while (choice != 7);

    }

    public static void main(String[] args) {
        Systeme_Gestion_Cours();
    }
}