package com.ihm.e_menu;

import java.util.Vector;

import com.ihm.e_menu.types.Boisson;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.GlobalBasket;
import com.ihm.e_menu.types.MenuA;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowMenusAsPopUp extends Activity {
	public MenuA m = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_menus_as_pop_up);

		Bundle extras = getIntent().getExtras();
		int id = extras.getInt(MenuMenus.MENU_ID);

		this.m = CompleteList.getMenus(id);
		final TextView textViewToChange = (TextView)findViewById(R.id.tv);
		if (this.m != null){
			String s = this.m.getDescription() + "\n";
			Vector<Boisson> b = this.m.getBoissons();
			if (b.size() > 0)
				s += "Liste des boissons comprise dans le menu :\n";
			for (int i = 0; i < b.size(); i++){
				s += "- " + b.get(i).getName() + "\n";
			}
			setTitle(m.getName());
			textViewToChange.setText(s);
		}
		else {
			textViewToChange.setText("Une erreur est survenue, veuillez contacter le personnel du restaurant.");
			setTitle("Une erreur est survenue.");
			final Button buttonToChange = (Button)findViewById(R.id.addToBasket);
			buttonToChange.setVisibility(View.INVISIBLE);
		}

	}

	public void addToBasket(View v){
		if (this.m != null)
			GlobalBasket.addMenu(m);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_menus_as_pop_up, menu);
		return true;
	}

}
