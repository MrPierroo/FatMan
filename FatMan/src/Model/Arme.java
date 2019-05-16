package Model;

public class Arme {

	private String nom;
	private String munition;
	private int quantiteMunitions;
	private String type;
	private int amelioration;
	private int distance;
	private int degat;
	private int perimetre;
	private int poids;
	
	
	public Arme() {}
	
	public Arme(String nom, String munition, int quantiteMunitions, String type, int amelioration, int distance, int degat, int perimetre, int poids) {
		super();
		this.nom = nom;
		this.munition = munition;
		this.setQuantiteMunitions(quantiteMunitions);
		this.setType(type);
		this.amelioration = amelioration;
		this.distance = distance;
		this.degat = degat;
		this.perimetre = perimetre;
		this.poids = poids;
	}

	public int getAmelioration() {
		return amelioration;
	}
	public void setAmelioration(int amelioration) {
		this.amelioration = amelioration;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDegat() {
		return degat;
	}
	public void setDegat(int degat) {
		this.degat = degat;
	}
	public int getPerimetre() {
		return perimetre;
	}
	public void setPerimetre(int perimetre) {
		this.perimetre = perimetre;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMunition() {
		return munition;
	}

	public void setMunition(String munition) {
		this.munition = munition;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantiteMunitions() {
		return quantiteMunitions;
	}

	public void setQuantiteMunitions(int quantiteMunitions) {
		this.quantiteMunitions = quantiteMunitions;
	}
	
}
