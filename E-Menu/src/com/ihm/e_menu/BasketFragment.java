package com.ihm.e_menu;

import java.util.Vector;

import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.GlobalBasket;
import com.ihm.e_menu.types.MenuA;
import com.ihm.e_menu.types.Plat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BasketFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.basket_fragment, container, false);
		Vector<Plat> meals = GlobalBasket.getMeals();
		Vector<MenuA> menus = GlobalBasket.getMenus();
		Vector<Boisson> drinks = GlobalBasket.getDrinks();


		//On affiche d'abord les menus, ensuite les plats et enfin les boissons
		LinearLayout basketLayout = (LinearLayout) v.findViewById(R.id.basketLayout);
		TextView tv = (TextView)v.findViewById(R.id.tvBasket);
		basketLayout.removeAllViews();
		int len = menus.size();
		if ((menus.size() == 0) && (drinks.size() == 0) && (meals.size() == 0)){
			tv = new TextView(v.getContext());
			tv.setText("Le panier est actuellement vide.");
			basketLayout.addView(tv);
		}
		else {
			if (len != 0){
				if (len == 1){
					tv = new TextView(v.getContext());
					tv.setText("Menu :");
					basketLayout.addView(tv);
				}
				else {
					tv = new TextView(v.getContext());
					tv.setText("Menus :");
					basketLayout.addView(tv);
				}
				for (int i = 0; i < len; i++){
					tv = new TextView(v.getContext());
					tv.setText(menus.get(i).getName());
					basketLayout.addView(tv);
				}
			}

			len = meals.size();
			if (len != 0){
				if (len == 1){
					tv = new TextView(v.getContext());
					tv.setText("Plat :");
					basketLayout.addView(tv);
				}
				else {
					tv = new TextView(v.getContext());
					tv.setText("Plats :");
					basketLayout.addView(tv);
				}
				for (int i = 0; i < len; i++){
					tv = new TextView(v.getContext());
					tv.setText(meals.get(i).getName());
					basketLayout.addView(tv);
				}
			}

			len = drinks.size();
			if (len != 0){
				if (len == 1){
					tv = new TextView(v.getContext());
					tv.setText("Boisson :");
					basketLayout.addView(tv);
				}
				else {
					tv = new TextView(v.getContext());
					tv.setText("Boissons :");
					basketLayout.addView(tv);
				}
				for (int i = 0; i < len; i++){
					tv = new TextView(v.getContext());
					tv.setText(drinks.get(i).getName());
					basketLayout.addView(tv);
				}
			}
		}
		return v;
	}

}