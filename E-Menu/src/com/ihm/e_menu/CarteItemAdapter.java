package com.ihm.e_menu;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
		

		TextView tv = (TextView) v.findViewById(R.id.itemQuantity);
		tv.setText(""+p.getNumberInBasket());
		
		Button b = (Button)v.findViewById(R.id.itemAddToBasket);
		b.setOnClickListener(new AddToBasket(p,tv));
		
		b = (Button)v.findViewById(R.id.itemRemoveFromBasket);
		b.setOnClickListener(new RemoveFromBasket(p,tv));
		
		
		tv = (TextView) v.findViewById(R.id.itemName);
		tv.setText(p.getName());
		
		tv = (TextView) v.findViewById(R.id.itemPrice);
		tv.setText("  "+p.getPrix()+ "€");
		
		
		return v;
	}

	private class AddToBasket implements OnClickListener {

		private Plat p;
		private TextView qty;
		
		public AddToBasket(Plat p, TextView qty){
			this.p = p;
			this.qty = qty;
		}
		
		@Override
		public void onClick(View v) {
			p.addToBasket();
			int nb = Integer.parseInt((String) qty.getText());
			nb++;
			qty.setText(""+nb);
			
			String text = p.getName() +" ajouté au panier";
			Toast toast = Toast.makeText(getContext(), text,Toast.LENGTH_SHORT);
			toast.show();
		}	
	}
	
	private class RemoveFromBasket implements OnClickListener {

		private Plat p;
		private TextView qty;
		
		public RemoveFromBasket(Plat p, TextView qty){
			this.p = p;
			this.qty = qty;
		}
		
		@Override
		public void onClick(View v) {
			int nb = Integer.parseInt((String) qty.getText());
			if(nb > 0){
				p.removeFromBasket();
				nb--;
				qty.setText(""+nb);
				
				String text = p.getName() +" supprimé du panier";
				Toast toast = Toast.makeText(getContext(), text,Toast.LENGTH_SHORT);
				toast.show();
			}

		}	
	}
}
