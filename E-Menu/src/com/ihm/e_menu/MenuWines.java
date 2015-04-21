package com.ihm.e_menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuWines extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_wines);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_wines, menu);
		return true;
	}

}
