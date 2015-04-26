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

public class Speed extends Activity implements OnClickListener {

	public Spinner spinner1;
	public Spinner spinner2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.speed);

		final EditText input = (EditText) findViewById(R.id.editText1);
		final TextView y1 = (TextView) findViewById(R.id.textView1);
		final TextView y2 = (TextView) findViewById(R.id.textView2);
		final TextView y3 = (TextView) findViewById(R.id.textView3);
		final TextView y4 = (TextView) findViewById(R.id.textView4);
		final TextView y5 = (TextView) findViewById(R.id.textView5);

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
				if (sp1.equals("Miles/hour")) {

					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm;
					y1.setText(String.valueOf(mm1) + " " + "Miles/hour");

					Double mm2 = mm * 1.46667;
					y2.setText(String.valueOf(mm2) + " " + "Feet/sec");

					Double mm3 = mm * 0.44704;
					y3.setText(String.valueOf(mm3) + " " + "Meters/sec");

					Double mm4 = mm * 1.60934;
					y4.setText(String.valueOf(mm4) + " " + "Km/hour");

					Double mm5 = mm * 0.868976;
					y5.setText(String.valueOf(mm5) + " " + "Knot");
				}

				if (sp1.equals("Feet/sec")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.681818;
					y1.setText(String.valueOf(mm1) + " " + "Miles/hour");

					Double mm2 = mm;
					y2.setText(String.valueOf(mm2) + " " + "Feet/sec");

					Double mm3 = mm * 0.3048;
					y3.setText(String.valueOf(mm3) + " " + "Meters/sec");

					Double mm4 = mm * 1.09728;
					y4.setText(String.valueOf(mm4) + " " + "Km/hour");

					Double mm5 = mm * 0.592484;
					y5.setText(String.valueOf(mm5) + " " + "Knot");
				}
				if (sp1.equals("Meters/sec")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 2.23694;
					y1.setText(String.valueOf(mm1) + " " + "Miles/hour");

					Double mm2 = mm * 3.28084;
					y2.setText(String.valueOf(mm2) + " " + "Feet/sec");

					Double mm3 = mm;
					y3.setText(String.valueOf(mm3) + " " + "Meters/sec");

					Double mm4 = mm * 3.6;
					y4.setText(String.valueOf(mm4) + " " + "Km/hour");

					Double mm5 = mm * 1.94384;
					y5.setText(String.valueOf(mm5) + " " + "Knot");
				}
				if (sp1.equals("Km/hour")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.621371;
					y1.setText(String.valueOf(mm1) + " " + "Miles/hour");

					Double mm2 = mm * 0.911344;
					y2.setText(String.valueOf(mm2) + " " + "Feet/sec");

					Double mm3 = mm * 0.277778;
					y3.setText(String.valueOf(mm3) + " " + "Meters/sec");

					Double mm4 = mm;
					y4.setText(String.valueOf(mm4) + " " + "Km/hour");

					Double mm5 = mm * 0.539957;
					y5.setText(String.valueOf(mm5) + " " + "Knot");

				}
				if (sp1.equals("Knot")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1.15078;
					y1.setText(String.valueOf(mm1) + " " + "Miles/hour");

					Double mm2 = mm * 1.68781;
					y2.setText(String.valueOf(mm2) + " " + "Feet/sec");

					Double mm3 = mm * 0.514444;
					y3.setText(String.valueOf(mm3) + " " + "Meters/sec");

					Double mm4 = mm * 1.852;
					y4.setText(String.valueOf(mm4) + " " + "Km/hour");

					Double mm5 = mm;
					y5.setText(String.valueOf(mm5) + " " + "Knot");

				}
			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
