package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.ihm.e_menu.sql.SQL_Access;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.GlobalBasket;

public class MainMenuFragment extends ContentFragment implements
		OnClickListener {

	public MainMenuFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.HOME);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Initialisation du panier
		GlobalBasket.init();
		// Init de la BDD locale
		CompleteList.init(SQL_Access.getCompleteList());
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parentActivity.nowIn(position);

		View v = inflater.inflate(R.layout.activity_show_main_menu, container,
				false);

		Button b = (Button) v.findViewById(R.id.showMenuCarte);

		b.setOnClickListener(this);

		b = (Button) v.findViewById(R.id.showMenuChildren);
		b.setOnClickListener(this);

		b = (Button) v.findViewById(R.id.showMenuMenus);
		b.setOnClickListener(this);

		b = (Button) v.findViewById(R.id.showMenuSearch);
		b.setOnClickListener(this);

		return v;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.showMenuCarte:
			showMenuCarte(v);
			break;
		case R.id.showMenuMenus:
			showMenuMenus(v);
			break;
		case R.id.showMenuChildren:
			showMenuChildren(v);
			break;
		case R.id.showMenuSearch:
			showMenuSearch(v);
			break;
		default:
			break;
		}

	}

	public void showMenuCarte(View v1) {
		ContentFragment carte = new CarteFragment(parentActivity);
		parentActivity.goTo(carte);
	}

	public void showMenuMenus(View v2) {
		ContentFragment menu = new MenusFragment(parentActivity);

		Bundle bundle = new Bundle();
		bundle.putInt(MenusFragment.START, 0);
		menu.setArguments(bundle);

		parentActivity.goTo(menu);

	}

	public void showMenuChildren(View v3) {
		ContentFragment ch = new ChildrenMenuFragment(parentActivity);
		parentActivity.goTo(ch);

	}

	public void showMenuSearch(View v4) {
		ContentFragment search = new SearchFragment(parentActivity);
		parentActivity.goTo(search);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			// NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
