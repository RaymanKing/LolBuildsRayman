package clases;

import java.util.ArrayList;

public class Heroe {

	// Atributos

	String nombre;
	String tipo;
	ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
	ArrayList<Debil> debiles = new ArrayList<Debil>();
	ArrayList<Fuerte> fuertes = new ArrayList<Fuerte>();
	ArrayList<Sinergia> sinergias = new ArrayList<Sinergia>();
	ArrayList<Runa> runas = new ArrayList<Runa>();
	ArrayList<Items> items = new ArrayList<Items>();

	// Constructores

	public Heroe() {
	}

	public Heroe(String nombre, String tipo, ArrayList<Habilidad> habilidades, ArrayList<Debil> debiles,
			ArrayList<Fuerte> fuertes, ArrayList<Sinergia> sinergias, ArrayList<Runa> runas, ArrayList<Items> items) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.habilidades = habilidades;
		this.debiles = debiles;
		this.fuertes = fuertes;
		this.sinergias = sinergias;
		this.runas = runas;
		this.items = items;
	}
	
	// Métodos
	
	private void addHabilidad(Habilidad habilidad) {}
	private void deleteHabilidad(Habilidad habilidad) {}
	private void addDebil(Debil debiles) {}
	private void deleteDebil(Debil debiles) {}
	private void addFuertes(Fuerte fuertes) {}
	private void deleteFuertes(Fuerte fuertes) {}
	private void addSinergias(Sinergia sinergias) {}
	private void deleteSinergias(Sinergia sinergias) {}
	public void votar(int voto) {}

}
