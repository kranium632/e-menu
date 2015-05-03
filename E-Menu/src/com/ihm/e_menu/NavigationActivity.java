package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class NavigationActivity extends FragmentActivity {
	public static final String HOME = "HOME";
	public static final String CARTE = "CARTE";
	public static final String MENUS = "MENUS";
	public static final String CHILDREN = "CHILDREN";
	public static final String SEARCH = "SEARCH";
	public static final String BASKET = "BASKET";
	
	
	NavigationFragment nav;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigation);
		
		nav = new NavigationFragment(this);
		MainMenuFragment content = new MainMenuFragment(this);
		BasketButtonFragment basket = new BasketButtonFragment();
		
		FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
		
		trans.add(R.id.buttonBasketFrame, basket);
		trans.add(R.id.navigation, nav);
		trans.add(R.id.content, content);
		
		trans.commit();
	}
	
	public void goTo(ContentFragment content){
		
		FragmentTransaction trans = getSupportFragmentManager().beginTransaction();

		trans.replace(R.id.content, content);
		trans.addToBackStack(null);

		trans.commit();

	}
	
	public void nowIn(String position){
		nav.nowIn(position);
	}

	
	
}
