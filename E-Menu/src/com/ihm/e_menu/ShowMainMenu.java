package com.ihm.e_menu;

import com.ihm.e_menu.sql.SQL_Access;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.GlobalBasket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ShowMainMenu extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_main_menu);
		// Show the Up button in the action bar.
		setupActionBar();
		//Initialisation du panier
		((GlobalBasket)this.getApplication()).init();
		((CompleteList)this.getApplication()).init(SQL_Access.getCompleteList());

		/*
		final TextView textViewToChange = (TextView)findViewById(R.id.welcome);
		Bundle extras = getIntent().getExtras();
		String welcomeString = "default text", language;
		
		if (savedInstanceState == null){
			extras = getIntent().getExtras();
			if(extras == null) {
				language = null;
			}
			else {
				language = extras.getString(MainActivity.LANGUAGE);
			}
		}
		else {
			language = (String)savedInstanceState.getSerializable(MainActivity.LANGUAGE);
		}
		if (language.equals(MainActivity.EN_LANGUAGE))
			welcomeString = "Welcome to our restaurant!";
		else if (language.equals(MainActivity.FR_LANGUAGE))
			welcomeString = "Bienvenue dans notre restaurant !";
		textViewToChange.setText(welcomeString);
		//*/
	}
	
	public void showMenuCarte(View v1){
		Intent carte = new Intent(this, MenuCarte.class);
		startActivity(carte);
	}
	
	public void showMenuMenus(View v2){
		Intent menus = new Intent(this, MenuMenus.class);
		startActivity(menus);
	}
	
	public void showMenuChildren(View v3){
		Intent children = new Intent(this, MenuChildren.class);
		startActivity(children);
	}
	
	public void showMenuSearch(View v4){
		Intent search = new Intent(this, MenuSearch.class);
		startActivity(search);
	}
	
	public void showMenuDrinks(View v5){
		Intent search = new Intent(this, MenuDrinks.class);
		startActivity(search);
	}
	
	public void showMenuWines(View v6){
		Intent search = new Intent(this, MenuWines.class);
		startActivity(search);
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_main_menu, menu);
		return true;
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
			//NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	

}
