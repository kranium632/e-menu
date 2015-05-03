package com.ihm.e_menu.sql;

import java.util.Vector;

import com.ihm.e_menu.types.Aliment;
import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.MenuA;
import com.ihm.e_menu.types.Plat;

public class Dummies {

	public static final Aliment getDummyAlimentViande(){
		Vector<String> tags = new Vector<String>();
		tags.add("Côte");
		tags.add("Boeuf");
		return new Aliment("Côte de Boeuf", 0, 4, "Côte de boeuf de 250 grammes bien de chez nous.", tags, (float)-1.0);
	}
	
	public static final Aliment getDummyAlimentLegumes(){
		Vector<String> tags = new Vector<String>();
		tags.add("Pommes de terre");
		tags.add("Frites");
		return new Aliment("Frites rustiques", 1, 4, "Pommes de terre frites rustiques.", tags, (float)-1.0);
	}

	public static final Aliment getDummyAlimentGlace(){
		Vector<String> tags = new Vector<String>();
		tags.add("Glace");
		tags.add("Vanille");
		return new Aliment("Glace à la Vanille", 2, 6, "Glace à la vanille.", tags, (float)-1.0);
	}
	
	
	public static final Boisson getDummyDrink(){
		Vector<String> tags = new Vector<String>();
		tags.add("Tomate");
		tags.add("Vodka");
		tags.add("Citron");
		tags.add("Épices");
		tags.add("Céleri");
		String description = "Cocktail plus ou moins fortement pimenté et épicé selon les goûts, à base de vodka, de jus de tomate, de jus de citron et d'épices telles que piment, sauce Tabasco, sauce Worcestershire, poivre, sel au céleri...";
		return new Boisson("Bloody Mary", 2, 2, description, tags, (float)7.0);
	}
	
	public static final Boisson getDummyWine(){
		Vector<String> tags = new Vector<String>();
		tags.add("Savoie");
		tags.add("Rouge");
		tags.add("Pinot");
		String description = "Vin de Savoie Pinot noir \"Baies Sauvages\"\nExploitant Perret";
		return new Boisson("Pinot noir \"Baies Sauvages\"", 3, 1, description, tags, (float)10.0);
	}
	
	public static final Plat getDummyPlat(){
		Vector<String> tags = new Vector<String>();
		tags.addAll(getDummyAlimentViande().getTags());
		tags.addAll(getDummyAlimentLegumes().getTags());
		
		String description = "Côte de Boeuf de 250 gr. origine France servie avec ses frites rustiques.";
		
		Vector<Aliment> aliments = new Vector<Aliment>();
		aliments.add(getDummyAlimentViande());
		aliments.add(getDummyAlimentLegumes());
		
		return new Plat("Côte de Boeuf et ses Frites rustiques", 0, 2, description, "link:none", aliments, tags, (float)10.0);
	}
	
	public static final MenuA getDummyMenu(){
		Vector<String> tags = new Vector<String>();
		tags.addAll(getDummyAlimentViande().getTags());
		tags.addAll(getDummyAlimentLegumes().getTags());
		tags.addAll(getDummyWine().getTags());
		
		String description = "Côte de Boeuf servie avec ses frites rustiques et un verre de vin.";
		
		Vector<Plat> plat = new Vector<Plat>();
		plat.add(getDummyPlat());
		
		Vector<Boisson> boissons = new Vector<Boisson>();
		boissons.add(getDummyWine());
		
		return new MenuA("Côte de Boeuf #1", 0, description, "link:none", plat, boissons, tags, (float)10.0);
	}
	
	public static final MenuA getDummyMenu2(){
		Vector<String> tags = new Vector<String>();
		tags.addAll(getDummyAlimentViande().getTags());
		tags.addAll(getDummyAlimentLegumes().getTags());
		tags.addAll(getDummyAlimentGlace().getTags());
		tags.addAll(getDummyWine().getTags());
		
		String description = "Côte de Boeuf servie avec ses frites rustiques et un verre de vin.\n3 boules de glace vanille en dessert.";
		
		Vector<Plat> plat = new Vector<Plat>();
		plat.add(getDummyPlat());
		plat.add(getDummyDessert());
		
		Vector<Boisson> boissons = new Vector<Boisson>();
		boissons.add(getDummyWine());
		
		return new MenuA("Côte de Boeuf #2", 1, description, "link:none", plat, boissons, tags, (float)12.0);
	}
	
	public static final Plat getDummyDessert(){
		Vector<String> tags = new Vector<String>();
		tags.addAll(getDummyAlimentGlace().getTags());
		
		String description = "Coupe de glace 3 boules vanille.";
		
		Vector<Aliment> aliments = new Vector<Aliment>();
		aliments.add(getDummyAlimentGlace());
		
		return new Plat("Glace à la vanille 3 boules", 0, 2, description, "link:none", aliments, tags, (float)5.0);
	}
}
