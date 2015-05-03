package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CarteFragment extends Fragment {

//	public void showCarteStarters(View v1) {
//		Intent children = new Intent(this, MenuChildren.class);
//		startActivity(children);
//	}
//
//	public void showCarteMeals(View v2) {
//		Intent search = new Intent(this, MenuSearch.class);
//		startActivity(search);
//	}
//
//	public void showCarteDesserts(View v3) {
//		Intent search = new Intent(this, MenuDrinks.class);
//		startActivity(search);
//	}
//
//	public void showCarteDrinks(View v4) {
//		Intent search = new Intent(this, MenuWines.class);
//		startActivity(search);
//	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		 return inflater.inflate(R.layout.activity_menu_carte, container, false);
	}

}
