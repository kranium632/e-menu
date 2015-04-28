package com.ihm.e_menu.sql;

import java.util.Vector;

import android.os.Handler;

import com.ihm.e_menu.types.Aliment;
import com.ihm.e_menu.types.Basket;
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
	
	public static Vector<Plat> getPlats(){
		Vector<Plat> results = new Vector<Plat>();
		results.add(Dummies.getDummyPlat());
		return results;
	}
	
	
	public static Vector<Plat> getPlat(int id[]){
		Vector<Plat> results = new Vector<Plat>();
		results.add(Dummies.getDummyPlat());
		return results;
	}
	
	public static Vector<Menu> getMenus(){
		Vector<Menu> results = new Vector<Menu>();
		results.add(Dummies.getDummyMenu());
		return results;
	}
	
	public static Vector<Menu> getMenu(int id[]){
		Vector<Menu> results = new Vector<Menu>();
		results.add(Dummies.getDummyMenu());
		return results;	
	}
	
	public static Basket getCompleteList(){
		/*
		Thread t;
		// Déclaration d'un handler pour pouvoir exécuter des objets Runnable dans l'UI Thread
	    Handler msgHandler = new Handler();
        t = new MonThread(msgHandler);
        */
        
		Basket b = new Basket(getPlats(), getMenus(), getDrinks());
		return b;
	}
	
	/* ********************************** */
	/* GESTION DU THREAD DE ************* */
	/* RÉCUPÉRATION DE LA BASE DE DONNÉES */
	/* ********************************** */
	/*
	@Override
	protected void onResume() {
		super.onResume();
			
        t.start();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		
	    t.interrupt();
	}
	//*/
    // Thread qui va effectuer des opérations très longues...
    public class MonThread extends Thread {
    	Handler handlerDial;
    	int i;
    	
        public MonThread(Handler handlerDial) {
			// TODO Auto-generated constructor stub
        	this.handlerDial=handlerDial;
		}

		public void run() {
            // Traitement
			//À remplacer par l'init du panier global
            try {
            	for (i=0; i<=100; i++)
            	{
            		Thread.sleep(2000); // Traitement long...
            		
            		// Envoi de l'objet Runnable a UI Thread pour faire avancer la barre de progression
            		handlerDial.post(new Runnable() {
            			public void run() {
            				//progress.setProgress(i);
            			}
            		});
            	}
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); // Marque le thread comme interrompu
                return;
            }
        }
    }
}
