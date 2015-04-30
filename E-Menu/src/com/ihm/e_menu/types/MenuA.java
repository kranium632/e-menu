package com.ihm.e_menu.types;

import java.util.Vector;

public class MenuA {
	String name;
	int id;
	String description;
	String img;
	Vector<Plat> plats;
	Vector<Boisson> boissons;
	Vector<String> tags;
	float prix;
	
	public MenuA(String name, int id, String description, String img, Vector<Plat> plats, Vector<Boisson> boissons,
			Vector<String> tags, float prix){
		this.name = name;
		this.id = id;
		this.description = description;
		this.img = img;
		this.plats = plats;
		this.boissons = boissons;
		this.tags = tags;
		this.prix = prix;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getImg() {
		return img;
	}

	public Vector<Plat> getPlats() {
		return plats;
	}

	public Vector<Boisson> getBoissons() {
		return boissons;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setPlats(Vector<Plat> plats) {
		this.plats = plats;
	}

	public void setBoissons(Vector<Boisson> boissons) {
		this.boissons = boissons;
	}

	public void setTags(Vector<String> tags) {
		this.tags = tags;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}
