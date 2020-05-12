package clases;

import java.util.ArrayList;

public class Runa extends Heroe{

	// Atributos
	
	ArrayList<Primaria> primarias = new ArrayList<Primaria>();
	ArrayList<Secundaria> secundarias = new ArrayList<Secundaria>();
	
	// Constructores
	
	public Runa() {}
	public Runa(String nombre, String tipo, ArrayList<Habilidad> habilidades, ArrayList<Debil> debiles,
			ArrayList<Fuerte> fuertes, ArrayList<Sinergia> sinergias, ArrayList<Runa> runas, ArrayList<Items> items, ArrayList<Primaria> primarias, ArrayList<Secundaria> secundarias) {
		super(nombre,tipo,habilidades,debiles,fuertes,sinergias,runas,items);
		this.primarias = primarias;
		this.secundarias = secundarias;
	}
	
	// Métodos
	
	public void editNombre(String nombre) {}
	public void editPrimarias(Primaria primaria) {}
	public void editSecundarias(Secundaria secundarias) {}
	
}
