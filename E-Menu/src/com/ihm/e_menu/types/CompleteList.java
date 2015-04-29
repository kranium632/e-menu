package com.ihm.e_menu.types;

import java.util.Vector;

import android.app.Application;

public class CompleteList extends Application{
	Basket basket;
	
	public void init(Basket b){
		basket =  b;
	}
	
	public Vector<Boisson> getDrinks(){
		return basket.getDrinks();
	}
	
	public Vector<Plat> getMeals(){
		return basket.getMeals();
	}
	
	public Vector<Menu> getMenus(){
		return basket.getMenus();
	}
}
