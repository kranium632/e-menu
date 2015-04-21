package com.ihm.e_menu.tools;

import java.util.Vector;

import com.ihm.e_menu.types.Aliment;
import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.Menu;
import com.ihm.e_menu.types.Plat;

public class SQL_Access {
	
	private static final Aliment getDummyAlimentViande(){
		Vector<String> tags = new Vector<String>();
		tags.add("Côte");
		tags.add("Boeuf");
		return new Aliment("Côte de Boeuf", 0, 4, "Côte de boeuf de 250 grammes bien de chez nous.", tags, (float)-1.0);
	}
	
	private static final Aliment getDummyAlimentLegumes(){
		Vector<String> tags = new Vector<String>();
		tags.add("Pommes de terre");
		tags.add("Frites");
		return new Aliment("Frites rustiques", 1, 4, "Pommes de terre frites rustiques.", tags, (float)-1.0);
	}
	
	
	private static final Boisson getDummyDrink(){
		Vector<String> tags = new Vector<String>();
		tags.add("Tomate");
		tags.add("Vodka");
		tags.add("Citron");
		tags.add("Épices");
		tags.add("Céleri");
		String description = "Cocktail plus ou moins fortement pimenté et épicé selon les goûts, à base de vodka, de jus de tomate, de jus de citron et d'épices telles que piment, sauce Tabasco, sauce Worcestershire, poivre, sel au céleri...";
		return new Boisson("Bloody Mary", 2, 2, description, tags, (float)7.0);
	}
	
	private static final Boisson getDummyWine(){
		Vector<String> tags = new Vector<String>();
		tags.add("Savoie");
		tags.add("Rouge");
		tags.add("Pinot");
		String description = "Vin de Savoie Pinot noir \"Baies Sauvages\"\nExploitant Perret";
		return new Boisson("Pinot noir \"Baies Sauvages\"", 3, 1, description, tags, (float)10.0);
	}
	
	private static final Plat getDummyPlat(){
		Vector<String> tags = new Vector<String>();
		tags.addAll(getDummyAlimentViande().getTags());
		tags.addAll(getDummyAlimentLegumes().getTags());
		
		String description = "Côte de Boeuf de 250 gr. origine France servie avec ses frites rustiques.";
		
		Vector<Aliment> aliments = new Vector<Aliment>();
		aliments.add(getDummyAlimentViande());
		aliments.add(getDummyAlimentLegumes());
		
		return new Plat("Côte de Boeuf et ses Frites rustiques", 0, description, "link:none", aliments, tags, (float)10.0);
	}
	
	private static final Menu getDummyMenu(){
		Vector<String> tags = new Vector<String>();
		tags.addAll(getDummyAlimentViande().getTags());
		tags.addAll(getDummyAlimentLegumes().getTags());
		tags.addAll(getDummyWine().getTags());
		
		String description = "Côte de Boeuf servie avec ses frites rustiques et un verre de vin.";
		
		Vector<Plat> plat = new Vector<Plat>();
		plat.add(getDummyPlat());
		
		Vector<Boisson> boissons = new Vector<Boisson>();
		boissons.add(getDummyWine());
		
		return new Menu("Menu simple", 0, description, "link:none", plat, boissons, tags, (float)12.0);
	}
	
	/**
	 * Returns all the Aliment objects stored in the data base, including wines and drinks
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAllAliment(){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyAlimentViande());
		results.add(getDummyAlimentLegumes());
		results.add(getDummyDrink());
		results.add(getDummyWine());
		return results;
	}
	
	/**
	 * Returns the selected Aliment from the database if they exists
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAllAliments(int id[]){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyAlimentViande());
		results.add(getDummyAlimentLegumes());
		return results;
	}
	
	/**
	 * Returns all the Aliment objects stored in the data base, excluding wines and drinks
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAliment(){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyAlimentViande());
		results.add(getDummyAlimentLegumes());
		return results;
	}
	
	/**
	 * Returns the selected Aliment from the database if they exists as Aliment excluding drinks and wines
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAliments(int id[]){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyAlimentViande());
		results.add(getDummyAlimentLegumes());
		return results;
	}
	
	/**
	 * Returns all the Aliment drinks objects stored in the data base
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Aliment> getDrinks(){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyDrink());
		return results;
	}
	
	/**
	 * Returns the selected drinks from the database if they exists as drinks
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Aliment> getDrinks(int id[]){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyDrink());
		return results;
	}
	
	/**
	 * Returns all the Aliment wines objects stored in the data base
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Aliment> getWines(){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyWine());
		return results;
	}
	
	/**
	 * Returns the selected wines from the database if they exists as wines
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Aliment> getWines(int id[]){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(getDummyWine());
		return results;
	}
	
	public static Vector<Plat> getAllPlat(){
		return null;	
	}
	
	
	public static Vector<Plat> getPlat(int id[]){
		return null;	
	}
	
	public static Vector<Menu> getAllMenu(){
		return null;	
	}
	
	public static Vector<Menu> getMenu(){
		return null;	
	}
}
