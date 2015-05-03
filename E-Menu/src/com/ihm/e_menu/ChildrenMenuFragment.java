package com.ihm.e_menu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class ChildrenMenuFragment extends ContentFragment {

	@SuppressLint("ValidFragment")
	public ChildrenMenuFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.CHILDREN);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parentActivity.nowIn(position);
		View v = inflater.inflate(R.layout.activity_menu_children, container,
				false);
		return v;
	}

}
