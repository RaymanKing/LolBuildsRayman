package clases;

import java.util.ArrayList;

public class Habilidad extends Heroe{

	// Atributo
	
	String descripcion;
	// Mediumblob video; No encuentro la forma de añadir un video sin tener que añadir un action listener
	
	// Constructores
	
	public Habilidad() {}
	public Habilidad(String nombre, String tipo, ArrayList<Habilidad> habilidades, ArrayList<Debil> debiles,
			ArrayList<Fuerte> fuertes, ArrayList<Sinergia> sinergias, ArrayList<Runa> runas, ArrayList<Items> items, String descripcion) {
		super(nombre,tipo,habilidades,debiles,fuertes,sinergias,runas,items);
		this.descripcion = descripcion;
	}
	
	// Métodos
	
	public void editDescripcion(String descripcion) {}
	public void changeVideo() {}
	
}
