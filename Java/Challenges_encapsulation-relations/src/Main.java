import Auteur_Livre.Auteur;
import Bibliotheque_livre.Bibliotheque;
//import Bibliotheque_livre.Livre;
import Commande_Produit.Commande;
import Commande_Produit.Produit;
import Etudiant_Cours.Etudiant_ecc;
import Etudiant_Cours.Cours_ecc;
import Auteur_Livre.Livre;
import Facture_Paiement.Facture;
import Facture_Paiement.Paiement;
import Projet_Employe.Employe;
import Projet_Employe.Projet;
import Étudiant_Certification.Certification;
import Étudiant_Certification.Étudiant;


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
        /* challenge 6 test
        Bibliotheque bibliotheque = new Bibliotheque("phanatsy");
        Livre livre1 = new Livre("LOTR","JRR tolkein",1255339);
        Livre livre2 = new Livre("GOT","JRR martin",152340);

        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);

        bibliotheque.afficherLivres();

         */
        /* challenge 7 test
        Livre livre1 = new Livre("LOTR");
        Auteur auteur1 = new Auteur("JRR MARTEIN");
        livre1.ajouterAuteur(auteur1);
        auteur1.ajouterLivre(livre1);
         */
        /* challenge 8 test
        Facture facture1 = new Facture(1);
        Paiement paiement1 = new Paiement(10.2,"10-10-2025");
        Paiement paiement2 = new Paiement(15.2,"10-01-2025");
        Paiement paiement3 = new Paiement(10.00,"2-08-2025");
        Paiement paiement4 = new Paiement(99.2,"11-01-2025");
        facture1.ajouterPaiement(paiement1);
        facture1.ajouterPaiement(paiement2);
        facture1.ajouterPaiement(paiement3);
        facture1.ajouterPaiement(paiement4);

        facture1.calculerTotalPaiements();

         */
        /* challenge 9 test
        Étudiant etudient = new Étudiant(1,"hamza");
        Certification certification = new Certification("java","10-11-2025");

        etudient.attribuerCertification(certification);
        etudient.certificationinfo();

         */
        // challenge 10 test
        Employe e1 = new Employe("Hamza");
        Employe e2 = new Employe("Sara");
        Projet p1 = new Projet("Site Web");
        Projet p2 = new Projet("Application Mobile");

        p1.ajouterEmploye(e1);
        p1.ajouterEmploye(e2);

        e1.ajouterProjet(p2);
        p1.afficherEmployes();
        p2.afficherEmployes();

        e1.afficherProjets();
        e2.afficherProjets();





    }
}