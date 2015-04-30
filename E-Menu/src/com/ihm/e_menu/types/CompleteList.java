package com.ihm.e_menu.types;

import java.util.Vector;

public class CompleteList {
	private static Basket basket;
	
	public static void init(Basket b){
		CompleteList.basket =  b;
	}
	
	public static Vector<Boisson> getDrinks(){
		return CompleteList.basket.getDrinks();
	}
	
	public static Vector<Plat> getMeals(){
		return CompleteList.basket.getMeals();
	}
	
	public static Vector<MenuA> getMenus(){
		return CompleteList.basket.getMenus();
	}
}
