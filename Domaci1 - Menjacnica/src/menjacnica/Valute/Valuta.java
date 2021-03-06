package menjacnica.Valute;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String naziv, skracenica;
	private GregorianCalendar datum;
	private double prodajni, kupovni, srednji; // kurs
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException("Datum ne sme biti null!");
		
		this.datum = datum;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.equals(""))
			throw new RuntimeException("Unesite naziv valute!");
		
		this.naziv = naziv;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		if (skracenica == null || skracenica.equals(""))
			throw new RuntimeException("Unesite skraceni naziv valute!");
		
		this.skracenica = skracenica;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if (prodajni <= 0)
			throw new RuntimeException("Vrednost kursa mora biti pozitivna!");
		
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if (kupovni <= 0)
			throw new RuntimeException("Vrednost kursa mora biti pozitivna!");
		
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if (srednji <= 0)
			throw new RuntimeException("Vrednost kursa mora biti pozitivna!");
		
		this.srednji = srednji;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Valuta [Naziv=" + naziv + ", skracenica=" + skracenica + ", datum=" + datum + ", prodajni kurs=" + prodajni
				+ ", kupovni kurs=" + kupovni + ", srednji kurs=" + srednji + "]";
	}	
	
}
