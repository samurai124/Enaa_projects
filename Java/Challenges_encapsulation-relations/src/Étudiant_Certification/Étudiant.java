package Étudiant_Certification;

public class Étudiant {
    private int id;
    private String nom;
    Certification certification;
    public Étudiant(int id,String nom){
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
    public void attribuerCertification(Certification c){
        this.certification = c;
        System.out.println("Certification ajouter avec succes");
    }
    public void certificationinfo(){
        System.out.printf("Etudiant : %s\n",nom);
        System.out.printf("Certification titre  : %s\n",certification.getTitre());
    }
}
