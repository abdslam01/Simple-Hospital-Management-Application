public class Patient extends Personne{
	private static int PatientCount=0;
	private int numPatient;
	private String DateEnregistrement;
	private DossierAdmin dispose;
	
	public Patient(String Nom, String Prenom,String dateEnregistrement) {
		super(Nom,Prenom);
		DateEnregistrement = dateEnregistrement;
		numPatient=++PatientCount;
	}

	public int getNumPatient() {
		return numPatient;
	}

	public void setNumPatient(int numPatient) {
		this.numPatient = numPatient;
	}

	public String getDateEnregistrement() {
		return DateEnregistrement;
	}

	public void setDateEnregistrement(String dateEnregistrement) {
		DateEnregistrement = dateEnregistrement;
	}

	public DossierAdmin getDispose() {
		return dispose;
	}

	public void setDispose(DossierAdmin dispose) {
		this.dispose = dispose;
	}
	
}
