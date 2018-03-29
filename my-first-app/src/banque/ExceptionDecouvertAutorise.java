package banque;

public class ExceptionDecouvertAutorise extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float decouvertNonAutorise ;
	private String message;
	public ExceptionDecouvertAutorise(float decouvertNonAutorise,String message) {
		super(message);
		this.decouvertNonAutorise = decouvertNonAutorise;
	}
	public float getDecouverNonAutorise() {
		return decouvertNonAutorise;
	}
	public String getCompte(Compte compte) {
		message="solde "+this.getDecouverNonAutorise()+" decouvert "+compte.getDecouvertAutorise();
		return message;
	}

	
	
}
