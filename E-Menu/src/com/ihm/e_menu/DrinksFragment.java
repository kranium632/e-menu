package com.ihm.e_menu;

import java.util.Vector;

import com.ihm.e_menu.sql.SQL_Access;
import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.CompleteList;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DrinksFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.carte_template_layout, container, false);
		Vector<Boisson> drinks = CompleteList.getDrinks();

		//On affiche d'abord les menus, ensuite les plats et enfin les boissons
		LinearLayout basketLayout = (LinearLayout) v.findViewById(R.id.carteTemplateLayout);
		TextView tv;
		basketLayout.removeAllViews();
		int len = drinks.size();
		if (len == 0){
			tv = new TextView(v.getContext());
			tv.setText("La carte ne contient actuellement aucune boisson.\nVeuillez nous en excuser.");
			basketLayout.addView(tv);
		}
		else {
			for (int i = 0; i < len; i++){
				Boisson p = drinks.get(i);
				if (p.getType() == SQL_Access.ALIMENT_BOISSON){
					tv = new TextView(v.getContext());
					tv.setText(p.getName() + " - " + p.getPrix() + "€");
					basketLayout.addView(tv);
				}
			}
		}
		return v;
	}

}
