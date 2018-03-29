package helloworldapp;

public class Operation {
	public final static String debit = "DEBIT";
	public final static String credit ="CREDIT" ;
	private float montant;
	private String type;
	private Date date ;

	public Operation(String type,float montant) {
		this.date = new Date();
		
		if(type.compareTo(debit)==0) {
			this.type=debit;
			this.montant=montant*(-1);
		}else {
			this.type=credit;
			this.montant=montant;
		}
		
	}

	public String getDebit() {
		return debit;
	}
	public Date getDate() {
		return date;
	}
	public String getType() {
		return type;
	}
	public float getMontant() {
		return montant;
	}
	public String Visualiser() {
		return "Type "+this.getType()+" date "+date.getJour()+"/"+date.getMois()+"/"+date.getAnnee()+" montant : "+this.montant;
	}

	

	
}
