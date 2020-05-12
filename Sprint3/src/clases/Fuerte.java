package clases;

import java.util.ArrayList;

public class Fuerte extends Heroe{

	// Atributos
	
	int puntos;
	
	// Constructores
	
	public Fuerte() {}
	public Fuerte(String nombre, String tipo, ArrayList<Habilidad> habilidades, ArrayList<Debil> debiles,
			ArrayList<Fuerte> fuertes, ArrayList<Sinergia> sinergias, ArrayList<Runa> runas, ArrayList<Items> items, int puntos) {
		super(nombre,tipo,habilidades,debiles,fuertes,sinergias,runas,items);
		this.puntos = puntos;
	}
	
	// Métodos
	
	public void changeFoto() {}
	
}
