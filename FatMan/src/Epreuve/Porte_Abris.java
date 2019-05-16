package Epreuve;
import java.util.Scanner;

public class Porte_Abris {

	@SuppressWarnings("resource")
	public static void go() {

		boolean success = false;
		boolean success2 = false;
		int tentativesRestantes = 2;

		while (!success) {
			System.out.println("CODE OUVERTURE PORTE PRINCIPALE : ");
			Scanner sc = new Scanner(System.in);
			String entree = sc.nextLine();

			if(entree.equals("SPECIAL2")) {
				System.out.println("OUVERTURE DE LA PORTE");
				System.out.println("FERMETURE AUTOMATIQUE DANS 10 MINUTES");
				success = true;
			}

			else {
				System.out.println("CODE INCORRECT");
				System.out.println("TENTATIVES RESTANTES : "+tentativesRestantes);
				if(tentativesRestantes == 0) {
					System.out.println("VERROUILLAGE DU SYSTEME");
					System.out.println("MOT DE PASSE ADMINISTRATEUR REQUIS");

					while(!success2) {
						System.out.println("CODE ADMINISTRATEUR : ");
						Scanner sc2 = new Scanner(System.in);
						String entree2 = sc2.nextLine();

						if(entree2.equals("G572FT412")) {
							System.out.println("CODE OUVERTURE PORTE : SPECIAL2");
							success2 = true;
							tentativesRestantes = 4;
						}

						else {
							System.out.println("MOT DE PASSE ADMINISTRATEUR INCORRECT");
						}
					}

				}
				tentativesRestantes--;
			}

		}
	}
}
