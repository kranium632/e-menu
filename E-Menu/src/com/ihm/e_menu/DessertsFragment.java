package com.ihm.e_menu;

import java.util.Vector;

import com.ihm.e_menu.sql.SQL_Access;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.Plat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DessertsFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.carte_template_layout, container, false);
		Vector<Plat> meals = CompleteList.getMeals();

		//On affiche d'abord les menus, ensuite les plats et enfin les boissons
		LinearLayout basketLayout = (LinearLayout) v.findViewById(R.id.carteTemplateLayout);
		TextView tv;
		basketLayout.removeAllViews();
		int len = meals.size();
		if (len == 0){
			tv = new TextView(v.getContext());
			tv.setText("La carte ne contient actuellement aucun dessert.\nVeuillez nous en excuser.");
			basketLayout.addView(tv);
		}
		else {
			for (int i = 0; i < len; i++){
				Plat p = meals.get(i);
				if (p.getType() == SQL_Access.PLAT_DESSERT){
					tv = new TextView(v.getContext());
					tv.setText(p.getName() + " - " + p.getPrix() + "€");
					basketLayout.addView(tv);
				}
			}
		}
		return v;
	}

}
