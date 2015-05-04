package com.ihm.e_menu.types;

import java.util.Vector;

public class Boisson extends Plat {

	public Boisson(String name, int id, int type, String description, Vector<String> tags, float prix) {
		super(name, id, type, description, description, null, tags, prix);
	}

	@Override
	public void addToBasket() {
		GlobalBasket.addBoisson(this);
	}
	
	@Override
	public void removeFromBasket() {
		if(GlobalBasket.getDrinks().contains(this)){
			GlobalBasket.removeBoisson(this);
		}
	}

	public int getNumberInBasket() {
		return GlobalBasket.getNumberOf(this);
	}
}
