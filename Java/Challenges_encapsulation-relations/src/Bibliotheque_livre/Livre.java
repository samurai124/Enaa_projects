package Bibliotheque_livre;

public class Livre {
    private String titre;
    private String auteur;
    private int isbn;
    public Livre(String titre,String auteur,int isbn){
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
