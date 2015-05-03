package com.ihm.e_menu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class NavigationFragment extends Fragment implements OnClickListener {

	private NavigationActivity parent;
	private View selected = null;

	public NavigationFragment(NavigationActivity parent) {
		this.parent = parent;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.navigation_layout, container, false);

		TextView tv = (TextView) v.findViewById(R.id.nav_home);
		tv.setBackgroundColor(Color.LTGRAY);
		selected = tv;
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.nav_menus);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.nav_carte);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.nav_children);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.nav_search);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.nav_basket);
		tv.setOnClickListener(this);

		return v;
	}

	@Override
	public void onClick(View v) {
		if (!v.equals(selected)) {
			ContentFragment content;
			switch (v.getId()) {
			case R.id.nav_home:
				content = new MainMenuFragment(parent);
				parent.goTo(content);
				break;
			case R.id.nav_carte:
				content = new CarteFragment(parent);
				parent.goTo(content);
				break;
			case R.id.nav_menus:
				content = new MenusFragment(parent);
				parent.goTo(content);
				break;
			case R.id.nav_children:
				content = new ChildrenMenuFragment(parent);
				parent.goTo(content);
				break;
			case R.id.nav_search:
				content = new SearchFragment(parent);
				parent.goTo(content);
				break;
//			case R.id.nav_basket:
//				content = new BasketFragment(parent);
//				parent.goTo(content);
//				break;
			default:
				break;
			}
		}
	}

	private void select(View v) {
		if (!selected.equals(v)) {
			selected.setBackgroundColor(Color.BLACK);
			selected = v;
			v.setBackgroundColor(Color.LTGRAY);
		}
	}

	public void nowIn(String menu) {
		if (menu.equals(NavigationActivity.HOME)) {
			select(getView().findViewById(R.id.nav_home));
		}

		else if (menu.equals(NavigationActivity.CARTE)) {
			select(getView().findViewById(R.id.nav_carte));
		}

		else if (menu.equals(NavigationActivity.MENUS)) {
			select(getView().findViewById(R.id.nav_menus));
		}

		else if (menu.equals(NavigationActivity.CHILDREN)) {
			select(getView().findViewById(R.id.nav_children));
		}

		else if (menu.equals(NavigationActivity.SEARCH)) {
			select(getView().findViewById(R.id.nav_search));
		}

		else if (menu.equals(NavigationActivity.BASKET)) {
			select(getView().findViewById(R.id.nav_basket));
		}

	}

}
