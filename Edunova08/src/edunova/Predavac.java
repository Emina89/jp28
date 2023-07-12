package edunova;

public class Predavac extends Osoba{
	
private String iban;

public String getIban() {
	return iban;
}

public Predavac() {
	super();
}

public Predavac(int sifra, String ime, String prezime, String iban) {
	super(sifra, ime, prezime);
	this.iban = iban;
}

public void setIban(String iban) {
	this.iban = iban;
}

@Override
public void pozdravi() {
	// TODO Auto-generated method stub
	
}
}
