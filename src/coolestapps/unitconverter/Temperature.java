package coolestapps.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperature extends Activity implements OnClickListener {

	public Spinner spinnet1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.temperature);

		final EditText input = (EditText) findViewById(R.id.editText1);

		spinnet1 = (Spinner) findViewById(R.id.spinner1);

		final TextView y1 = (TextView) findViewById(R.id.textView1);
		final TextView y2 = (TextView) findViewById(R.id.textView2);
		final TextView y3 = (TextView) findViewById(R.id.textView3);

		Button calculate = (Button) findViewById(R.id.button1);

		calculate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (input.length() == 0) {
					Toast.makeText(v.getContext(), R.string.input_not_filled,
							Toast.LENGTH_SHORT).show();
					return;
				}
				// TODO Auto-generated method stub
				String sp1 = spinnet1.getSelectedItem().toString();

				if (sp1.equals("Celcius")) {

					Double ip = Double.valueOf(input.getText().toString());
					y1.setText(String.valueOf(ip) + " " + "Celcius");

					Double op = (ip * 9 / 5) + 32;
					y2.setText(String.valueOf(op) + " " + "Fahrenheit");

					Double op1 = ip + 273.15;
					y3.setText(String.valueOf(op1) + " " + "Kelvin");
				}

				if (sp1.equals("Fahrenheit")) {

					Double ip = Double.valueOf(input.getText().toString());
					Double op = (ip - 32) * 5 / 9;
					y1.setText(String.valueOf(op) + " " + "Celcius");

					y2.setText(String.valueOf(ip) + " " + "Fahrenheit");

					Double op1 = (ip - 32 / 1.8000) + 273;
					y3.setText(String.valueOf(op1));

				}
				if (sp1.equals("Kelvin")) {

					Double ip = Double.valueOf(input.getText().toString());
					Double op = (ip - 273.15);
					y1.setText(String.valueOf(op) + " " + "Celcius");

					Double op1 = (ip - 273.15) * 1.8000 + 32.00;
					y2.setText(String.valueOf(op1) + " " + "Fahrenheit");

					y3.setText(String.valueOf(ip) + " " + "Kelvin");

				}

			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub

	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}