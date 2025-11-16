package Étudiant_Certification;

public class Certification {
    private String titre;
    private String dateObtention;
    public Certification(String titre,String dateObtention){
        this.titre = titre;
        this.dateObtention = dateObtention;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }
}
