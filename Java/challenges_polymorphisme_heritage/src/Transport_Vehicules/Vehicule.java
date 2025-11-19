package Transport_Vehicules;

public class Vehicule {
    private String marque;
    private int  modele;
    public Vehicule(String marque,int modele){
        this.marque = marque;
        this.modele = modele;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public int getModele() {
        return modele;
    }
    public void setModele(int modele) {
        this.modele = modele;
    }
    public void demarrer(){}
}
