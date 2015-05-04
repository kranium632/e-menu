package com.ihm.e_menu;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
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

		TextView tv = (TextView) v.findViewById(R.id.navHome);
		tv.setBackgroundColor(Color.LTGRAY);
		selected = tv;
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.navMenus);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.navCarte);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.navChildren);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.navSearch);
		tv.setOnClickListener(this);

		tv = (TextView) v.findViewById(R.id.navBasket);
		tv.setOnClickListener(this);

		return v;
	}

	@Override
	public void onClick(View v) {
		if (!v.equals(selected)) {
			ContentFragment content;
			switch (v.getId()) {
			case R.id.navHome:
				content = new MainMenuFragment(parent);
				parent.goTo(content);
				break;
			case R.id.navCarte:
				content = new CarteFragment(parent);
				parent.goTo(content);
				break;
			case R.id.navMenus:
				content = new MenusFragment(parent);
				parent.goTo(content);
				break;
			case R.id.navChildren:
				content = new ChildrenMenuFragment(parent);
				parent.goTo(content);
				break;
			case R.id.navSearch:
				content = new SearchFragment(parent);
				parent.goTo(content);
				break;
			case R.id.navBasket:
				content = new BasketFragment(parent);
				parent.goTo(content);
				break;
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
			select(getView().findViewById(R.id.navHome));
		}

		else if (menu.equals(NavigationActivity.CARTE)) {
			select(getView().findViewById(R.id.navCarte));
		}

		else if (menu.equals(NavigationActivity.MENUS)) {
			select(getView().findViewById(R.id.navMenus));
		}

		else if (menu.equals(NavigationActivity.CHILDREN)) {
			select(getView().findViewById(R.id.navChildren));
		}

		else if (menu.equals(NavigationActivity.SEARCH)) {
			select(getView().findViewById(R.id.navSearch));
		}

		else if (menu.equals(NavigationActivity.BASKET)) {
			select(getView().findViewById(R.id.navBasket));
		}

	}

}
