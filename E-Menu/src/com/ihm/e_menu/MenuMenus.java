package com.ihm.e_menu;

import java.util.Vector;

import com.ihm.e_menu.R;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.MenuA;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuMenus extends Activity {
	public static final String START = "start";
	public static final String MENU_ID = "menuID";
	private static final int[] buttonIDs = {R.id.menuMenusButton0, R.id.menuMenusButton1, R.id.menuMenusButton2, R.id.menuMenusButton3};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_menus);
		
		/*
		 * Créer X pages de menus, où X = m.size()/4
		 * Pour chaque menu contenus dans m, sur chaque page, charger 4 menus,
		 * modifier les nom des boutons du template activity_menu_menus.xml "menuMenusButtonX",
		 * où X = {1, 2, 3, 4}.
		 * 
		 * Pour chaque clic de boutons, créer une pop-up ou une activité montrant le descriptif du menu
		 * 
		 * À chaque changement de page de menus, relancer la présente activité en modifiant les noms des boutons
		 * pour incrémenter de 4 les menus affichés (si on affichait les menu 1 à 4, on affiche les menus 5 à 8 et ainsi de suite).
		 * 
		 */

		Bundle extras = getIntent().getExtras();
		int start = extras.getInt(MenuMenus.START);
		

		Vector<MenuA> menus = CompleteList.getMenus();
		/*
		menus.get(0).getId();
		String s = menus.get(0).getName();
		final Button buttonToChange = (Button)findViewById(R.id.menuMenusButton0);
		buttonToChange.setText(s);
		buttonToChange.setTag(0);
		*/
		for (int i = 0; i < 4; i++){
			final Button buttonToMod = (Button)findViewById(buttonIDs[i]);
			int nbr = start + i;
			if (i + start >= menus.size()){
				buttonToMod.setVisibility(View.INVISIBLE);
			}
			else {
				buttonToMod.setText(menus.get(nbr).getName());
				buttonToMod.setTag(nbr);
				buttonToMod.setOnClickListener(onButtonClicked);
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_menus, menu);
		return true;
	}
	
	public void showPopUp(int id){
 		Intent popup = new Intent(this, ShowMenusAsPopUp.class);
 		popup.putExtra(MenuMenus.MENU_ID, id);
		startActivity(popup);
	}
	
	private OnClickListener onButtonClicked = new OnClickListener() {
	     public void onClick(final View v) {
	         int intID = v.getId();
	         Button button = (Button) findViewById(intID);
	         int id = (Integer)button.getTag();
	    	 showPopUp(id);
	   }
	};
}
