package com.ihm.e_menu;

import java.util.Vector;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.MenuA;


public class MenusFragment extends Fragment {
	public static final String START = "start";
	public static final String MENU_ID = "menuID";
	private static final int[] buttonIDs = {R.id.menuMenusButton0, R.id.menuMenusButton1, R.id.menuMenusButton2, R.id.menuMenusButton3};
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		/*
		 * Cr�er X pages de menus, o� X = m.size()/4
		 * Pour chaque menu contenus dans m, sur chaque page, charger 4 menus,
		 * modifier les nom des boutons du template activity_menu_menus.xml "menuMenusButtonX",
		 * o� X = {1, 2, 3, 4}.
		 * 
		 * Pour chaque clic de boutons, cr�er une pop-up ou une activit� montrant le descriptif du menu
		 * 
		 * � chaque changement de page de menus, relancer la pr�sente activit� en modifiant les noms des boutons
		 * pour incr�menter de 4 les menus affich�s (si on affichait les menu 1 � 4, on affiche les menus 5 � 8 et ainsi de suite).
		 * 
		 */

		Bundle bundle = getArguments();
		int start = bundle.getInt(MenusFragment.START);
		

		Vector<MenuA> menus = CompleteList.getMenus();
		
		View v = inflater.inflate(R.layout.activity_menu_menus,container,false);
		/*
		menus.get(0).getId();
		String s = menus.get(0).getName();
		final Button buttonToChange = (Button)findViewById(R.id.menuMenusButton0);
		buttonToChange.setText(s);
		buttonToChange.setTag(0);
		*/
		for (int i = 0; i < 4; i++){
			final Button buttonToMod = (Button)v.findViewById(buttonIDs[i]);
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
		
		return v;
	}

	
	public void showPopUp(int id){
		Fragment menu = new DetailedMenuFragment();
		
		Bundle bundle = new Bundle();
		bundle.putInt(MENU_ID, id);
		menu.setArguments(bundle);
		
		FragmentTransaction trans = getFragmentManager().beginTransaction();
		
		trans.replace(R.id.content, menu);
		trans.addToBackStack(null);
		
		trans.commit();
	}
	
	private OnClickListener onButtonClicked = new OnClickListener() {
	     public void onClick(final View v) {
	         int id = (Integer)v.getTag();
	    	 showPopUp(id);
	   }
	};
}
