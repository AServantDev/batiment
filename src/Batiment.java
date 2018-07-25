
public class Batiment {

	//Variables
	
	String materiaux;
	int nbEtages;
	int nbPieces;
	int annéeConstruction;
	String accesBatiment;
	int nbAscenceur;
	int habitant;
	double loyer;
	int nbOuvrier;
	
	boolean cour;
	boolean isHabite;
	boolean parking;
	boolean enRenovation;
	boolean cheminee;
	boolean balcon;
	boolean escalier;
	boolean ascenceur;
	String type;
	
	//Setters and getters
	public String getMateriaux() {
		return materiaux;
	}

	public void setMateriaux(String materiaux) {
		this.materiaux = materiaux;
	}

	public int getNbEtages() {
		return nbEtages;
	}

	public void setNbEtages(int nbEtages) {
		this.nbEtages = nbEtages;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	

	public int getAnnéeConstruction() {
		return annéeConstruction;
	}

	public void setAnnéeConstruction(int annéeConstruction) {
		this.annéeConstruction = annéeConstruction;
	}

	public String getAccesBatiment() {
		return accesBatiment;
	}

	public void setAccesBatiment(String accesBatiment) {
		this.accesBatiment = accesBatiment;
	}

	public int getNbAscenceur() {
		return nbAscenceur;
	}

	public void setNbAscenceur(int nbAscenceur) {
		this.nbAscenceur = nbAscenceur;
	}

	public int getHabitant() {
		return habitant;
	}

	public void setHabitant(int habitant) {
		this.habitant = habitant;
	}

	public double getLoyer() {
		return loyer;
	}

	public void setLoyer(double loyer) {
		this.loyer = loyer;
	}

	public int getNbOuvrier() {
		return nbOuvrier;
	}

	public void setNbOuvrier(int nbOuvrier) {
		this.nbOuvrier = nbOuvrier;
	}

	public boolean isCour() {
		return cour;
	}

	public void setCour(boolean cour) {
		this.cour = cour;
	}

	public boolean isHabite() {
		return isHabite;
	}

	public void setHabite(boolean isHabite) {
		this.isHabite = isHabite;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isEnRenovation() {
		return enRenovation;
	}

	public void setEnRenovation(boolean enRenovation) {
		this.enRenovation = enRenovation;
	}

	public boolean isCheminee() {
		return cheminee;
	}

	public void setCheminee(boolean cheminee) {
		this.cheminee = cheminee;
	}

	public boolean isBalcon() {
		return balcon;
	}

	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}

	public boolean isEscalier() {
		return escalier;
	}

	public void setEscalier(boolean escalier) {
		this.escalier = escalier;
	}

	public boolean isAscenceur() {
		return ascenceur;
	}

	public void setAscenceur(boolean ascenceur) {
		this.ascenceur = ascenceur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	//Méthodes
	
	void construireBatiment() {
		
	}
	
	void renoverBatiment() {}
	
	double louerBatiment() {
		
		System.out.println("Mon loyer de base est " + getLoyer() +"€");
		
		boolean c = isBalcon();
		boolean d = isParking();
		loyer = getLoyer();
		if((c == true) && (d == true)) {
			loyer = getLoyer() + 300; 
			System.out.println("J'ai un balcon et une place de parking"
					+ " donc mon loyer augmente de 300€, mon loyer est de " + loyer +"€");
			
		}else if(c == true)  {
			loyer = getLoyer() + 100;
			
			System.out.println("J'ai un balcon donc mon loyer augmente de 300€, mon loyer est de " + loyer +"€");
			
		}
		else if(d == true)  {
			loyer = getLoyer() + 200;
			
			System.out.println("J'ai un parking donc mon loyer augmente de 300€, mon loyer est de " + loyer +"€");
			
		}else {
			loyer = getLoyer();
			
		}return loyer;
	}
	
	void detruireBatiment() {}
	
}
