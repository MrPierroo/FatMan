package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Action.Combat;
import Model.Arme;
import Model.Joueur;
import Model.PNJ;

public class Main {
	
	static Joueur charlie = new Joueur();
	static Joueur enola = new Joueur();
	static Joueur walter = new Joueur();
	static Joueur zoya = new Joueur();

	public static void main(String[] args) {

		ArrayList<Joueur> joueurs = Chargement.loadAllJoueurs();
		ArrayList<Arme> armes = Chargement.loadAllArmes();

		for(Joueur joueur : joueurs) {
			switch (joueur.getPrenom()) {
			case "Charlie":
				charlie = joueur;
				break;
			case "Enola":
				enola = joueur;
				break;
			case "Walter":
				walter = joueur;
				break;
			case "Zoya":
				zoya = joueur;
				break;

			default:
				break;
			}
		}
		
		PNJ ennemi1 = new PNJ("Troll", 100, 5, 2, 5, 1, 3, 2, 3);
		PNJ ennemi2 = new PNJ("Troll", 100, 5, 2, 5, 1, 3, 2, 3);
		PNJ ennemi3 = new PNJ("Troll", 100, 5, 2, 5, 1, 3, 2, 3);
		
		Joueur persoJoueur = new Joueur(100, 5, 8, 5, 3, 4, 7, 2, "TestNom", "TestPrenom", 80, 20, "20/12/2019", "Homme", "Celib", "Codeur", "Prout1", "Prout2", "Prout3", "Aha1", "Aha2", "Aha3", 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 1, 4, 3, 2, 3, 2, 3, 1, 4, 3, 2, 3, 1, 5, 3, 5, 4, 5, 2, 1, 4, 2);
		
		boolean exit = false;
		while ((!Combat.isEnnemiDead(ennemi1) || !Combat.isEnnemiDead(ennemi2) || !Combat.isEnnemiDead(ennemi3)) && !exit) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("JOUEUR : ");
			String joueur = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("ENNEMI VISE : ");
			String ennemi = sc2.nextLine();
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("ARME CHOISIE : ");
			String arme = sc3.nextLine();
			
			Combat.attaquer(persoJoueur, ennemi1, armes.get(0), true);
		}
		

	}
	
	private static void saveAllJoueurs(ArrayList<Joueur> joueurs) {
		for(Joueur joueur : joueurs) {
			Sauvegarde.saveObject(joueur);
		}
	}


}
