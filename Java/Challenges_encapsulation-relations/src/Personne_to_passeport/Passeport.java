package Personne_to_passeport;

public class Passeport {
    private int numero;
    private String nationalite;
    private int dateExpiration;
    private Personne personne = null;
    public Passeport(int numero,String nationalite, int dateExpiration){
        this.numero = numero;
        this.nationalite = nationalite;
        this.dateExpiration = dateExpiration;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(int dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    public void afficherInfo(){
        System.out.printf("Numero : %d\nNationalite : %s\nDate Expiration : %d",numero,nationalite,dateExpiration);
        if (personne != null){
            System.out.println("Personne : "+personne.getNom());
        }
    }
}
