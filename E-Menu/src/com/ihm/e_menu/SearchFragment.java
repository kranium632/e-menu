package com.ihm.e_menu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class SearchFragment extends ContentFragment {
	
	public SearchFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.SEARCH);
		}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parentActivity.nowIn(position);
		View v = inflater.inflate(R.layout.activity_menu_search, container,
				false);
		return v;
	}

}
