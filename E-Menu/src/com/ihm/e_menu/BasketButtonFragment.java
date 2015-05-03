package com.ihm.e_menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BasketButtonFragment extends Fragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.basket_button, container, false);
		Button b = (Button) v.findViewById(R.id.basketButton);
		b.setOnClickListener(this);
		return v;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.basketButton:
			showBasket(v);
			break;
		default:
			break;
		}
	}
	
	public void showBasket(View v){
		Fragment baskFrag = new BasketFragment();
		
		FragmentTransaction fragTrans = getFragmentManager().beginTransaction();
		
		fragTrans.replace(R.id.content, baskFrag);
		fragTrans.addToBackStack(null);

		fragTrans.commit();
	}
}
