package com.ihm.e_menu.types;

public class ErrorType extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErrorType(){
	    System.out.println("Erreur : cet aliment n'est pas une boisson !");
	  }  
}
