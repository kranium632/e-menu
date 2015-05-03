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

public class MainMenuFragment extends Fragment implements OnClickListener {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Show the Up button in the action bar.
		//setupActionBar();
		//Initialisation du panier
		GlobalBasket.init();
		CompleteList.init(SQL_Access.getCompleteList());

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
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.activity_show_main_menu, container, false); 
		
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

	public void showMenuCarte(View v1){
		Fragment carte = new CarteFragment();
		
		FragmentTransaction trans = getFragmentManager().beginTransaction();
		
		trans.replace(R.id.content, carte);
		trans.addToBackStack(null);

		trans.commit();
	}
	
	public void showMenuMenus(View v2){
		Fragment menu = new MenusFragment();
		
		Bundle bundle = new Bundle();
		bundle.putInt(MenusFragment.START,0);
		menu.setArguments(bundle);
		
		FragmentTransaction trans = getFragmentManager().beginTransaction();
		
		trans.replace(R.id.content, menu);
		trans.addToBackStack(null);

		trans.commit();
		
	}
	
	public void showMenuChildren(View v3){
		Fragment ch = new ChildrenMenuFragment();
		
		FragmentTransaction trans = getFragmentManager().beginTransaction();
		
		trans.replace(R.id.content, ch);
		trans.addToBackStack(null);

		trans.commit();
	}
	
	public void showMenuSearch(View v4){
		Fragment search = new SearchFragment();
		
		FragmentTransaction trans = getFragmentManager().beginTransaction();
		
		trans.replace(R.id.content, search);
		trans.addToBackStack(null);

		trans.commit();
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
