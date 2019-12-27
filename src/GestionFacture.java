import java.util.Vector;
public class GestionFacture {
	private Vector<DossierAdmin> Vector_DA=new Vector<DossierAdmin>();
	
	public void CalculeFacturePatient(int numPatient) throws Exception{
		double coutTotal =Vector_DA.elementAt(numPatient).CalculeCoutTotal();
		System.out.println("Id:" + numPatient + "\n Cout Total: " + coutTotal);
	}
}
