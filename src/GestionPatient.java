import java.util.Vector;
public class GestionPatient {
	private Vector<Patient> Patients;
	
    public GestionPatient(){
    	Patients = new Vector<Patient>();
    }
	public Patient getPatient(int numPatient) {
		if(numPatient>Patients.size()-1) return null; 
		return Patients.elementAt(numPatient);
	}
	public DossierAdmin getDossierAdmin(Patient P) {
		return P.getDispose();
	}
	public void addPatient(Patient P) {
		Patients.addElement(P);
	}
	public void deletePatient(int i) {
		if(i<Patients.size())
			Patients.remove(i);
	}
}
