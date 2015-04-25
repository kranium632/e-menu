package com.ihm.e_menu.types;

import java.util.Vector;

public class Aliment {
	String name;
	int id;
	int type;
	String description;
	Vector<String> tags;
	float prix;
	
	public Aliment(String name, int id, int type, String description, Vector<String> tags, float prix){
		this.name = name;
		this.id = id;
		this.type = type;
		this.description = description;
		this.tags = tags;
		this.prix = prix;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public Vector<String> getTags() {
		return tags;
	}

	public float getPrix() {
		return prix;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTags(Vector<String> tags) {
		this.tags = tags;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}
