package clases;

import java.util.ArrayList;

public class Sinergia extends Heroe{

	// Atributos
	
	int puntos;
	
	// Constructores
	
	public Sinergia() {}
	public Sinergia(String nombre, String tipo, ArrayList<Habilidad> habilidades, ArrayList<Debil> debiles,
			ArrayList<Fuerte> fuertes, ArrayList<Sinergia> sinergias, ArrayList<Runa> runas, ArrayList<Items> items, int puntos) {
		super(nombre,tipo,habilidades,debiles,fuertes,sinergias,runas,items);
		this.puntos = puntos;
	}
	
	// Métodos
	
	public void changeFoto() {}
	
}
