package com.ihm.e_menu;

import java.util.Vector;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.GlobalBasket;
import com.ihm.e_menu.types.MenuA;
import com.ihm.e_menu.types.Plat;

@SuppressLint("ValidFragment")
public class BasketFragment extends ContentFragment implements OnClickListener{

	@SuppressLint("ValidFragment")
	public BasketFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.BASKET);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parentActivity.nowIn(position);
		View v = inflater.inflate(R.layout.basket_fragment, container, false);
		
		Button empty = (Button)v.findViewById(R.id.emptyBasket);
		empty.setOnClickListener(this);
		
		Vector<Plat> meals = GlobalBasket.getMeals();
		Vector<MenuA> menus = GlobalBasket.getMenus();
		Vector<Boisson> drinks = GlobalBasket.getDrinks();


		//On affiche d'abord les menus, ensuite les plats et enfin les boissons
		LinearLayout basketLayout = (LinearLayout) v.findViewById(R.id.basketLayout);
		TextView tv;
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

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.emptyBasket:
			emptyBasket();
			break;

		default:
			break;
		}
		
	}

	private void emptyBasket() {
		GlobalBasket.clearBasket();
		LinearLayout layout = (LinearLayout)getView().findViewById(R.id.basketLayout);
		layout.removeAllViews();
		TextView tv = new TextView(getView().getContext());
		tv.setText("Le panier est actuellement vide.");
		layout.addView(tv);
	}

}