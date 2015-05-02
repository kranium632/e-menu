package com.ihm.e_menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuDesserts extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_desserts);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_desserts, menu);
		return true;
	}

}
