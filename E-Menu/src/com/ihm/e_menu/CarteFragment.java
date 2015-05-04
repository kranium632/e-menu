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

import com.ihm.e_menu.sql.SQL_Access;
import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.Plat;

public class CarteFragment extends ContentFragment implements OnClickListener {

	public CarteFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.CARTE);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parentActivity.nowIn(position);
		View v = inflater.inflate(R.layout.activity_menu_carte, container,
				false);

		Button b = (Button) v.findViewById(R.id.mealsButton);
		b.setOnClickListener(this);

		b = (Button) v.findViewById(R.id.startersButton);
		b.setOnClickListener(this);

		b = (Button) v.findViewById(R.id.dessertsButton);
		b.setOnClickListener(this);

		b = (Button) v.findViewById(R.id.drinksButton);
		b.setOnClickListener(this);

		return v;
	}

	@Override
	public void onClick(View v) {
		Vector<Plat> plats = null;
		
		switch (v.getId()) {
		case R.id.mealsButton:
			plats = CompleteList.getMeals();
			break;
		case R.id.startersButton:
			plats = SQL_Access.getEntrees();
			break;
		case R.id.dessertsButton:
			plats = SQL_Access.getDesserts();
			break;
		case R.id.drinksButton:
			Vector<Boisson> boissons = SQL_Access.getDrinks();
			plats = new Vector<Plat>();
			for(Boisson b : boissons){
				plats.add(b);
			}
			break;
		default:
			break;
		}
		 
		if(plats != null){
			MealsAdapter adapter = new MealsAdapter(parentActivity, R.layout.item_list_row, plats);
			
			Fragment carte = new ItemListFragment(parentActivity,adapter);

			FragmentTransaction trans = getFragmentManager().beginTransaction();

			trans.replace(R.id.content, carte);
			trans.addToBackStack(null);

			trans.commit();
		}
		
	}

}
