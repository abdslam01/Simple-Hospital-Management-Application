public class InterventionMedicale {
	private String DateInvention,Local;
	private TypeInvention TI;

	public InterventionMedicale(String dateIntervention,String Local,String typeIntervention, float coutIntervention) {
		DateInvention=dateIntervention;
		this.Local=Local;
		TI=new TypeInvention(coutIntervention,typeIntervention);
	}
	public float CalculCout() {
		return TI.getPrix();
	}
	public String getDateInvention() {
		return DateInvention;
	}
	public void setDateInvention(String dateInvention) {
		DateInvention = dateInvention;
	}
	public String getLocal() {
		return Local;
	}
	public void setLocal(String local) {
		Local = local;
	}
	public TypeInvention getTI() {
		return TI;
	}
	public void setTI(TypeInvention tI) {
		TI = tI;
	}
}
