package Model;


public class Joueur extends Character{
	
	private String nom;
	private String prenom;
	private int poidsMax;
	private int poidsActuel;
	private String dateNaissance;
	private String sexe;
	private String situationFamiliale;
	private String travailAnterieur;
	private String atout1, atout2, atout3;
	private String defaut1, defaut2, defaut3;
	
	private int pointsPoingFer;
	private int pointsForceFrappe;
	private int pointsArtillerieLourde;
	private int pointsReinsAcier;
	private int pointsPickpocket;
	private int pointsSensAffutes;
	private int pointsSerrurier;
	private int pointsExpertDemolition;
	private int pointsSniper;
	private int pointsRobustesse;
	private int pointsVitalite;
	private int pointsResistanceChimique;
	private int pointsAmphibie;
	private int pointsCannibale;
	private int pointsFanaCapsules;
	private int pointsGigolo;
	private int pointsChienAttaque;
	private int pointsAmiAnimaux;
	private int pointsIntimidation;
	private int pointsInfirmier;
	private int pointsArmurier;
	private int pointsForgeron;
	private int pointsPirateInformatique;
	private int pointsExpertRobotique;
	private int pointsModuleHightech;
	private int pointsPistolero;
	private int pointsCommando;
	private int pointsFurtivite;
	private int pointsMarchandSable;
	private int pointsCibleMouvante;
	private int pointsFarfouilleur;
	private int pointsSavantIdiot;
	
	
	
	public Joueur() {}

	
	public Joueur(int PointsVie, int PointsForce, int PointsPerception, int PointsEndurance, int PointsCharisme,
			int PointsIntelligence, int PointsAgilite, int PointsChance, String nom, String prenom, 
			int poidsMax, int poidsActuel, String dateNaissance,
			String sexe, String situationFamiliale, String travailAnterieur, String atout1, String atout2,
			String atout3, String defaut1, String defaut2, String defaut3, int pointsPoingFer, int pointsForceFrappe,
			int pointsArtillerieLourde, int pointsReinsAcier, int pointsPickpocket, int pointsSensAffutes,
			int pointsSerrurier, int pointsExpertDemolition, int pointsSniper, int pointsRobustesse, int pointsVitalite,
			int pointsResistanceChimique, int pointsAmphibie, int pointsCannibale, int pointsFanaCapsules,
			int pointsGigolo, int pointsChienAttaque, int pointsAmiAnimaux, int pointsIntimidation, int pointsInfirmier,
			int pointsArmurier, int pointsForgeron, int pointsPirateInformatique, int pointsExpertRobotique,
			int pointsModuleHightech, int pointsPistolero, int pointsCommando, int pointsFurtivite,
			int pointsMarchandSable, int pointsCibleMouvante, int pointsFarfouilleur, int pointsSavantIdiot) {
		super(PointsVie, PointsForce, PointsPerception, PointsEndurance, PointsCharisme, PointsIntelligence,
				PointsAgilite, PointsChance);
		this.nom = nom;
		this.prenom = prenom;
		this.setPoidsMax(poidsMax);
		this.setPoidsActuel(poidsActuel);
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.situationFamiliale = situationFamiliale;
		this.travailAnterieur = travailAnterieur;
		this.atout1 = atout1;
		this.atout2 = atout2;
		this.atout3 = atout3;
		this.defaut1 = defaut1;
		this.defaut2 = defaut2;
		this.defaut3 = defaut3;
		this.pointsPoingFer = pointsPoingFer;
		this.pointsForceFrappe = pointsForceFrappe;
		this.pointsArtillerieLourde = pointsArtillerieLourde;
		this.pointsReinsAcier = pointsReinsAcier;
		this.pointsPickpocket = pointsPickpocket;
		this.pointsSensAffutes = pointsSensAffutes;
		this.pointsSerrurier = pointsSerrurier;
		this.pointsExpertDemolition = pointsExpertDemolition;
		this.pointsSniper = pointsSniper;
		this.pointsRobustesse = pointsRobustesse;
		this.pointsVitalite = pointsVitalite;
		this.pointsResistanceChimique = pointsResistanceChimique;
		this.pointsAmphibie = pointsAmphibie;
		this.pointsCannibale = pointsCannibale;
		this.pointsFanaCapsules = pointsFanaCapsules;
		this.pointsGigolo = pointsGigolo;
		this.pointsChienAttaque = pointsChienAttaque;
		this.pointsAmiAnimaux = pointsAmiAnimaux;
		this.pointsIntimidation = pointsIntimidation;
		this.pointsInfirmier = pointsInfirmier;
		this.pointsArmurier = pointsArmurier;
		this.pointsForgeron = pointsForgeron;
		this.pointsPirateInformatique = pointsPirateInformatique;
		this.pointsExpertRobotique = pointsExpertRobotique;
		this.pointsModuleHightech = pointsModuleHightech;
		this.pointsPistolero = pointsPistolero;
		this.pointsCommando = pointsCommando;
		this.pointsFurtivite = pointsFurtivite;
		this.pointsMarchandSable = pointsMarchandSable;
		this.pointsCibleMouvante = pointsCibleMouvante;
		this.pointsFarfouilleur = pointsFarfouilleur;
		this.pointsSavantIdiot = pointsSavantIdiot;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSituationFamiliale() {
		return situationFamiliale;
	}

	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}

	public String getTravailAnterieur() {
		return travailAnterieur;
	}

	public void setTravailAnterieur(String travailAnterieur) {
		this.travailAnterieur = travailAnterieur;
	}

	public String getAtout1() {
		return atout1;
	}

	public void setAtout1(String atout1) {
		this.atout1 = atout1;
	}

	public String getAtout2() {
		return atout2;
	}

	public void setAtout2(String atout2) {
		this.atout2 = atout2;
	}

	public String getAtout3() {
		return atout3;
	}

	public void setAtout3(String atout3) {
		this.atout3 = atout3;
	}

	public String getDefaut1() {
		return defaut1;
	}

	public void setDefaut1(String defaut1) {
		this.defaut1 = defaut1;
	}

	public String getDefaut2() {
		return defaut2;
	}

	public void setDefaut2(String defaut2) {
		this.defaut2 = defaut2;
	}

	public String getDefaut3() {
		return defaut3;
	}

	public void setDefaut3(String defaut3) {
		this.defaut3 = defaut3;
	}

	public int getPointsPoingFer() {
		return pointsPoingFer;
	}

	public void setPointsPoingFer(int pointsPoingFer) {
		this.pointsPoingFer = pointsPoingFer;
	}
	
	public int getPointsForceFrappe() {
		return pointsForceFrappe;
	}

	public void setPointsForceFrappe(int pointsForceFrappe) {
		this.pointsForceFrappe = pointsForceFrappe;
	}

	public int getPointsArtillerieLourde() {
		return pointsArtillerieLourde;
	}

	public void setPointsArtillerieLourde(int pointsArtillerieLourde) {
		this.pointsArtillerieLourde = pointsArtillerieLourde;
	}

	public int getPointsReinsAcier() {
		return pointsReinsAcier;
	}

	public void setPointsReinsAcier(int pointsReinsAcier) {
		this.pointsReinsAcier = pointsReinsAcier;
	}

	public int getPointsPickpocket() {
		return pointsPickpocket;
	}

	public void setPointsPickpocket(int pointsPickpocket) {
		this.pointsPickpocket = pointsPickpocket;
	}

	public int getPointsSensAffutes() {
		return pointsSensAffutes;
	}

	public void setPointsSensAffutes(int pointsSensAffutes) {
		this.pointsSensAffutes = pointsSensAffutes;
	}

	public int getPointsSerrurier() {
		return pointsSerrurier;
	}

	public void setPointsSerrurier(int pointsSerrurier) {
		this.pointsSerrurier = pointsSerrurier;
	}

	public int getPointsExpertDemolition() {
		return pointsExpertDemolition;
	}

	public void setPointsExpertDemolition(int pointsExpertDemolition) {
		this.pointsExpertDemolition = pointsExpertDemolition;
	}

	public int getPointsSniper() {
		return pointsSniper;
	}

	public void setPointsSniper(int pointsSniper) {
		this.pointsSniper = pointsSniper;
	}

	public int getPointsRobustesse() {
		return pointsRobustesse;
	}

	public void setPointsRobustesse(int pointsRobustesse) {
		this.pointsRobustesse = pointsRobustesse;
	}

	public int getPointsVitalite() {
		return pointsVitalite;
	}

	public void setPointsVitalite(int pointsVitalite) {
		this.pointsVitalite = pointsVitalite;
	}

	public int getPointsResistanceChimique() {
		return pointsResistanceChimique;
	}

	public void setPointsResistanceChimique(int pointsResistanceChimique) {
		this.pointsResistanceChimique = pointsResistanceChimique;
	}

	public int getPointsAmphibie() {
		return pointsAmphibie;
	}

	public void setPointsAmphibie(int pointsAmphibie) {
		this.pointsAmphibie = pointsAmphibie;
	}

	public int getPointsCannibale() {
		return pointsCannibale;
	}

	public void setPointsCannibale(int pointsCannibale) {
		this.pointsCannibale = pointsCannibale;
	}

	public int getPointsFanaCapsules() {
		return pointsFanaCapsules;
	}

	public void setPointsFanaCapsules(int pointsFanaCapsules) {
		this.pointsFanaCapsules = pointsFanaCapsules;
	}

	public int getPointsGigolo() {
		return pointsGigolo;
	}

	public void setPointsGigolo(int pointsGigolo) {
		this.pointsGigolo = pointsGigolo;
	}

	public int getPointsChienAttaque() {
		return pointsChienAttaque;
	}

	public void setPointsChienAttaque(int pointsChienAttaque) {
		this.pointsChienAttaque = pointsChienAttaque;
	}

	public int getPointsAmiAnimaux() {
		return pointsAmiAnimaux;
	}

	public void setPointsAmiAnimaux(int pointsAmiAnimaux) {
		this.pointsAmiAnimaux = pointsAmiAnimaux;
	}

	public int getPointsIntimidation() {
		return pointsIntimidation;
	}

	public void setPointsIntimidation(int pointsIntimidation) {
		this.pointsIntimidation = pointsIntimidation;
	}

	public int getPointsInfirmier() {
		return pointsInfirmier;
	}

	public void setPointsInfirmier(int pointsInfirmier) {
		this.pointsInfirmier = pointsInfirmier;
	}

	public int getPointsArmurier() {
		return pointsArmurier;
	}

	public void setPointsArmurier(int pointsArmurier) {
		this.pointsArmurier = pointsArmurier;
	}

	public int getPointsForgeron() {
		return pointsForgeron;
	}

	public void setPointsForgeron(int pointsForgeron) {
		this.pointsForgeron = pointsForgeron;
	}

	public int getPointsPirateInformatique() {
		return pointsPirateInformatique;
	}

	public void setPointsPirateInformatique(int pointsPirateInformatique) {
		this.pointsPirateInformatique = pointsPirateInformatique;
	}

	public int getPointsExpertRobotique() {
		return pointsExpertRobotique;
	}

	public void setPointsExpertRobotique(int pointsExpertRobotique) {
		this.pointsExpertRobotique = pointsExpertRobotique;
	}

	public int getPointsModuleHightech() {
		return pointsModuleHightech;
	}

	public void setPointsModuleHightech(int pointsModuleHightech) {
		this.pointsModuleHightech = pointsModuleHightech;
	}

	public int getPointsPistolero() {
		return pointsPistolero;
	}

	public void setPointsPistolero(int pointsPistolero) {
		this.pointsPistolero = pointsPistolero;
	}

	public int getPointsCommando() {
		return pointsCommando;
	}

	public void setPointsCommando(int pointsCommando) {
		this.pointsCommando = pointsCommando;
	}

	public int getPointsFurtivite() {
		return pointsFurtivite;
	}

	public void setPointsFurtivite(int pointsFurtivite) {
		this.pointsFurtivite = pointsFurtivite;
	}

	public int getPointsMarchandSable() {
		return pointsMarchandSable;
	}

	public void setPointsMarchandSable(int pointsMarchandSable) {
		this.pointsMarchandSable = pointsMarchandSable;
	}

	public int getPointsCibleMouvante() {
		return pointsCibleMouvante;
	}

	public void setPointsCibleMouvante(int pointsCibleMouvante) {
		this.pointsCibleMouvante = pointsCibleMouvante;
	}

	public int getPointsFarfouilleur() {
		return pointsFarfouilleur;
	}

	public void setPointsFarfouilleur(int pointsFarfouilleur) {
		this.pointsFarfouilleur = pointsFarfouilleur;
	}

	public int getPointsSavantIdiot() {
		return pointsSavantIdiot;
	}

	public void setPointsSavantIdiot(int pointsSavantIdiot) {
		this.pointsSavantIdiot = pointsSavantIdiot;
	}


	public int getPoidsMax() {
		return poidsMax;
	}
	

	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}


	public int getPoidsActuel() {
		return poidsActuel;
	}


	public void setPoidsActuel(int poidsActuel) {
		this.poidsActuel = poidsActuel;
	}
	
}
