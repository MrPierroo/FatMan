package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import Model.Arme;
import Model.Joueur;

public class Chargement {

	
	public static ArrayList<Joueur> loadAllJoueurs() {
		String home = System.getProperty("user.home");
		String directoryJoueur = home + File.separator + "Documents" + File.separator + "ApocalyPunk" + File.separator + "Sauvegardes" + File.separator + "Joueurs";
		String extensionJoueur = ".txt";

		Collection<File> allFilesJoueur = getAllFiles(directoryJoueur, extensionJoueur);
		ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

		for(File fileJoueur : allFilesJoueur) {
			String[] attributes = read(fileJoueur);
			joueurs.add(createJoueur(attributes));
		}

		return joueurs;

	}
	
	public static ArrayList<Arme> loadAllArmes() {
		String home = System.getProperty("user.home");
		String directoryArme = home + File.separator + "Documents" + File.separator + "ApocalyPunk" + File.separator + "Sauvegardes" + File.separator + "Armes";
		String extensionArme = ".txt";

		Collection<File> allFilesArmes = getAllFiles(directoryArme, extensionArme);
		ArrayList<Arme> armes = new ArrayList<Arme>();

		for(File fileArme : allFilesArmes) {
			String[] attributes = read(fileArme);
			armes.add(createArme(attributes));
		}

		return armes;

	}

	
/**------------------------------------------------------------------------------------------------------
 * ---------------------------------------------- METHODES ----------------------------------------------
 * ------------------------------------------------------------------------------------------------------
 */	
	
	/**
	 * Trouver les fichiers recursivement
	 * @param file
	 * @param all
	 * @param extension
	 */
	private static void findFilesRecursively(File file, Collection<File> all, final String extension) {

		final File[] children = file.listFiles(new FileFilter() {
			public boolean accept(File f) {
				return f.getName().endsWith(extension) ;
			}}
				);
		if (children != null) {
			for (File child : children) {
				all.add(child);
				findFilesRecursively(child, all, extension);
			}
		}
	}

	private static Collection<File> getAllFiles(String directory, String extension) {

		final Collection<File> all = new ArrayList<File>();
		findFilesRecursively(new File(directory), all, extension);
		return all;

	}

	
	/**
	 * Lecture d'un fichier texte
	 * @param file
	 * @return
	 */
	private static String[] read(File file) {

		String[] resultat = new String[0];

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(file));
			String line;

			int compt = 0;
			while ((line = br1.readLine()) != null) {
				compt++;
			}

			br1.close();

			resultat = new String[compt*2];

			BufferedReader br2 = new BufferedReader(new FileReader(file));

			int i = 0;
			while ((line = br2.readLine()) != null) {
				int sep = line.indexOf("$");
				String nameOfAttribute = line.substring(0, sep);
				String valueOfAttribute = line.substring(sep+1, line.length());

				resultat[i] = nameOfAttribute;
				resultat[i+1] = valueOfAttribute;

				i = i+2;
			}

			br2.close();

		} 
		catch (IOException e) {}

		return resultat;
	}

/**------------------------------------------------------------------------------------------------------
 * ---------------------------------------------- CREATION ----------------------------------------------
 * ------------------------------------------------------------------------------------------------------
 */
	
	/**
	 * Section de creation de joueur
	 * @param attributes
	 * @return
	 */
	private static Joueur createJoueur(String[] attributes) {

		Joueur joueur = new Joueur();

		try {
			Field[] superFields = joueur.getClass().getSuperclass().getDeclaredFields();
			Field[] fields = joueur.getClass().getDeclaredFields();
			int i = 0;
			for (Field superField : superFields) {
				superField.setAccessible(true);
				if(superField.getType() == int.class) {
					superField.set(joueur, Integer.parseInt(attributes[i+1]));
				}
				else {
					superField.set(joueur, attributes[i+1]);
				}
				i = i+2;
			}

			for (Field field : fields) {
				field.setAccessible(true);
				if(field.getType() == int.class) {
					field.set(joueur, Integer.parseInt(attributes[i+1]));
				}
				else {
					field.set(joueur, attributes[i+1]);
				}
				i = i+2;
			}
		}

		catch (Exception e) {}

		return joueur;

	}
	
	/**
	 * Section de creation d'arme
	 * @param attributes
	 * @return
	 */
	private static Arme createArme(String[] attributes) {

		Arme arme = new Arme();

		try {
			Field[] fields = arme.getClass().getDeclaredFields();
			int i = 0;
			
			for (Field field : fields) {
				field.setAccessible(true);
				if(field.getType() == int.class) {
					field.set(arme, Integer.parseInt(attributes[i+1]));
				}
				else {
					field.set(arme, attributes[i+1]);
				}
				i = i+2;
			}
		}

		catch (Exception e) {}

		return arme;

	}


}
