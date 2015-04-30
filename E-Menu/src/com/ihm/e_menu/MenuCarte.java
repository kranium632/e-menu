package com.ihm.e_menu;

import com.ihm.e_menu.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MenuCarte extends Activity {

	
	public void showCarteStarters(View v1){
		Intent children = new Intent(this, MenuChildren.class);
		startActivity(children);
	}
	
	public void showCarteMeals(View v2){
		Intent search = new Intent(this, MenuSearch.class);
		startActivity(search);
	}
	
	public void showCarteDesserts(View v3){
		Intent search = new Intent(this, MenuDrinks.class);
		startActivity(search);
	}
	
	public void showCarteDrinks(View v4){
		Intent search = new Intent(this, MenuWines.class);
		startActivity(search);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_carte);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_carte, menu);
		return true;
	}

}
