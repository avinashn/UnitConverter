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

public class Area extends Activity {
	
	public Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.area1);

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

				if (sp1.equals("Hectare")) {
					Double ip = Double.valueOf(input.getText().toString());
					mm.setText(String.valueOf(ip) + "  " + "Hectare");

					Double cm1 = ip * 0.01;
					cm.setText(String.valueOf(cm1) + "  " + "Square Km");

					Double km1 = ip * 10000;
					km.setText(String.valueOf(km1) + "  " + "Square meter");

					Double m1 = ip * 0.00386102;
					m.setText(String.valueOf(m1) + "  " + "Square mile");

					Double f = ip * 2.47105;
					ft.setText(String.valueOf(f) + "  " + "Acre");

					Double mi1 = ip * 11959.9;
					in.setText(String.valueOf(mi1) + "  " + "Square yard");

					Double i = ip * 107639;
					mi.setText(String.valueOf(i) + "  " + "Square foot");

					Double ya = ip * 1.55e+7;
					y.setText(String.valueOf(ya) + "  " + "Square inch");

				}
				if (sp1.equals("Square Km")) {
					Double ip = Double.valueOf(input.getText().toString());

					Double mm1 = ip * 100;
					mm.setText(String.valueOf(mm1) + "  " + "Hectare");

					cm.setText(String.valueOf(ip) + "  " + "Square Km");

					Double km1 = ip * 1e+6;
					km.setText(String.valueOf(km1) + "  " + "Square meter");

					Double m1 = ip * 0.386102;
					m.setText(String.valueOf(m1) + "  " + "Square mile");

					Double f = ip * 247.105;
					ft.setText(String.valueOf(f) + "  " + "Acre");

					Double mi1 = ip * 1.196e+6;
					in.setText(String.valueOf(mi1) + "  " + "Square yard");

					Double i = ip * 1.076e+7;
					mi.setText(String.valueOf(i) + "  " + "Square foot");

					Double ya = ip * 1.55e+9;
					y.setText(String.valueOf(ya) + "  " + "Square inch");

				}
				if (sp1.equals("Square meter")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 1e-4;

					mm.setText(String.valueOf(mm1) + "  " + "Hectare");
					Double jj = ip * 1e-6;

					km.setText(String.valueOf(jj) + "  " + "Square Km");

					cm.setText(String.valueOf(ip) + "  " + "Square meter");

					Double m1 = ip * 3.861e-7;
					m.setText(String.valueOf(m1) + "  " + "Square mile");

					Double f = ip * 0.000247105;
					ft.setText(String.valueOf(f) + "  " + "Acre");

					Double mi1 = ip * 1.19599;
					in.setText(String.valueOf(mi1) + "  " + "Square yard");

					Double i = ip * 10.7639;
					mi.setText(String.valueOf(i) + "  " + "Square foot");

					Double ya = ip * 1550;
					y.setText(String.valueOf(ya) + "  " + "Square inch");

				}
				if (sp1.equals("Square mile")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 258.999;
					mm.setText(String.valueOf(mm1) + "  " + "Hectare");

					Double kk = ip * 2.58999;
					km.setText(String.valueOf(kk) + "  " + "Square Km");

					Double km1 = ip * 2.59e+6;
					cm.setText(String.valueOf(km1) + "  " + "Square meter");

					m.setText(String.valueOf(ip) + "  " + "Square mile");

					Double f = ip * 640;
					ft.setText(String.valueOf(f) + "  " + "Acre");

					Double mi1 = ip * 3.098e+6;
					in.setText(String.valueOf(mi1) + "  " + "Square yard");

					Double i = ip * 2.788e+7;
					mi.setText(String.valueOf(i) + "  " + "Square foot");

					Double ya = ip * 4.014e+9;
					y.setText(String.valueOf(ya) + "  " + "Square inch");

				}
				if (sp1.equals("Acre")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 0.404686;
					mm.setText(String.valueOf(mm1) + "  " + "Hectare");
					Double kk = ip * 0.00404686;
					km.setText(String.valueOf(kk) + "  " + "Square Km");
					Double km1 = ip * 4046.86;
					cm.setText(String.valueOf(km1) + "  " + "Square meter");
					Double m1 = ip * 0.0015625;
					m.setText(String.valueOf(m1) + "  " + "Square mile");

					ft.setText(String.valueOf(ip) + "  " + "Acre");
					Double mi1 = ip * 4840;
					in.setText(String.valueOf(mi1) + "  " + "Square yard");
					Double i = ip * 43560;
					mi.setText(String.valueOf(i) + "  " + "Square foot");
					Double ya = ip * 6.273e+6;
					y.setText(String.valueOf(ya) + "  " + "Square inch");

				}
				if (sp1.equals("Square yard")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 8.3613e-5;
					mm.setText(String.valueOf(mm1) + "  " + "Hectare");
					Double kk = ip * 8.3613e-7;
					km.setText(String.valueOf(kk) + "  " + "Square Km");
					Double km1 = ip * 0.836127;
					cm.setText(String.valueOf(km1) + "  " + "Square meter");
					Double m1 = ip * 3.2283e-7;
					m.setText(String.valueOf(m1) + "  " + "Square mile");
					Double ff = ip * 0.000206612;
					ft.setText(String.valueOf(ff) + "  " + "Acre");

					in.setText(String.valueOf(ip) + "  " + "Square yard");
					Double i = ip * 9;
					mi.setText(String.valueOf(i) + "  " + "Square foot");
					Double ya = ip * 1296;
					y.setText(String.valueOf(ya) + "  " + "Square inch");

				}
				if (sp1.equals("Square foot")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 9.2903e-6;
					mm.setText(String.valueOf(mm1) + "  " + "Hectare");
					Double kk = ip * 9.2903e-8;
					km.setText(String.valueOf(kk) + "  " + "Square Km");
					Double km1 = ip * 0.092903;
					cm.setText(String.valueOf(km1) + "  " + "Square meter");
					Double m1 = ip * 3.587e-8;
					m.setText(String.valueOf(m1) + "  " + "Square mile");
					Double ff = ip * 2.2957e-5;
					ft.setText(String.valueOf(ff) + "  " + "Acre");
					Double me = ip * 0.111111;
					in.setText(String.valueOf(me) + "  " + "Square yard");

					mi.setText(String.valueOf(ip) + "  " + "Square foot");
					Double ya = ip * 144;
					y.setText(String.valueOf(ya) + "  " + "Square inch");

				}
				if (sp1.equals("Square inch")) {
					Double ip = Double.valueOf(input.getText().toString());
					Double mm1 = ip * 6.4516e-8;
					mm.setText(String.valueOf(mm1) + "  " + "Hectare");
					Double kk = ip * 6.4516e-10;
					km.setText(String.valueOf(kk) + "  " + "Square Km");
					Double km1 = ip * 0.00064516;
					cm.setText(String.valueOf(km1) + "  " + "Square meter");
					Double m1 = ip * 2.494e-10;
					m.setText(String.valueOf(m1) + "  " + "Square mile");
					Double ff = ip * 1.5942e-7;
					ft.setText(String.valueOf(ff) + "  " + "Acre");
					Double ii = ip * 0.000771605;
					in.setText(String.valueOf(ii) + "  " + "Square yard");
					Double i = ip * 0.00694444;
					mi.setText(String.valueOf(i) + "  " + "Square foot");

					y.setText(String.valueOf(ip) + "  " + "Square inch");

				}
			}

		});
	}

}
