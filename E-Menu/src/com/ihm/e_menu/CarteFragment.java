package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class CarteFragment extends ContentFragment implements OnClickListener {

	public CarteFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.CARTE);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parentActivity.nowIn(position);
		View v = inflater.inflate(R.layout.activity_menu_carte, container, false);
		
		Button b = (Button)v.findViewById(R.id.mealsButton);
		b.setOnClickListener(this);
		
		b = (Button)v.findViewById(R.id.startersButton);
		b.setOnClickListener(this);
		
		b = (Button)v.findViewById(R.id.dessertsButton);
		b.setOnClickListener(this);
		
		b = (Button)v.findViewById(R.id.drinksButton);
		b.setOnClickListener(this);
		
		
		return v;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.mealsButton:
			showCarteMeals(v);
			break;
		case R.id.startersButton:
			showCarteStarters(v);
			break;
		case R.id.dessertsButton:
			showCarteDesserts(v);
			break;
		case R.id.drinksButton:
			showCarteDrinks(v);
			break;
		default:
			break;
		}
	}
	
	 public void showCarteStarters(View v1) {
			Fragment carte = new StartersFragment();
			
			FragmentTransaction trans = getFragmentManager().beginTransaction();
			
			trans.replace(R.id.content, carte);
			trans.addToBackStack(null);

			trans.commit();
	 }
	
	 public void showCarteMeals(View v2) {
			Fragment carte = new MealsFragment();
			
			FragmentTransaction trans = getFragmentManager().beginTransaction();
			
			trans.replace(R.id.content, carte);
			trans.addToBackStack(null);

			trans.commit();
	 }
	
	 public void showCarteDesserts(View v3) {
			Fragment carte = new DessertsFragment();
			
			FragmentTransaction trans = getFragmentManager().beginTransaction();
			
			trans.replace(R.id.content, carte);
			trans.addToBackStack(null);

			trans.commit();
	 }
	
	 public void showCarteDrinks(View v4) {
			Fragment carte = new DrinksFragment();
			
			FragmentTransaction trans = getFragmentManager().beginTransaction();
			
			trans.replace(R.id.content, carte);
			trans.addToBackStack(null);

			trans.commit();
	 }

}
