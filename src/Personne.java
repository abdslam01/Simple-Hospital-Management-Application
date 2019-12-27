public abstract class Personne {
	private String nom, prenom;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne() {
		this.nom = this.prenom = "";
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getFullName() {
		return this.nom+" "+this.prenom;
	}
}
