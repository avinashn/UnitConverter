package coolestapps.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Length extends Activity {

	public Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.length);

		final EditText input = (EditText) findViewById(R.id.editText1);
		final TextView mm = (TextView) findViewById(R.id.textView1);
		final TextView cm = (TextView) findViewById(R.id.textView2);
		final TextView m = (TextView) findViewById(R.id.textView3);
		final TextView km = (TextView) findViewById(R.id.textView4);
		final TextView ft = (TextView) findViewById(R.id.textView5);

		final TextView in = (TextView) findViewById(R.id.textView6);
		final TextView mi = (TextView) findViewById(R.id.textView7);
		final TextView y = (TextView) findViewById(R.id.textView8);

		spinner1 = (Spinner) findViewById(R.id.spinner1);
		Button calculate = (Button) findViewById(R.id.button1);
		calculate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String sp1 = spinner1.getSelectedItem().toString();

				if (input.length() == 0) {
					Toast.makeText(v.getContext(), R.string.input_not_filled,
							Toast.LENGTH_SHORT).show();
					return;
				}
				if (sp1.equals("Millimeters")) {
					Double ip = Double.valueOf(input.getText().toString());
					mm.setText(String.valueOf(ip) + "  " + "Millimeters");
					Double cm1 = ip * 0.1;
					cm.setText(String.valueOf(cm1) + "  " + "Centimeters");
					Double km1 = ip * 1.e-6;
					km.setText(String.valueOf(km1) + "  " + "Kilometers");
					Double m1 = ip * 0.001;
					m.setText(String.valueOf(m1) + "  " + "Meters");
					Double f = ip * 0.00328084;
					ft.setText(String.valueOf(f) + "  " + "Feet");
					Double mi1 = ip * 0.0393701;
					in.setText(String.valueOf(mi1) + "  " + "Inches");
					Double i = ip * 6.2137e-7;
					mi.setText(String.valueOf(i) + "  " + "Miles");
					Double ya = ip * 0.00109361;
					y.setText(String.valueOf(ya) + "  " + "Yards");

				}
				if (sp1.equals("Centimeters")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 10;
					mm.setText(String.valueOf(mm1) + "  " + "Millimeters");

					cm.setText(String.valueOf(ip) + "  " + "Centimeters");
					Double km1 = ip * 1.e-5;
					km.setText(String.valueOf(km1) + "  " + "Kilometers");
					Double m1 = ip * 0.01;
					m.setText(String.valueOf(m1) + "  " + "Meters");
					Double f = ip * 0.0328084;
					ft.setText(String.valueOf(f) + "  " + "Feet");
					Double mi1 = ip * 0.393701;
					in.setText(String.valueOf(mi1) + "  " + "Inches");
					Double i = ip * 6.2137e-6;
					mi.setText(String.valueOf(i) + "  " + "Miles");
					Double ya = ip * 0.0109361;
					y.setText(String.valueOf(ya) + "  " + "Yards");

				}
				if (sp1.equals("Kilometers")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 1e+6;
					mm.setText(String.valueOf(mm1) + "  " + "Milli meters");

					km.setText(String.valueOf(ip) + "  " + "Kilometers");
					Double km1 = ip * 100000;
					cm.setText(String.valueOf(km1) + "  " + "Centi meters");
					Double m1 = ip * 1000;
					m.setText(String.valueOf(m1) + "  " + "Meters");
					Double f = ip * 3280.84;
					ft.setText(String.valueOf(f) + "  " + "Feet");
					Double mi1 = ip * 39370.1;
					in.setText(String.valueOf(mi1) + "  " + "Inches");
					Double i = ip * 0.621371;
					mi.setText(String.valueOf(i) + "  " + "Miles");
					Double ya = ip * 1093.61;
					y.setText(String.valueOf(ya) + "  " + "Yards");

				}
				if (sp1.equals("Meters")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 1000;
					mm.setText(String.valueOf(mm1) + "  " + "Milli meters");
					Double kk = ip * 0.001;
					km.setText(String.valueOf(kk) + "  " + "kilo meters");
					Double km1 = ip * 100;
					cm.setText(String.valueOf(km1) + "  " + "Centi meters");
					
					m.setText(String.valueOf(ip) + "  " + "Meters");
					Double f = ip * 3.28084;
					ft.setText(String.valueOf(f) + "  " + "Feet");
					Double mi1 = ip * 39.3701;
					in.setText(String.valueOf(mi1) + "  " + "Inches");
					Double i = ip * 0.000621371;
					mi.setText(String.valueOf(i) + "  " + "Miles");
					Double ya = ip * 1.09361;
					y.setText(String.valueOf(ya) + "  " + "Yards");

				}
				if (sp1.equals("Feet")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 304.8;
					mm.setText(String.valueOf(mm1) + "  " + "Milli meters");
					Double kk = ip * 0.0003048;
					km.setText(String.valueOf(kk) + "  " + "kilo meters");
					Double km1 = ip * 30.48;
					cm.setText(String.valueOf(km1) + "  " + "Centi meters");
					Double m1 = ip * 0.3048;
					m.setText(String.valueOf(m1) + "  " + "Meters");

					ft.setText(String.valueOf(ip) + "  " + "Feet");
					Double mi1 = ip * 12;
					in.setText(String.valueOf(mi1) + "  " + "Inches");
					Double i = ip * 0.000189394;
					mi.setText(String.valueOf(i) + "  " + "Miles");
					Double ya = ip * 0.33;
					y.setText(String.valueOf(ya) + "  " + "Yards");

				}
				if (sp1.equals("Inches")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 25.4;
					mm.setText(String.valueOf(mm1) + "  " + "Milli meters");
					Double kk = ip * 2.54e-5;
					km.setText(String.valueOf(kk) + "  " + "kilo meters");
					Double km1 = ip * 2.54;
					cm.setText(String.valueOf(km1) + "  " + "Centi meters");
					Double m1 = ip * 0.0254;
					m.setText(String.valueOf(m1) + "  " + "Meters");
					Double ff = ip * 0.0833333;
					ft.setText(String.valueOf(ff) + "  " + "Feet");

					in.setText(String.valueOf(ip) + "  " + "Inches");
					Double i = ip * 1.5783e-5;
					mi.setText(String.valueOf(i) + "  " + "Miles");
					Double ya = ip * 0.277778;
					y.setText(String.valueOf(ya) + "  " + "Yards");

				}
				if (sp1.equals("Miles")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 1.609e+6;
					mm.setText(String.valueOf(mm1) + "  " + "Milli meters");
					Double kk = ip * 1.609034;
					km.setText(String.valueOf(kk) + "  " + "kilo meters");
					Double km1 = ip * 160934;
					cm.setText(String.valueOf(km1) + "  " + "Centi meters");
					Double m1 = ip * 1609.34;
					m.setText(String.valueOf(m1) + "  " + "Meters");
					Double ff = ip * 5280;
					ft.setText(String.valueOf(ff) + "  " + "Feet");
					Double me = ip * 63360;
					in.setText(String.valueOf(me) + "  " + "Inches");

					mi.setText(String.valueOf(ip) + "  " + "Miles");
					Double ya = ip * 1760;
					y.setText(String.valueOf(ya) + "  " + "Yards");

				}
				if (sp1.equals("Yards")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 914.4;
					mm.setText(String.valueOf(mm1) + "  " + "Milli meters");
					Double kk = ip * 0.0009144;
					km.setText(String.valueOf(kk) + "  " + "kilo meters");
					Double km1 = ip * 91.44;
					cm.setText(String.valueOf(km1) + "  " + "Centi meters");
					Double m1 = ip * 0.9144;
					m.setText(String.valueOf(m1) + "  " + "Meters");
					Double ff = ip * 3;
					ft.setText(String.valueOf(ff) + "  " + "Feet");
					Double ii = ip * 36;
					in.setText(String.valueOf(ii) + "  " + "Inches");
					Double i = ip * 0.000568182;
					mi.setText(String.valueOf(i) + "  " + "Miles");

					y.setText(String.valueOf(ip) + "  " + "Yards");

				}
			}
		});
	}

	
}
