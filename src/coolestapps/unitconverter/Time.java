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

public class Time extends Activity {

	public Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.time);

		final EditText input = (EditText) findViewById(R.id.editText1);
		final TextView y1 = (TextView) findViewById(R.id.textView1);
		final TextView y2 = (TextView) findViewById(R.id.textView2);
		final TextView y3 = (TextView) findViewById(R.id.textView3);
		final TextView y4 = (TextView) findViewById(R.id.textView4);
		final TextView y5 = (TextView) findViewById(R.id.textView5);
		final TextView y6 = (TextView) findViewById(R.id.textView6);
		final TextView y7 = (TextView) findViewById(R.id.textView7);
		final TextView y8 = (TextView) findViewById(R.id.textView8);
		final TextView y9 = (TextView) findViewById(R.id.textView9);
		final TextView y10 = (TextView) findViewById(R.id.textView10);
		final TextView y11 = (TextView) findViewById(R.id.textView11);
		final TextView y12 = (TextView) findViewById(R.id.textView12);

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
				if (sp1.equals("Nanosecond")) {

					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 0.001;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 1e-6;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 1e-9;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 1.6667e-11;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 2.7778e-13;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 1.1574e-14;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 1.6534e-15;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 3.8027e-16;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 3.1689e-17;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 3.1689e-18;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 3.1689e-19;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}

				if (sp1.equals("Microsecond")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1000;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 0.001;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 1e-6;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 1.6667e-8;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 2.7778e-10;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 1.1574e-11;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 1.6534e-12;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 3.8027e-13;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 3.1689e-14;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 3.1689e-15;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 3.1689e-16;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Millisecond")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1e+6;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 1000;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 0.001;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 1.6667e-5;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 2.7778e-7;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 1.1574e-8;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 1.6534e-9;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 3.8027e-10;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 3.1689e-11;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 3.1689e-12;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 3.1689e-13;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Second")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1e+9;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 1e+6;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 1000;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 0.0166667;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 0.000277778;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 1.1574e-5;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 1.6534e-6;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 3.8027e-7;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 3.1689e-8;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 3.1689e-9;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 3.1689e-10;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Minute")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 6e+10;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 6e+7;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 60000;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm;
					y4.setText(String.valueOf(mm4) + " " + "Minute");

					Double mm5 = mm * 0.0166667;
					y5.setText(String.valueOf(mm5) + " " + "Hour");

					Double mm6 = mm * 60;
					y6.setText(String.valueOf(mm6) + " " + "Seconds");

					Double mm7 = mm * 0.000694444;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 9.9206e-5;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 2.2816e-5;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 1.9013e-6;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 1.9013e-7;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 1.9013e-8;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Hour")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 3.6e+12;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 3.6e+9;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 3.6e+6;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 3600;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 60;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 0.0416667;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 0.00595238;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 0.00136895;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 0.00011408;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 1.1408e-5;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 1.1408e-6;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Day")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 8.64e+13;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 8.64e+10;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 8.64e+7;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 86400;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 1440;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 24;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 0.142857;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 0.0328549;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 0.00273791;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 0.000273791;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 2.7379e-5;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Week")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 6.048e+14;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 6.048e+11;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 6.048e+8;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 604800;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 10080;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 168;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 7;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 0.229984;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 0.0191654;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 0.00191654;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 0.000191654;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Month")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 2.63e+15;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 2.63e+12;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 2.63e+9;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 2.63e+6;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 43829.1;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 730.484;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 30.4368;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 4.34812;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 0.0833333;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 0.00833333;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 0.000833333;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}

				if (sp1.equals("Year")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 3.156e+16;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 3.156e+13;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 3.156e+10;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 3.156e+7;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 525949;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 8765.81;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 365.242;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 52.1775;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 12;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 0.1;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 0.01;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Decade")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 3.156e+17;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 3.156e+14;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 3.156e+11;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 3.156e+8;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 5.259e+6;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 87658.1;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 3652.42;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 521.775;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 120;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 10;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm * 0.1;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}
				if (sp1.equals("Century")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 3.156e+18;
					y1.setText(String.valueOf(mm1) + " " + "Nanosecond");

					Double mm2 = mm * 3.156e+15;
					y2.setText(String.valueOf(mm2) + " " + "Microsecond");

					Double mm3 = mm * 3.156e+12;
					y3.setText(String.valueOf(mm3) + " " + "Millisecond");

					Double mm4 = mm * 3.156e+9;
					y4.setText(String.valueOf(mm4) + " " + "Second");

					Double mm5 = mm * 5.259e+7;
					y5.setText(String.valueOf(mm5) + " " + "Minute");

					Double mm6 = mm * 876581;
					y6.setText(String.valueOf(mm6) + " " + "Hour");

					Double mm7 = mm * 36524.2;
					y7.setText(String.valueOf(mm7) + " " + "Day");

					Double mm8 = mm * 5217.75;
					y8.setText(String.valueOf(mm8) + " " + "Week");

					Double mm9 = mm * 1200;
					y9.setText(String.valueOf(mm9) + " " + "Month");

					Double mm10 = mm * 100;
					y10.setText(String.valueOf(mm10) + " " + "Year");

					Double mm11 = mm * 10;
					y11.setText(String.valueOf(mm11) + " " + "Decade");

					Double mm12 = mm;
					y12.setText(String.valueOf(mm12) + " " + "Century");
				}

			}
		});
	}

}
