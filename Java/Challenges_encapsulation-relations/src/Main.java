import Commande_Produit.Commande;
import Commande_Produit.Produit;
import Etudiant_Cours.Etudiant_ecc;
import Etudiant_Cours.Cours_ecc;


public class Main{
    void main(){
        /* challenge 1 test
        Personne personne = new Personne("Hamza",21);
        Passeport passeport = new Passeport(14323,"spanish",2030);
        personne.setPasseport(passeport);
        passeport.setPersonne(personne);
        personne.afficher();
        passeport.afficherInfo();
         */
        /* challenge 2 test
        Instructeur instructeur = new Instructeur(1,"hamza","web");
        Cours cours1 = new Cours(1,"php","php basics");
        Cours cours2 = new Cours(2,"python","python basics");
        Cours cours3 = new Cours(3,"java","java basics");
        Cours cours4 = new Cours(1,"html","html basics");
        instructeur.Ajoutercours(cours1);
        instructeur.Ajoutercours(cours2);
        instructeur.Ajoutercours(cours3);
        instructeur.Ajoutercours(cours4);
        instructeur.afficherCours();
         */
        /* challenge 3 test
        Cours_ecc cours1 = new Cours_ecc(1,"java");
        Cours_ecc cours2 = new Cours_ecc(2,"js");
        Cours_ecc cours3 = new Cours_ecc(3,"c++");

        Etudiant_ecc etudiant1 = new Etudiant_ecc(1,"hamza");
        Etudiant_ecc etudiant2 = new Etudiant_ecc(2,"beder");
        Etudiant_ecc etudiant3 = new Etudiant_ecc(3,"naser");

        etudiant1.Addcours(cours1);
        cours1.ajouterEtudiant(etudiant1);

        etudiant1.Addcours(cours2);
        cours1.ajouterEtudiant(etudiant2);

        etudiant1.Addcours(cours3);
        cours1.ajouterEtudiant(etudiant3);

        cours1.afficherEtudiants();
        etudiant1.AfficherCours();
         */
        /* Challenge 4 test
        Produit produit1 = new Produit("produit1",17.4,5);
        Produit produit2 = new Produit("produit2",20.4,3);
        Produit produit3 = new Produit("produit3",15.4,9);
        Produit produit4 = new Produit("produit4",9.4,4);


        Commande commande = new Commande(1);
        commande.ajouterProduit(produit1);
        commande.ajouterProduit(produit2);
        commande.ajouterProduit(produit3);
        commande.ajouterProduit(produit4);

        commande.calculerTotal();
         */



    }
}