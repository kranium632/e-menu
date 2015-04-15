package com.ihm.e_menu;

import com.ihm.e_menu.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuChildren extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_children);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_children, menu);
		return true;
	}

}
