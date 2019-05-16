package Model;

public class PNJ extends Character{

	private String type;
	
	public PNJ(String Type, int PointsVie, int PointsForce, int PointsPerception, int PointsEndurance, int PointsCharisme,
			int PointsIntelligence, int PointsAgilite, int PointsChance) {
		super(PointsVie, PointsForce, PointsPerception, PointsEndurance, PointsCharisme, PointsIntelligence, PointsAgilite,
				PointsChance);
		
		this.type = Type;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
