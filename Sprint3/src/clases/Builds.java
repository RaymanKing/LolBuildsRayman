package clases;

public class Builds {

	// Atributos
	
	Heroe heroe = new Heroe();
	String copyright;
	String twitter;
	
	// Constructores
	
	public Builds() {}
	public Builds(Heroe heroe, String copyright, String twitter) {
		this.heroe = heroe;
		this.copyright = copyright;
		this.twitter = twitter;
	}
	
	// Métodos
	
	public void addHeroe(Heroe heroe) {}
	public void deleteHeroe(Heroe heroe) {}
	
}
