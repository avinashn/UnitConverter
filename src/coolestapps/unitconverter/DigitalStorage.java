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

public class DigitalStorage extends Activity {

	public Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ds);

		final EditText input = (EditText) findViewById(R.id.editText1);
		final TextView mm = (TextView) findViewById(R.id.textView1);
		final TextView cm = (TextView) findViewById(R.id.textView2);
		final TextView m = (TextView) findViewById(R.id.textView3);
		final TextView km = (TextView) findViewById(R.id.textView4);
		final TextView ft = (TextView) findViewById(R.id.textView5);

		final TextView in = (TextView) findViewById(R.id.textView6);
		final TextView mi = (TextView) findViewById(R.id.textView7);
		final TextView y = (TextView) findViewById(R.id.textView8);
		final TextView y1 = (TextView) findViewById(R.id.textView9);
		final TextView y2 = (TextView) findViewById(R.id.textView10);
		final TextView y3 = (TextView) findViewById(R.id.textView11);
		final TextView y4 = (TextView) findViewById(R.id.textView12);

		spinner1 = (Spinner) findViewById(R.id.spinner1);

		Button calculate = (Button) findViewById(R.id.button1);
		calculate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String sp1 = spinner1.getSelectedItem().toString();

				if (input.length() == 0) {
					Toast.makeText(v.getContext(), R.string.input_not_filled,
							Toast.LENGTH_SHORT).show();
					return;
				}
				if (sp1.equals("Bit")) {

					Double b = Double.valueOf(input.getText().toString());
					mm.setText(String.valueOf(b) + "  " + "Bits");

					Double a = b * 0.125;
					cm.setText(String.valueOf(a) + " " + "Byte");

					Double a1 = b * 0.000976563;
					m.setText(String.valueOf(a1) + " " + "Kilobit");

					Double a2 = b * 0.00012207;
					km.setText(String.valueOf(a2) + "  " + "KiloByte");

					Double a3 = b * 9.5367e-7;
					ft.setText(String.valueOf(a3) + " " + "Megabit");

					Double a4 = b * 1.1921e-7;
					in.setText(String.valueOf(a4) + " " + "MegaByte");

					Double a5 = b * 9.3132e-10;
					mi.setText(String.valueOf(a5) + " " + "Gigabit");

					Double a6 = b * 1.1642e-10;
					y.setText(String.valueOf(a6) + " " + "GigaByte");

					Double a7 = b * 9.0949e-13;
					y1.setText(String.valueOf(a7) + " " + "Terabit");

					Double a8 = b * 1.1369e-13;
					y2.setText(String.valueOf(a8) + " " + "TeraByte");

					Double a9 = b * 8.8818e-16;
					y3.setText(String.valueOf(a9) + " " + "Petabit");

					Double af = b * 1.1102e-16;
					y4.setText(String.valueOf(af) + " " + "PetaByte");
				}

				if (sp1.equals("Byte")) {

					Double b = Double.valueOf(input.getText().toString());
					cm.setText(String.valueOf(b) + " " + "Byte");

					Double a = b * 8;
					mm.setText(String.valueOf(a) + " " + "Bit");

					Double a1 = b * 0.0078125;
					m.setText(String.valueOf(a1) + " " + "Kilobit");

					Double a2 = b * 0.000976563;
					km.setText(String.valueOf(a2) + " " + "KiloByte");

					Double a3 = b * 7.6294e-6;
					ft.setText(String.valueOf(a3) + " " + "Megabit");

					Double a4 = b * 9.5367e-7;
					in.setText(String.valueOf(a4) + " " + "MegaByte");

					Double a5 = b * 7.4506e-9;
					mi.setText(String.valueOf(a5) + " " + "Gigabit");

					Double a6 = b * 9.3132e-10;
					y.setText(String.valueOf(a6) + " " + "GigaByte");

					Double a7 = b * 7.276e-12;
					y2.setText(String.valueOf(a7) + " " + "Terabit");

					Double a8 = b * 9.0949e-13;
					y1.setText(String.valueOf(a8) + " " + "TeraByte");

					Double a9 = b * 7.1054e-15;
					y3.setText(String.valueOf(a9) + " " + "Petabit");

					Double at = b * 8.8818e-16;
					y4.setText(String.valueOf(at) + " " + "PetaByte");
				}

				if (sp1.equals("Kilobit")) {
					Double b = Double.valueOf(input.getText().toString());
					m.setText(String.valueOf(b) + " " + "Kilobit");

					Double a = b * 128;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 1024;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 0.125;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 0.000976563;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 0.00012207;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 9.5367e-7;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 1.1921e-7;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 9.3132e-10;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 1.1642e-10;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 9.0949e-13;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 1.1369e-13;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");
				}

				if (sp1.equals("Kilobyte")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 8;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1024;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 8192;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 0.0078125;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 0.000976563;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 7.6294e-6;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 9.5367e-7;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 7.4506e-9;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 9.3132e-10;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 7.276e-12;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 9.0949e-13;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");

				}
				if (sp1.equals("Megabit")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 1024;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 131072;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 1.049e+6;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 128;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 0.125;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 0.000976563;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 0.00012207;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 9.5367e-7;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 1.1921e-7;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 9.3132e-10;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 1.1642e-10;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");
				}
				if (sp1.equals("Megabyte")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 8192;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1.049e+6;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 8.389e+6;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 1024;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 8;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 0.0078125;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 0.000976563;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 7.6294e-6;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 9.5367e-7;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 7.4506e-9;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 9.3132e-10;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");
				}
				if (sp1.equals("Gigabit")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 1.049e+6;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1.342e+8;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 1.074e+9;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 131072;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 1024;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 128;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 0.125;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 0.000976563;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 0.00012207;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 9.5367e-7;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 1.1921e-7;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");

				}
				if (sp1.equals("Gigabyte")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 8.389e+6;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1.074e+9;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 8.59e+9;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 1.049e+6;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 8192;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 1024;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 8;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 0.0078125;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 0.000976563;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 7.6294e-6;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 9.5367e-7;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");

				}
				if (sp1.equals("Terabit")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 1.074e+9;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1.374e+11;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 1.1e+12;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 1.342e+8;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 1.049e+6;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 131072;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 1024;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 128;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 0.125;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 0.000976563;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 0.00012207;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");

				}
				if (sp1.equals("Terabyte")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 8.59e+9;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1.1e+12;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 8.796e+12;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 1.074e+9;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 8.389e+6;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 1.049e+6;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 8192;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 1024;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 8;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 0.0078125;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 0.000976563;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");
				}

				if (sp1.equals("Petabit")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 1.1e+12;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1.126e+15;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 9.007e+15;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 1.374e+11;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 1.074e+9;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 1.342e+8;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 1.049e+6;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 131072;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 1024;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 128;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b * 0.125;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");
				}
				if (sp1.equals("Petabyte")) {
					Double b = Double.valueOf(input.getText().toString());
					Double ar = b * 8.796e+12;
					m.setText(String.valueOf(ar) + " " + "Kilobit");

					Double a = b * 1.126e+15;
					cm.setText(String.valueOf(a) + " " + "Bytes");

					Double a2 = b * 9.007e+15;
					km.setText(String.valueOf(a2) + " " + "Bits");

					Double a3 = b * 1.1e+12;
					y3.setText(String.valueOf(a3) + " " + "Kilobytes");

					Double a4 = b * 8.59e+9;
					y4.setText(String.valueOf(a4) + " " + "Megabits");

					Double a5 = b * 1.074e+9;
					y2.setText(String.valueOf(a5) + " " + "Megabytes");

					Double a6 = b * 8.389e+6;
					y1.setText(String.valueOf(a6) + " " + "Gigabit");

					Double as = b * 1.049e+6;
					y.setText(String.valueOf(as) + " " + "Gigabyte");

					Double ad = b * 8192;
					ft.setText(String.valueOf(ad) + " " + "Terabit");

					Double ac = b * 1024;
					mi.setText(String.valueOf(ac) + " " + "Terabyte");

					Double an = b * 8;
					in.setText(String.valueOf(an) + " " + "Petabit");

					Double ax = b;
					mm.setText(String.valueOf(ax) + " " + "Petabyte");
				}
			}

		});

	}

}
