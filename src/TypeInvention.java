public class TypeInvention {
	private String Denomination, Specialite,typeIntervention;
	private float prix;
	
	public TypeInvention(float coutIntervention,String typeIntervention) {
		prix=coutIntervention;
		this.typeIntervention=typeIntervention;
	}

	public String getDenomination() {
		return Denomination;
	}

	public void setDenomination(String denomination) {
		Denomination = denomination;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	public String getTypeIntervention() {
		return typeIntervention;
	}

	public void setTypeIntervention(String typeIntervention) {
		this.typeIntervention = typeIntervention;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}
