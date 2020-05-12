package clases;

import java.util.ArrayList;

public class LeagueOfBuilds {

	// Atributos
	
	ArrayList<String> tipos = new ArrayList<String>();
	ArrayList<String> idiomas = new ArrayList<String>();
	String buscador;
	
	// Constructor
	
	public LeagueOfBuilds() {}
	public LeagueOfBuilds(ArrayList<String> tipos, ArrayList<String> idiomas, String buscador) {
		this.tipos = tipos;
		this.idiomas = idiomas;
		this.buscador = buscador;
	}
	
	// Métodos
	
	public void buscar(String buscador) {}
	private void addTipo(String tipo) {}
	private void deleteTipo(String tipo) {}
	private void addIdioma(String idioma) {}
	private void deleteIdioma(String idioma) {}
	
	
}
