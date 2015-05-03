package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ChildrenMenuFragment extends ContentFragment {

	public ChildrenMenuFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.CHILDREN);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		parent.nowIn(nav_pos);
		View v = inflater.inflate(R.layout.activity_menu_children, container,
				false);
		return v;
	}

}
