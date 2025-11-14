package Personne_to_passeport;

public class Personne {
    private String nom;
    private int age;
    private Passeport passeport = null;
    public Personne(String nom , int age){
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passeport getPasseport() {
        return passeport;
    }

    public void setPasseport(Passeport passeport) {
        this.passeport = passeport;
    }
    public void afficher(){
        System.out.printf("Nom : %s\nAge : %d\n",nom,age);
        if(passeport != null){
            System.out.println("Passeport numero : "+passeport.getNumero());
        }
    }

}
