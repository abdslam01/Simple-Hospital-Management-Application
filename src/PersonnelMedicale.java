import java.util.Vector;
public class PersonnelMedicale extends Personnel{
	private String Specialite;
	private Vector<InterventionMedicale> responsable=new Vector<InterventionMedicale>();
	
	public PersonnelMedicale(String Nom, String Prenom, int NumEmp,String DateEmp,String Specialite) {
		super(Nom, Prenom, NumEmp, DateEmp);
		this.Specialite=Specialite;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	public String getResponsable() {
		String tmp="DATEINTERVENTION	LOCAL		TYPEINTERVENTION\n";
		if(responsable.size()!=0)
			for(InterventionMedicale A: responsable) {
				tmp+=A.getDateInvention()+"		"+A.getLocal()+"	"+A.getTI().getTypeIntervention()+"\n";
			}
		else {
			tmp+="None			None		None\n";
		}
		return tmp;
	}

	public void setResponsable(InterventionMedicale responsable) {
		this.responsable.addElement(responsable);
		//Specialite=this.responsable.elementAt(0).getTI().getSpecialite();
	}
	
}
