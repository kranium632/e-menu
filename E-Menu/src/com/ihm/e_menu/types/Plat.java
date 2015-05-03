package com.ihm.e_menu.types;

import java.util.Vector;

public class Plat {
	String name;
	int id;
	int type;
	String description;
	String img;
	Vector<Aliment> aliments;
	Vector<String> tags;
	float prix;
	
	public Plat(String name, int id, int type, String description, String img, Vector<Aliment> aliments, Vector<String> tags, float prix){
		this.name = name;
		this.id = id;
		this.description = description;
		this.img = img;
		this.aliments = aliments;
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

	public String getImg() {
		return img;
	}

	public Vector<Aliment> getAliments() {
		return aliments;
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

	public void setImg(String img) {
		this.img = img;
	}

	public void setAliments(Vector<Aliment> aliments) {
		this.aliments = aliments;
	}

	public void setTags(Vector<String> tags) {
		this.tags = tags;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
}
