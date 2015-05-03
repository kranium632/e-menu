package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ContentFragment extends Fragment {

	protected NavigationActivity parent;
	public String nav_pos;
	
	
	public ContentFragment(NavigationActivity parent, String nav_pos){
		this.parent = parent;
		this.nav_pos = nav_pos;
	}
	
}
