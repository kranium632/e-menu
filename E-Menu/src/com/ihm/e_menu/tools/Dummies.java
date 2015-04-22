package com.ihm.e_menu.tools;

import java.util.Vector;

import com.ihm.e_menu.types.Aliment;
import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.Menu;
import com.ihm.e_menu.types.Plat;

public class Dummies {

	public static final Aliment getDummyAlimentViande(){
		Vector<String> tags = new Vector<String>();
		tags.add("C�te");
		tags.add("Boeuf");
		return new Aliment("C�te de Boeuf", 0, 4, "C�te de boeuf de 250 grammes bien de chez nous.", tags, (float)-1.0);
	}
	
	public static final Aliment getDummyAlimentLegumes(){
		Vector<String> tags = new Vector<String>();
		tags.add("Pommes de terre");
		tags.add("Frites");
		return new Aliment("Frites rustiques", 1, 4, "Pommes de terre frites rustiques.", tags, (float)-1.0);
	}
	
	
	public static final Boisson getDummyDrink(){
		Vector<String> tags = new Vector<String>();
		tags.add("Tomate");
		tags.add("Vodka");
		tags.add("Citron");
		tags.add("�pices");
		tags.add("C�leri");
		String description = "Cocktail plus ou moins fortement piment� et �pic� selon les go�ts, � base de vodka, de jus de tomate, de jus de citron et d'�pices telles que piment, sauce Tabasco, sauce Worcestershire, poivre, sel au c�leri...";
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
		
		String description = "C�te de Boeuf de 250 gr. origine France servie avec ses frites rustiques.";
		
		Vector<Aliment> aliments = new Vector<Aliment>();
		aliments.add(getDummyAlimentViande());
		aliments.add(getDummyAlimentLegumes());
		
		return new Plat("C�te de Boeuf et ses Frites rustiques", 0, description, "link:none", aliments, tags, (float)10.0);
	}
	
	public static final Menu getDummyMenu(){
		Vector<String> tags = new Vector<String>();
		tags.addAll(getDummyAlimentViande().getTags());
		tags.addAll(getDummyAlimentLegumes().getTags());
		tags.addAll(getDummyWine().getTags());
		
		String description = "C�te de Boeuf servie avec ses frites rustiques et un verre de vin.";
		
		Vector<Plat> plat = new Vector<Plat>();
		plat.add(getDummyPlat());
		
		Vector<Boisson> boissons = new Vector<Boisson>();
		boissons.add(getDummyWine());
		
		return new Menu("Menu simple", 0, description, "link:none", plat, boissons, tags, (float)12.0);
	}
}
