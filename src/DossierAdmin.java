import java.util.Vector;
public class DossierAdmin {
	private final static float coutJournee = 1000;
	private String DateEnregistrement, DateSortie;
	private int lit;
	private Vector<InterventionMedicale> Vector_IM=new Vector<InterventionMedicale>();
	
	public DossierAdmin(int lit, String dateEnregistrement,String dateIntervention,String Local, String dateSortie,String typeIntervention, float coutIntervention) {
		this.lit=lit;
		DateEnregistrement=dateEnregistrement;
		DateSortie=dateSortie;
		Vector_IM.addElement(new InterventionMedicale(dateIntervention,Local,typeIntervention,coutIntervention));
	}
	public InterventionMedicale getInterventionMedicale(int position) {
		return (position<Vector_IM.size()) ? Vector_IM.elementAt(position):null;
	}
	public void setInterventionMedicale(InterventionMedicale A) {
		Vector_IM.addElement(A);
	}
	private long Date_To_Day(String Date) throws Exception{ //le nombre de jours retourner par cette méthode est approximative
		long jr= Integer.parseInt(Date.substring(0, 2)),
			mo=Integer.parseInt(Date.substring(3, 5)),
			an=Integer.parseInt(Date.substring(6, 10));
		return an*365 + mo*30 + jr;
	}
	public float CalculeCoutTotal() throws Exception{
		float sum=0;
		/*for(int i=0; i< Vector_IM.size();i++) {
			sum+=Vector_IM.elementAt(i).CalculCout() + coutJournee *(Date_To_Day(DateSortie)-Date_To_Day(DateEnregistrement));
		}*/
		for(InterventionMedicale I: Vector_IM) {
			sum+=I.CalculCout() + coutJournee *(Date_To_Day(DateSortie)-Date_To_Day(DateEnregistrement));
		}
		return sum;
	}
	public String getDateEnregistrement() {
		return DateEnregistrement;
	}
	public void setDateEnregistrement(String dateEnregistrement) {
		DateEnregistrement = dateEnregistrement;
	}
	public String getDateSortie() {
		return DateSortie;
	}
	public void setDateSortie(String dateSortie) {
		DateSortie = dateSortie;
	}
	public int getLit() {
		return lit;
	}
	public void setLit(int lit) {
		this.lit = lit;
	}
}
