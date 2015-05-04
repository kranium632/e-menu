package com.ihm.e_menu.types;

import java.util.Vector;

public class Boisson extends Plat {

	public Boisson(String name, int id, int type, String description, Vector<String> tags, float prix) {
		super(name, id, type, description, description, null, tags, prix);
	}

}
