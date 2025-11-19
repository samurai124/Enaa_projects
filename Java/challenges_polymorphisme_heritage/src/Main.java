import Animaux_Sons.Animal;
import Animaux_Sons.Chat;
import Animaux_Sons.Chien;
import Animaux_Sons.Vache;
import Banque_Comptes.CompteCourant;
import Boutique_Produits.Produit;
import Boutique_Produits.ProduitAlimentaire;
import Boutique_Produits.ProduitElectronique;
import Boutique_Produits.ProduitVestimentaire;
import Documents_Affichage.Document;
import Documents_Affichage.Image;
import Documents_Affichage.PDF;
import Documents_Affichage.Word;
import Employes_Salaires.Employe;
import Employes_Salaires.EmployeCommission;
import Employes_Salaires.EmployeHoraire;
import Employes_Salaires.Manager;
import Formes_Geometriques.Cercle;
import Formes_Geometriques.Forme;
import Formes_Geometriques.Rectangle;
import Formes_Geometriques.Triangle;
import Jeux_Video_Personnages.Archer;
import Jeux_Video_Personnages.Guerrier;
import Jeux_Video_Personnages.Mage;
import Jeux_Video_Personnages.Personnage;
import Notifications.EmailNotification;
import Notifications.Notification;
import Notifications.PushNotification;
import Notifications.SmsNotification;
import Paiement_Polymorphisme.Paiement;
import Paiement_Polymorphisme.PaiementCarte;
import Paiement_Polymorphisme.PaiementCash;
import Paiement_Polymorphisme.PaiementVirement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Forme[] formes = new Forme[4];
        formes[0] = new Cercle(5);
        formes[1] = new Rectangle(4, 6);
        formes[2] = new Cercle(2);
        formes[3] = new Triangle(10,6);

        for (Forme f : formes) {
            System.out.println("Aire = " + f.calculerAire());
        }
         */
        /*
        Employe[] employes = new Employe[4];
        employes[0] = new Employe("Hamza",1000);
        employes[1] = new EmployeHoraire("hamza",1000,10,100);
        employes[2] = new EmployeCommission("hamza",1000,10,100,50,0.10);
        employes[3] = new Manager("hamza",1000,10,100,500);
        for (Employe e : employes){
            System.out.println("Salaire = "+e.calculerSalaire());
        }

         */
        /*
        Animal[] animals = new Animal[3];
        animals[0] = new Chien();
        animals[1] = new Chat();
        animals[2] = new Vache();
        for (Animal i : animals){
            i.faireSon();
        }

         */
        /*
        CompteCourant c = new CompteCourant(1,1000,500);
        c.retirer(1000);
        c.retirer(300);
        c.retirer(500);

         */
        /*
        Paiement[] paiements = new Paiement[3];
        paiements[0] = new PaiementCarte(500, "1234-5678-9012-3456", "Hamza");
        paiements[1] = new PaiementCash(200, 250);
        paiements[2] = new PaiementVirement(1000, "FR12-3456", "MA78-9876");
        for (Paiement p : paiements) {
            p.effectuerPaiement(1000);
        }
         */
        /*
        Mage m1 = new Mage("player1",1000);
        Archer a1 = new Archer("player2",1000);
        Guerrier g1 = new Guerrier("player3",1000);

        m1.attaquer(a1);
        a1.afficherhelt();

        a1.attaquer(m1);
        m1.afficherhelt();

         */
        /*
        ArrayList<Notification> notis = new ArrayList<>();
        notis.add(new EmailNotification());
        notis.add(new PushNotification());
        notis.add(new SmsNotification());
        for (Notification n : notis){
            n.envoyer("USSR will rise again !!!!");
        }

         */
        /*
        Document[] docs = new Document[3];

        docs[0] = new PDF();
        docs[1] = new Word();
        docs[2] = new Image();

        for (Document d : docs) {
            d.afficher();
        }

         */
        ArrayList<Produit> produits = new ArrayList<>();

        produits.add(new ProduitElectronique("p1", 3000));
        produits.add(new ProduitAlimentaire("p2", 10));
        produits.add(new ProduitVestimentaire("p3", 150));

        for (Produit p : produits) {
            System.out.printf("%s : Prix final : ",p.getNom());
            p.getPrixFinal();
        }


    }
}
