package clases;

public class Counters {

	// Atributos
	
	Heroe heroe = new Heroe();
	String copyright;
	String twitter;
	
	// Constructores
	
	public Counters() {}
	public Counters(Heroe heroe, String copyright, String twitter) {
		this.heroe = heroe;
		this.copyright = copyright;
		this.twitter = twitter;
	}
	
	// Métodos
	
	public void addHeroe(Heroe heroe) {}
	public void deleteHeroe(Heroe heroe) {}
	
}
