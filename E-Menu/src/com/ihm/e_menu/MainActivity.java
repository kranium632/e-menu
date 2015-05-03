package com.ihm.e_menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	public final static String LANGUAGE = "com.ihm.e_menu.LANGUAGE";
	public final static String FR_LANGUAGE = "fr_FR";
	public final static String EN_LANGUAGE = "en_UK";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void showMenuFR(View view){
		Intent intent = new Intent(this, NavigationActivity.class);
		intent.putExtra(LANGUAGE, FR_LANGUAGE);
		startActivity(intent);
	}
	
	public void showMenuEN(View view){
		Intent intent = new Intent(this, MainMenuFragment.class);
		intent.putExtra(LANGUAGE, EN_LANGUAGE);
		startActivity(intent);
	}

}
