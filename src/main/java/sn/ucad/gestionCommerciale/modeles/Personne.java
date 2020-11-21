package sn.ucad.gestionCommerciale.modeles;
// default package
// Generated 4 oct. 2020 03:07:13 by Hibernate Tools 5.4.18.Final


public class Personne implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6861980429492565167L;

	private long id;
	

	private String nom;

	private String prenom;

	private String email;

	private String adesse;

	private String motPasse;

	private String login;

	private String datenaissance;

	private String lieunaissance;
	private String telephone;

	public Personne() {
	}

	public Personne(long id) {
		this.id = id;
	}

	public Personne(long id, String nom, String prenom, String email, String adesse, String datenaissance,
			String login, String lieunaissance, String telephone, String motPasse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adesse = adesse;
		this.datenaissance = datenaissance;
		this.login = login;
		this.lieunaissance = lieunaissance;
		this.telephone = telephone;
		this.motPasse = motPasse;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdesse() {
		return this.adesse;
	}

	public void setAdesse(String adesse) {
		this.adesse = adesse;
	}

	public String getDatenaissance() {
		return this.datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLieunaissance() {
		return this.lieunaissance;
	}

	public void setLieunaissance(String lieunaissance) {
		this.lieunaissance = lieunaissance;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMotPasse() {
		return this.motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Personne))
			return false;
		Personne castOther = (Personne) other;

		return (this.getId() == castOther.getId()) && ((this.getNom() == castOther.getNom())
				|| (this.getNom() != null && castOther.getNom() != null && this.getNom().equals(castOther.getNom())))
				&& ((this.getPrenom() == castOther.getPrenom()) || (this.getPrenom() != null
						&& castOther.getPrenom() != null && this.getPrenom().equals(castOther.getPrenom())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getAdesse() == castOther.getAdesse()) || (this.getAdesse() != null
						&& castOther.getAdesse() != null && this.getAdesse().equals(castOther.getAdesse())))
				&& ((this.getDatenaissance() == castOther.getDatenaissance())
						|| (this.getDatenaissance() != null && castOther.getDatenaissance() != null
								&& this.getDatenaissance().equals(castOther.getDatenaissance())))
				&& ((this.getLogin() == castOther.getLogin()) || (this.getLogin() != null
						&& castOther.getLogin() != null && this.getLogin().equals(castOther.getLogin())))
				&& ((this.getLieunaissance() == castOther.getLieunaissance())
						|| (this.getLieunaissance() != null && castOther.getLieunaissance() != null
								&& this.getLieunaissance().equals(castOther.getLieunaissance())))
				&& ((this.getTelephone() == castOther.getTelephone()) || (this.getTelephone() != null
						&& castOther.getTelephone() != null && this.getTelephone().equals(castOther.getTelephone())))
				&& ((this.getMotPasse() == castOther.getMotPasse()) || (this.getMotPasse() != null
						&& castOther.getMotPasse() != null && this.getMotPasse().equals(castOther.getMotPasse())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getNom() == null ? 0 : this.getNom().hashCode());
		result = 37 * result + (getPrenom() == null ? 0 : this.getPrenom().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getAdesse() == null ? 0 : this.getAdesse().hashCode());
		result = 37 * result + (getDatenaissance() == null ? 0 : this.getDatenaissance().hashCode());
		result = 37 * result + (getLogin() == null ? 0 : this.getLogin().hashCode());
		result = 37 * result + (getLieunaissance() == null ? 0 : this.getLieunaissance().hashCode());
		result = 37 * result + (getTelephone() == null ? 0 : this.getTelephone().hashCode());
		result = 37 * result + (getMotPasse() == null ? 0 : this.getMotPasse().hashCode());
		return result;
	}

}
