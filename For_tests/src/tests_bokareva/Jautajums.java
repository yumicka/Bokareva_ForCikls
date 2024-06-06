package tests_bokareva;

import java.util.ArrayList;

public class Jautajums {

	public String nosaukums;
	public ArrayList<String> varianti = new ArrayList<String>();
	public ArrayList<Boolean> atbildes = new ArrayList<Boolean>();
	
	public Jautajums(String nosaukums, ArrayList<String> varianti, ArrayList<Boolean> atbildes) {
		this.nosaukums = nosaukums;
		this.varianti = varianti;
		this.atbildes = atbildes;
	}
	
	public String getNosaukums() {
		return nosaukums;
	}
	
	public ArrayList<String> getVarianti() {
		return varianti;
	}
	
	public ArrayList<Boolean> getAtbildes() {
		return atbildes;
	}
	
}
