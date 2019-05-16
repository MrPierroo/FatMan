package Action;

import java.util.Scanner;

import Model.Arme;
import Model.Joueur;
import Model.PNJ;

public class Combat {

	public static void attaquer(Joueur joueur, PNJ ennemi, Arme arme, boolean enFace) {
		
		System.out.println("ATTAQUE "+joueur.getPrenom()+" CONTRE "+ennemi.getType()+" AVEC "+arme.getNom()+" ...");
		System.out.println();
		System.out.println("FORCE DE FRAPPE SUIVANT STATS JOUEUR ET ARME :");
		int[] resultFF = forceFrappe(joueur, arme, enFace);
		System.out.println("FORCE PURE : "+resultFF[0]);
		System.out.println("BONUS DE DEGATS : "+resultFF[1]+"%");
		System.out.println("CONDITION COUP CRITIQUE : "+resultFF[2]);
		
		System.out.println("");
		System.out.println("ATTAQUE EN COURS...");
		System.out.println("SCORE JET DE 20 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score<=20) {
			int resultA = calculDegats(score, resultFF, ennemi);
			System.out.println("DEGATS : "+resultA);
			System.out.println("POINTS DE VIE ENNEMI : "+(ennemi.getPointsVie()-resultA));
			ennemi.setPointsVie(ennemi.getPointsVie()-resultA);
		}
		
		else {
			System.out.println("SCORE NON ACCEPTE");
		}
		
	}
	
	private static int[] forceFrappe(Joueur joueur, Arme arme, boolean enFace) {
		
		int[] resultat = {0,0,20}; //forcePure, bonusForce, coupCritique
		int coupCritique = 20;
		
		String typeArme = arme.getType();		
		int forcePure = 0;
		forcePure += joueur.getPointsForce();
		
		if(typeArme.equals("Poing")) forcePure += 1;
		
		if(typeArme.equals("Lourde")) {
			forcePure += 1;
		}
		
		int bonusForce = 0;
		switch (typeArme) {
		case "Poing":
			switch (joueur.getPointsPoingFer()) {
			case 1:
				bonusForce += 20;
				break;
			case 2:
				bonusForce += 40;
				break;
			case 3:
				bonusForce += 60;
				break;
			case 4:
				bonusForce += 60;
				coupCritique = 19;
				break;
			case 5:
				bonusForce += 60;
				coupCritique = 18;
				break;
			default:
				break;
			}
			break;
		case "CorpsACorps":
			switch (joueur.getPointsForceFrappe()) {
			case 1:
				bonusForce += 20;
				break;
			case 2:
				bonusForce += 40;
				break;
			case 3:
				if(enFace) bonusForce += 60;
				else bonusForce += 40;
				break;
			case 4:
				if(enFace) bonusForce += 80;
				else bonusForce += 40;
				break;
			case 5:
				if(enFace) bonusForce += 80;
				else bonusForce += 40;
				coupCritique = 19;
				break;
			default:
				break;
			}
		case "Lourde":
			switch (joueur.getPointsArtillerieLourde()) {
			case 1:
				bonusForce += 20;
				break;
			case 2:
				bonusForce += 40;
				break;
			case 3:
				bonusForce += 40;
				forcePure += 1;
				break;
			case 4:
				bonusForce += 40;
				coupCritique = 19;
				break;
			case 5:
				bonusForce += 80;
				coupCritique = 18;
				break;

			default:
				break;
			}
		case "Distance":
			switch (joueur.getPointsSniper()) {
			case 1:
				bonusForce += 20;
				break;
			case 2:
				bonusForce += 40;
				break;
			case 3:
				bonusForce += 40;
				break;
			case 4:
				bonusForce += 40;
				coupCritique = 19;
				break;
			case 5:
				bonusForce += 80;
				coupCritique = 19;
				break;

			default:
				break;
			}
		case "NonAuto":
			switch (joueur.getPointsPistolero()) {
			case 1:
				bonusForce += 20;
				break;
			case 2:
				bonusForce += 40;
				break;
			case 3:
				bonusForce += 60;
				break;
			case 4:
				bonusForce += 80;
				break;
			case 5:
				bonusForce += 80;
				break;
				
			default:
				break;
			}
		case "Auto":
			switch (joueur.getPointsCommando()) {
			case 1:
				bonusForce += 20;
				break;
			case 2:
				bonusForce += 40;
				break;
			case 3:
				bonusForce += 60;
				break;
			case 4:
				bonusForce += 80;
				break;
			case 5:
				bonusForce += 80;
				break;

			default:
				break;
			}
		case "Silencieux":
			switch (joueur.getPointsMarchandSable()) {
			case 1:
				bonusForce += 20;
				break;
			case 2:
				bonusForce += 40;
				break;
			case 3:
				bonusForce += 60;
				break;
			case 4:
				bonusForce += 80;
				break;
			case 5:
				bonusForce += 80;
				break;

			default:
				break;
			}
		default:
			break;
		}
		
		resultat[0] = forcePure;
		resultat[1] = bonusForce;
		resultat[2] = coupCritique;
		
		return resultat;
		
	}
	
	private static int resistanceEnnemie(PNJ ennemi) {
		return ennemi.getPointsEndurance()*5 + ennemi.getPointsAgilite()*2 + ennemi.getPointsForce()*3 + (int) ennemi.getPointsVie()/2;
	}
	
	private static int calculDegats(int score, int[] forceFrappe, PNJ ennemi) {
		
		int resultat = 0;
		
		int forcePure = forceFrappe[0];
		int bonusForce = forceFrappe[1];
		int coupCritique = forceFrappe[2];
		
		int defenseEnnemi = resistanceEnnemie(ennemi);
		
		if(score >= coupCritique) {
			bonusForce = bonusForce*5;
			score += 10;
		}
		
		int degats = forcePure*10 + score*5;
		
		if(bonusForce>0) degats = degats*(1+bonusForce/200);
		
		if(degats - defenseEnnemi > 0) {
			resultat = degats - defenseEnnemi;
		}
		
		return resultat;
	}

	public static boolean isEnnemiDead(PNJ ennemi) {
		if(ennemi.getPointsVie()<=0) return true;
		return false;
	}
}
