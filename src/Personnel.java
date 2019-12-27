public abstract class Personnel extends Personne{
	private int NumEmp;
	private String DateEmp;
	
	public Personnel(String Nom, String Prenom,int NumEmp,String DateEmp) {
		super(Nom, Prenom);
		this.NumEmp = NumEmp;
		this.DateEmp = DateEmp;
	}
	public int getNumEmp() {
		return NumEmp;
	}
	public void setNumEmp(int numEmp) {
		NumEmp = numEmp;
	}
	public String getDateEmp() {
		return DateEmp;
	}
	public void setDateEmp(String dateEmp) {
		DateEmp = dateEmp;
	}
}
