package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CarteListFragment extends ContentFragment {
	
	public static final String START = "start";	

	private ListAdapter adapter;

	
	public CarteListFragment(NavigationActivity parent, ListAdapter adapter) {
		super(parent, NavigationActivity.CARTE);
		this.adapter = adapter;
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.item_list_layout, container, false);
		
		ListView l = (ListView)v.findViewById(R.id.itemList);
		
		l.setAdapter(adapter);
		
		return v;
	}
	
}
