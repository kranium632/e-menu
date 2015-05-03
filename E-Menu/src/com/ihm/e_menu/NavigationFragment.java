package com.ihm.e_menu;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;

public class NavigationFragment extends ListFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		String[] nav_values = new String[] { "A La Carte", "Menus", "Enfants",
				"Recherche" };

		setListAdapter(new ArrayAdapter<String>(getActivity(),
				R.layout.navigation_item, nav_values));

		super.onViewCreated(view, savedInstanceState);
	}

}
