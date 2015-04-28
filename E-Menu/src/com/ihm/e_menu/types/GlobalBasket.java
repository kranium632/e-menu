package com.ihm.e_menu.types;

import java.util.Vector;

import android.app.Application;

public class GlobalBasket extends Application {
	private Basket basket;// = new Basket();
	
	public GlobalBasket(){
		this.basket = new Basket();
	}
	
	public void init(){
		this.basket = new Basket();
	}

	public void addPlat(Plat p){
		this.basket.addPlat(p);
	}
	
	public void addMenu(Menu m){
		this.basket.addMenu(m);
	}
	
	public void addBoisson(Boisson b){
		this.basket.addBoisson(b);
	}
	
	public void removePlat(Plat p){
		this.basket.removePlat(p);
	}
	
	public void removeMenu(Menu m){
		this.basket.removeMenu(m);
	}
	
	public void removeBoisson(Boisson b){
		this.basket.removeBoisson(b);
	}
	
	public Vector<Plat> getMeals() {
		return this.basket.getMeals();
	}

	public Vector<Menu> getMenus() {
		return this.basket.getMenus();
	}

	public Vector<Boisson> getDrinks() {
		return this.basket.getDrinks();
	}

	public void setMeals(Vector<Plat> meals) {
		this.basket.setMeals(meals);
	}

	public void setMenus(Vector<Menu> menus) {
		this.basket.setMenus(menus);
	}

	public void setDrinks(Vector<Boisson> drinks) {
		this.basket.setDrinks(drinks);
	}
	
	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}
}
