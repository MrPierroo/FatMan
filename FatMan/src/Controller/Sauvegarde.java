package Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

import Model.Arme;
import Model.Joueur;

public class Sauvegarde {

	public static void saveObject(Object obj) {

		try {
			String home = System.getProperty("user.home");
			
			File ff = new File(home + File.separator + "Documents" + File.separator + "ApocalyPunk" + File.separator + "Sauvegardes" + obj.getClass().getName() + ".txt");
			
			if(obj.getClass() == Joueur.class) {
				ff = new File(home + File.separator + "Documents" + File.separator + "ApocalyPunk" + File.separator + "Sauvegardes" + File.separator + "Joueurs" + File.separator + ((Joueur) obj).getPrenom() + ".txt");
			}
			
			else if(obj.getClass() == Arme.class) {
				ff = new File(home + File.separator + "Documents" + File.separator + "ApocalyPunk" + File.separator + "Sauvegardes" + File.separator + "Armes" + File.separator + ((Arme) obj).getNom() + ".txt");
			}

			
			if(ff.exists() && !ff.isDirectory()) {
				ff.delete();
			}

			create(ff, obj);

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}


	/**------------------------------------------------------------------------------------------------------
	 * ---------------------------------------------- METHODES ----------------------------------------------
	 * ------------------------------------------------------------------------------------------------------
	 */	

	/**
	 * Creation des objets, un pour chaque fichier
	 * @param ff
	 * @param obj
	 */
	private static void create(File ff, Object obj) {
		try {
			ff.createNewFile();
			FileWriter ffw=new FileWriter(ff);

			String[] attributes = getAttributes(obj);

			if(attributes.length>0) {
				for(int i = 0 ; i<attributes.length ; i = i+2) {
					ffw.write(attributes[i]+"$"+attributes[i+1]);
					ffw.write("\n");
				}
			}

			ffw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Obtenir tous les attributs de l'objet
	 * @param obj
	 * @return
	 */
	private static String[] getAttributes(Object obj) {

		String[] resultat = new String[0];

		try {
			Field[] superFields = obj.getClass().getSuperclass().getDeclaredFields();
			Field[] fields = obj.getClass().getDeclaredFields();

			resultat = new String[superFields.length*2+fields.length*2];

			int i = 0;
			for (Field superField : superFields) {
				superField.setAccessible(true);
				resultat[i] = superField.getName();
				resultat[i+1] = String.valueOf(superField.get(obj));
				i = i+2;
			}
			for (Field field : fields) {
				field.setAccessible(true);
				resultat[i] = field.getName();
				resultat[i+1] = String.valueOf(field.get(obj));
				i = i+2;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return resultat;

	}

}
