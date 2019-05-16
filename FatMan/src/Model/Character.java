package Model;

public class Character {
	
	private int pointsVie;
	private int pointsForce;
	private int pointsPerception;
	private int pointsEndurance;
	private int pointsCharisme;
	private int pointsIntelligence;
	private int pointsAgilite;
	private int pointsChance;
	
	public Character() {}
	
	public Character(int PointsVie, int PointsForce, int PointsPerception, int PointsEndurance, int PointsCharisme,
			int PointsIntelligence, int PointsAgilite, int PointsChance) {

		setPointsVie(PointsVie);
		setPointsForce(PointsForce);
		setPointsPerception(PointsPerception);
		setPointsEndurance(PointsEndurance);
		setPointsCharisme(PointsCharisme);
		setPointsIntelligence(PointsIntelligence);
		setPointsAgilite(PointsAgilite);
		setPointsChance(PointsChance);
		
	}

	public int getPointsVie() {
		return pointsVie;
	}

	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
	}

	public int getPointsForce() {
		return pointsForce;
	}

	public void setPointsForce(int pointsForce) {
		this.pointsForce = pointsForce;
	}

	public int getPointsPerception() {
		return pointsPerception;
	}

	public void setPointsPerception(int pointsPerception) {
		this.pointsPerception = pointsPerception;
	}

	public int getPointsEndurance() {
		return pointsEndurance;
	}

	public void setPointsEndurance(int pointsEndurance) {
		this.pointsEndurance = pointsEndurance;
	}

	public int getPointsCharisme() {
		return pointsCharisme;
	}

	public void setPointsCharisme(int pointsCharisme) {
		this.pointsCharisme = pointsCharisme;
	}

	public int getPointsIntelligence() {
		return pointsIntelligence;
	}

	public void setPointsIntelligence(int pointsIntelligence) {
		this.pointsIntelligence = pointsIntelligence;
	}

	public int getPointsAgilite() {
		return pointsAgilite;
	}

	public void setPointsAgilite(int pointsAgilite) {
		this.pointsAgilite = pointsAgilite;
	}

	public int getPointsChance() {
		return pointsChance;
	}

	public void setPointsChance(int pointsChance) {
		this.pointsChance = pointsChance;
	}
	
	
	
	
	
}
