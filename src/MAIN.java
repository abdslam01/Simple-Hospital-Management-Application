public class MAIN{
	public static void main(String[] args) throws Exception{
		PersonnelMedicale chirugien=new PersonnelMedicale("Lname","Fname",2,"15/01/1999","pneumopathie");
		
		Patient P1=new Patient("A","Ali","12/10/2001");
		DossierAdmin D1=new DossierAdmin(25,"12/10/2001","20/10/2001","Hopital Souss","30/10/2001","opération chirurgicale",5000);
		P1.setDispose(D1);
		
		Patient P2=new Patient("A","Ali","12/10/2001");
		DossierAdmin D2=new DossierAdmin(30,"12/01/2002","10/02/2002","Hopital Souss","30/02/2002","Dialyse",4500);
		P2.setDispose(D2);
		
		chirugien.setResponsable(P1.getDispose().getInterventionMedicale(0));
		chirugien.setResponsable(P2.getDispose().getInterventionMedicale(0));
		
		System.out.println(chirugien.getResponsable());
		System.out.println(P2.getDispose().CalculeCoutTotal());
		System.out.println(P1.getNumPatient());
	}
}
