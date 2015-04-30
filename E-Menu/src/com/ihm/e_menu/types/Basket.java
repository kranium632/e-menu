package com.ihm.e_menu.types;

import java.util.Vector;

public class Basket {
	private Vector<Plat> meals;
	private Vector<MenuA> menus;
	private Vector<Boisson> drinks;
	
	public Basket(){
		this.meals = new Vector<Plat>();
		this.menus = new Vector<MenuA>();
		this.drinks = new Vector<Boisson>();
	}
	
	public Basket(Vector<Plat> plats, Vector<MenuA> menus, Vector<Boisson> drinks){
		this.meals = plats;
		this.menus = menus;
		this.drinks = drinks;
	}
	
	public void addPlat(Plat p){
		this.meals.add(p);
	}
	
	public void addMenu(MenuA m){
		this.menus.add(m);
	}
	
	public void addBoisson(Boisson b){
		this.drinks.add(b);
	}
	
	public void removePlat(Plat p){
		this.meals.remove(p);
	}
	
	public void removeMenu(MenuA m){
		this.menus.remove(m);
	}
	
	public void removeBoisson(Boisson b){
		this.drinks.remove(b);
	}
	
	public Vector<Plat> getMeals() {
		return meals;
	}

	public Vector<MenuA> getMenus() {
		return menus;
	}

	public Vector<Boisson> getDrinks() {
		return drinks;
	}

	public void setMeals(Vector<Plat> meals) {
		this.meals = meals;
	}

	public void setMenus(Vector<MenuA> menus) {
		this.menus = menus;
	}

	public void setDrinks(Vector<Boisson> drinks) {
		this.drinks = drinks;
	}
	
	public void clearBasket(){
		this.meals.clear();
		this.menus.clear();
		this.drinks.clear();
	}

}
