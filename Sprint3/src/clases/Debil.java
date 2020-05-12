package clases;

import java.util.ArrayList;

public class Debil extends Heroe{

	// Atributos
	
	// Aqui estaria la foto pero nose como añadirla como pasara en los siguientes casos de las clases sinergias, fuertes, etc
	
	int puntos;
	
	// Constructores
	
	public Debil() {}
	public Debil(String nombre, String tipo, ArrayList<Habilidad> habilidades, ArrayList<Debil> debiles,
			ArrayList<Fuerte> fuertes, ArrayList<Sinergia> sinergias, ArrayList<Runa> runas, ArrayList<Items> items, int puntos) {
		super(nombre, tipo, habilidades, debiles, fuertes, sinergias, runas, items);
		this.puntos = puntos;
	}
	
	// Métodos
	
	public void changeFoto() {}
	public void changeNombre() {}
	
}
