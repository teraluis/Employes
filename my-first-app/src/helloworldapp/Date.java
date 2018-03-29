package helloworldapp;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
	private int annee;
	private int jour;
	private int jourDansSemaine;
	private int mois;
	
	public Date() {
		Calendar calendar = GregorianCalendar.getInstance();
		this.annee=calendar.get(Calendar.YEAR);
		this.jour=calendar.get(Calendar.DAY_OF_MONTH);
		this.mois=calendar.get(Calendar.MONTH);
	}

	public Date(int annee, int jour, int jourDansSemaine, int mois) {
		super();
		this.annee = annee;
		this.jour = jour;
		this.jourDansSemaine = jourDansSemaine;
		this.mois = mois;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + jour;
		result = prime * result + jourDansSemaine;
		result = prime * result + mois;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (annee != other.annee)
			return false;
		if (jour != other.jour)
			return false;
		if (jourDansSemaine != other.jourDansSemaine)
			return false;
		if (mois != other.mois)
			return false;
		return true;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getJourDansSemaine() {
		return jourDansSemaine;
	}

	public void setJourDansSemaine(int jourDansSemaine) {
		this.jourDansSemaine = jourDansSemaine;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}
	
}
