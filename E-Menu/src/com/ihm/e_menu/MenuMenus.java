package com.ihm.e_menu;

import java.util.Vector;

import com.ihm.e_menu.R;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.MenuA;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class MenuMenus extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_menus);
		Vector<MenuA> m = CompleteList.getMenus();
		String s = m.get(0).getName();

		final Button buttonToChange = (Button)findViewById(R.id.menuMenusButton1);
		buttonToChange.setText(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_menus, menu);
		return true;
	}

}
