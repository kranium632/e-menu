package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SearchFragment extends ContentFragment {
	
	public SearchFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.SEARCH);
		}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parent.nowIn(nav_pos);
		View v = inflater.inflate(R.layout.activity_menu_search, container,
				false);
		return v;
	}

}
