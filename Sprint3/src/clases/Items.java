package clases;

import java.util.ArrayList;

public class Items extends Heroe{

	// Atributos
	
	ArrayList<String> toStart = new ArrayList<String>();
	ArrayList<String> fullAp = new ArrayList<String>();
	ArrayList<String> fullCrit = new ArrayList<String>();
	ArrayList<String> fullAd = new ArrayList<String>();
	
	// Constructores
	
	public Items() {}
	public Items(ArrayList<String> toStart,ArrayList<String> fullAp,ArrayList<String> fullCrit,ArrayList<String> fullAd) {
		this.toStart = toStart;
		this.fullAp = fullAp;
		this.fullCrit = fullCrit;
		this.fullAd = fullAd;
	}
	
	// Métodos
	
	public void addToStart(ArrayList<String> toStart) {}
	public void addAp(ArrayList<String> fullAp) {}
	public void addAd(ArrayList<String> fullAd) {}
	public void addCrit(ArrayList<String> fullCrit) {}
	
}
