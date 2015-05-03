package com.ihm.e_menu;

import java.util.Vector;

import com.ihm.e_menu.sql.SQL_Access;
import com.ihm.e_menu.types.CompleteList;
import com.ihm.e_menu.types.MenuA;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class ChildrenMenuFragment extends ContentFragment {

	public ChildrenMenuFragment(NavigationActivity parent) {
		super(parent, NavigationActivity.CHILDREN);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.carte_template_layout, container, false);
		Vector<MenuA> menus = CompleteList.getMenus();

		//On affiche d'abord les menus, ensuite les plats et enfin les boissons
		LinearLayout basketLayout = (LinearLayout) v.findViewById(R.id.carteTemplateLayout);
		TextView tv;
		basketLayout.removeAllViews();
		int len = menus.size();
		boolean empty = true;
		for (int i = 0; i < len; i++){
			if (menus.get(i).getType() == SQL_Access.MENU_ENFANT){
				empty = false;
				break;
			}
		}
		if (empty){
			tv = new TextView(v.getContext());
			tv.setText("La carte ne contient actuellement aucun menu enfant.\nVeuillez nous en excuser.");
			basketLayout.addView(tv);
		}
		else {
			for (int i = 0; i < len; i++){
				MenuA m = menus.get(i);
				if (m.getType() == SQL_Access.MENU_ENFANT){
					tv = new TextView(v.getContext());
					tv.setText(m.getName() + " - " + m.getPrix() + "€");
					basketLayout.addView(tv);
				}
			}
		}
		return v;
	}

}
