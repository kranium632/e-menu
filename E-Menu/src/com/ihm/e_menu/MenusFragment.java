package com.ihm.e_menu;

import java.util.Vector;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.ihm.e_menu.sql.SQL_Access;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.MenuA;


@SuppressLint("ValidFragment")
public class MenusFragment extends ContentFragment {

	public static final String START = "start";
	public static final String MENU_ID = "menuID";
	private static final int[] buttonIDs = {R.id.menuMenusButton0, R.id.menuMenusButton1, R.id.menuMenusButton2, R.id.menuMenusButton3};

	@SuppressLint("ValidFragment")
	public MenusFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.MENUS);

		//Default args
		Bundle def = new Bundle();
		def.putInt(START,0);
		setArguments(def);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parentActivity.nowIn(position);
		/*
		 * Crï¿½er X pages de menus, oï¿½ X = m.size()/4
		 * Pour chaque menu contenus dans m, sur chaque page, charger 4 menus,
		 * modifier les nom des boutons du template activity_menu_menus.xml "menuMenusButtonX",
		 * oï¿½ X = {1, 2, 3, 4}.
		 * 
		 * Pour chaque clic de boutons, crï¿½er une pop-up ou une activitï¿½ montrant le descriptif du menu
		 * 
		 * ï¿½ chaque changement de page de menus, relancer la prï¿½sente activitï¿½ en modifiant les noms des boutons
		 * pour incrï¿½menter de 4 les menus affichï¿½s (si on affichait les menu 1 ï¿½ 4, on affiche les menus 5 ï¿½ 8 et ainsi de suite).
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
				if (menus.get(nbr).getType() == SQL_Access.MENU_ADULTE){
					buttonToMod.setText(menus.get(nbr).getName() + "\n" + menus.get(nbr).getPrix() + "€");
					buttonToMod.setTag(menus.get(nbr).getId());
					buttonToMod.setOnClickListener(onButtonClicked);
				}
			}
		}

		return v;
	}


	public void showPopUp(int id){
		DialogFragment menu = new DetailedMenuFragment();

		Bundle bundle = new Bundle();
		bundle.putInt(MENU_ID, id);
		menu.setArguments(bundle);

		menu.show(getFragmentManager(), "menu");

		//		FragmentTransaction trans = getFragmentManager().beginTransaction();
		//		
		//		trans.replace(R.id.content, menu);
		//		trans.addToBackStack(null);
		//		
		//		trans.commit();
	}

	private OnClickListener onButtonClicked = new OnClickListener() {
		public void onClick(final View v) {
			int id = (Integer)v.getTag();
			showPopUp(id);
		}
	};
}
