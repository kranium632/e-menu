package com.ihm.e_menu;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ihm.e_menu.types.Plat;

public class CarteItemAdapter extends ArrayAdapter<Plat> {

	public CarteItemAdapter(Context context, int resource) {
		super(context, resource);
	}
	
	public CarteItemAdapter(Context context, int resource, List<Plat> list){
		super(context,resource,list);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
		
		if(v == null){
			LayoutInflater inflater = LayoutInflater.from(getContext());
			v = inflater.inflate(R.layout.item_list_row, null);
		}
		
		Plat p = getItem(position);
		
		TextView tv = (TextView) v.findViewById(R.id.itemName);
		tv.setText(p.getName());
		
		tv = (TextView) v.findViewById(R.id.itemPrice);
		tv.setText("  "+p.getPrix()+ "€");
		
		
		return v;
	}
	
}
