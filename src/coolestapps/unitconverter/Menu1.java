package coolestapps.unitconverter;
// amazon store app.
import android.os.Bundle;

import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu1 extends ListActivity {

	String classes[] = { "Area", "DigitalStorage", "FuelConsumption", "Length",
			"Mass", "Speed", "Temperature", "Time", "Volume" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(Menu1.this,
				android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub

		super.onListItemClick(l, v, position, id);
		String cheese = classes[position];
		try {
			Class ourClass = Class.forName("coolestapps.unitconverter."
					+ cheese);
			Intent ourIntent = new Intent(Menu1.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
