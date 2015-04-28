package com.ihm.e_menu.sql;

import java.util.Vector;

import com.ihm.e_menu.types.Aliment;
import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.Menu;
import com.ihm.e_menu.types.Plat;

public class SQL_Access {
	
	/**
	 * Returns all the Aliment objects stored in the data base, including wines and drinks
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAllAliment(){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(Dummies.getDummyAlimentViande());
		results.add(Dummies.getDummyAlimentLegumes());
		results.add(Dummies.getDummyDrink());
		results.add(Dummies.getDummyWine());
		return results;
	}
	
	/**
	 * Returns the selected Aliment from the database if they exists
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAllAliments(int id[]){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(Dummies.getDummyAlimentViande());
		results.add(Dummies.getDummyAlimentLegumes());
		return results;
	}
	
	/**
	 * Returns all the Aliment objects stored in the data base, excluding wines and drinks
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAliment(){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(Dummies.getDummyAlimentViande());
		results.add(Dummies.getDummyAlimentLegumes());
		return results;
	}
	
	/**
	 * Returns the selected Aliment from the database if they exists as Aliment excluding drinks and wines
	 * 
	 * @return Vector<Aliment>
	 */
	private static Vector<Aliment> getAliments(int id[]){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(Dummies.getDummyAlimentViande());
		results.add(Dummies.getDummyAlimentLegumes());
		return results;
	}
	
	/**
	 * Returns all the Aliment drinks objects stored in the data base
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Boisson> getDrinks(){
		Vector<Boisson> results = new Vector<Boisson>();
		results.add(Dummies.getDummyDrink());
		results.add(Dummies.getDummyWine());
		return results;
	}
	
	/**
	 * Returns the selected drinks from the database if they exists as drinks
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Boisson> getDrinks(int id[]){
		Vector<Boisson> results = new Vector<Boisson>();
		results.add(Dummies.getDummyDrink());
		results.add(Dummies.getDummyWine());
		return results;
	}
	
	/**
	 * Returns all the Aliment wines objects stored in the data base
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Aliment> getWines(){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(Dummies.getDummyWine());
		return results;
	}
	
	/**
	 * Returns the selected wines from the database if they exists as wines
	 * 
	 * @return Vector<Aliment>
	 */
	public static Vector<Aliment> getWines(int id[]){
		Vector<Aliment> results = new Vector<Aliment>();
		results.add(Dummies.getDummyWine());
		return results;
	}
	
	public static Vector<Plat> getAllPlat(){
		Vector<Plat> results = new Vector<Plat>();
		results.add(Dummies.getDummyPlat());
		return results;
	}
	
	
	public static Vector<Plat> getPlat(int id[]){
		Vector<Plat> results = new Vector<Plat>();
		results.add(Dummies.getDummyPlat());
		return results;
	}
	
	public static Vector<Menu> getAllMenu(){
		Vector<Menu> results = new Vector<Menu>();
		results.add(Dummies.getDummyMenu());
		return results;
	}
	
	public static Vector<Menu> getMenu(){
		Vector<Menu> results = new Vector<Menu>();
		results.add(Dummies.getDummyMenu());
		return results;	
	}
}
