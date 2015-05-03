package com.ihm.e_menu.types;

import java.util.Vector;

public class GlobalBasket {
	private static Basket basket;
	
	public static void init(){
		GlobalBasket.basket = new Basket();
	}

	public static void addPlat(Plat p){
		GlobalBasket.basket.addPlat(p);
	}
	
	public static void addMenu(MenuA m){
		GlobalBasket.basket.addMenu(m);
	}
	
	public static void addBoisson(Boisson b){
		GlobalBasket.basket.addBoisson(b);
	}
	
	public static void clearBasket(){
		GlobalBasket.basket.clearBasket();
	}
	
	public static void removePlat(Plat p){
		GlobalBasket.basket.removePlat(p);
	}
	
	public static void removeMenu(MenuA m){
		GlobalBasket.basket.removeMenu(m);
	}
	
	public static void removeBoisson(Boisson b){
		GlobalBasket.basket.removeBoisson(b);
	}
	
	public static Vector<Plat> getMeals() {
		return GlobalBasket.basket.getMeals();
	}

	public static Vector<MenuA> getMenus() {
		return GlobalBasket.basket.getMenus();
	}

	public static Vector<Boisson> getDrinks() {
		return GlobalBasket.basket.getDrinks();
	}

	public static void setMeals(Vector<Plat> meals) {
		GlobalBasket.basket.setMeals(meals);
	}

	public static void setMenus(Vector<MenuA> menus) {
		GlobalBasket.basket.setMenus(menus);
	}

	public static void setDrinks(Vector<Boisson> drinks) {
		GlobalBasket.basket.setDrinks(drinks);
	}
	
	public static Basket getBasket() {
		return basket;
	}

	public static void setBasket(Basket basket) {
		GlobalBasket.basket = basket;
	}
}
