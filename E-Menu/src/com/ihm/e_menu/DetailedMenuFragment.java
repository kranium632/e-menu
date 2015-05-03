package com.ihm.e_menu;

import java.util.Vector;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.GlobalBasket;
import com.ihm.e_menu.types.MenuA;

public class DetailedMenuFragment extends Fragment implements OnClickListener {
	public MenuA m = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.activity_show_menus_as_pop_up,
				container, false);

		Button basket = (Button) v.findViewById(R.id.addToBasket);
		basket.setOnClickListener(this);

		Bundle extras = getArguments();
		int id = extras.getInt(MenusFragment.MENU_ID);

		this.m = CompleteList.getMenus(id);
		final TextView textViewToChange = (TextView) v.findViewById(R.id.tv);
		if (this.m != null) {
			String s = this.m.getName() + "\n" + this.m.getDescription() + "\n";
			Vector<Boisson> b = this.m.getBoissons();
			if (b.size() > 0)
				s += "Liste des boissons comprise dans le menu :\n";
			for (int i = 0; i < b.size(); i++) {
				s += "- " + b.get(i).getName() + "\n";
			}

			textViewToChange.setText(s);
		}
		else {
			textViewToChange.setText("Une erreur est survenue, veuillez contacter le personnel du restaurant.");
			basket.setVisibility(View.INVISIBLE);
		}

		return v;
	}

	@Override
	public void onClick(View v) {
		if (this.m != null)
			GlobalBasket.addMenu(m);
	}

}
