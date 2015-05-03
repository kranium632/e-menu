package com.ihm.e_menu;

import android.support.v4.app.Fragment;

public abstract class ContentFragment extends Fragment {

	protected NavigationActivity parentActivity;
	public String position;
	
	
	public ContentFragment(NavigationActivity parent, String nav_pos){
		this.parentActivity = parent;
		this.position = nav_pos;
	}
	
}
