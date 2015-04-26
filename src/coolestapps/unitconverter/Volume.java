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

public class Volume extends Activity {

	public Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.volume);

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
		final TextView y13 = (TextView) findViewById(R.id.textView13);
		final TextView y14 = (TextView) findViewById(R.id.textView14);
		final TextView y15 = (TextView) findViewById(R.id.textView15);
		final TextView y16 = (TextView) findViewById(R.id.textView16);
		final TextView y17 = (TextView) findViewById(R.id.textView17);
		final TextView y18 = (TextView) findViewById(R.id.textView18);

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
				if (sp1.equals("US gal")) {

					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 4;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 8;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 16;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 128;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 256;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 768;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.00378541;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 3.78541;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 3785.41;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.832674;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 3.3307;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 6.66139;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 133.228;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 213.165;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 639.494;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.133681;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 231;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}

				if (sp1.equals("US quart")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.25;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 2;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 4;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 32;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 64;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 192;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.000946353;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.946353;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 946.353;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.208168;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.832674;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 1.66535;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 33.307;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 53.2911;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 159.873;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.0334201;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 57.75;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("US pint")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.125;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.5;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 2;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 16;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 32;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 96;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.000473176;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.473176;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 473.176;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.104084;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.416337;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.832674;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 16.6535;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 26.6456;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 79.9367;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.0167101;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 28.875;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("US cup")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.0625;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.25;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.5;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 8;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 16;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 48;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.000236588;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.236588;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 236.588;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.0520421;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.208168;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.416337;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 8.32674;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 13.3228;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 39.9683;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.00835503;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 14.4375;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("US oz")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.0078125;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.03125;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.0625;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.125;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 2;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 6;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 2.9574e-5;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.0295735;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 29.5735;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.00650526;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.0260211;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.0520421;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 1.04084;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 1.66535;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 4.99604;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.00104438;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 1.80469;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");

				}
				if (sp1.equals("US tbsp.")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.00390625;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.015625;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.03125;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.0625;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 0.5;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 3;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 1.4787e-5;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.0147868;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 14.7868;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.00325263;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.0130105;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.0260211;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 0.520421;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 0.832674;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 2.49802;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.00052219;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 0.902344;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");

				}
				if (sp1.equals("US tsp.")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.00130208;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.00520833;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.0104167;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.0208333;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 0.166667;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 0.333333;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 4.9289e-6;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.00492892;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 4.92892;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.00108421;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.00433684;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.00867369;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 0.173474;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 0.277558;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 0.832674;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.000174063;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 0.300781;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("Cubic meter")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 264.172;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 1056.69;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 2113.38;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 4226.75;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 33814;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 67628;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 202884;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 1000;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 1e+6;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 219.969;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 879.877;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 1759.75;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 35195.1;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 56312.1;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 168936;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 35.3147;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 61023.7;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("Liter")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.264172;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 1.05669;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 2.11338;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 4.22675;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 33.814;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 67.628;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 202.884;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.001;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 1000;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.219969;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.879877;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 1.75975;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 35.1951;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 56.3121;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 168.936;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.0353147;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 61.0237;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("Milliliter")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.000264172;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.00105669;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.00211338;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.00422675;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 0.033814;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 0.067628;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 0.202884;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 1e-6;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.001;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.000219969;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.000879877;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.00175975;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 0.0351951;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 0.0563121;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 0.168936;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 3.5315e-5;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 0.0610237;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("Imperial gal")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1.20095;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 4.8038;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 9.6076;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 19.2152;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 153.722;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 307.443;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 922.33;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.00454609;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 4.54609;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 4546.09;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 4;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 8;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 160;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 256;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 768;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.160544;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 277.42;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("Imperial quart")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.300238;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 1.20095;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 2.4019;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 4.8038;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 38.4304;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 76.8608;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 230.582;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.00113652;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 1.13652;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 1136.52;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.25;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 2;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 40;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 64;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 192;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.0401359;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 69.3549;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("Imperial pint")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.150119;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.600475;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 1.20095;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 2.4019;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 19.2152;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 38.4304;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 115.291;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.000568261;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.568261;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 568.261;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.125;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.5;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 20;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 32;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 96;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.020068;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 34.6774;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");

				}
				if (sp1.equals("Imperial oz")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.00750594;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.0300238;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.0600475;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.120095;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 0.96076;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 1.92152;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 5.76456;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 2.8413e-5;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.0284131;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 28.4131;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.00625;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.025;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.05;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 1.6;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 4.8;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.0010034;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 1.73387;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");

				}
				if (sp1.equals("Imperial tbsp.")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.00469121;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.0187649;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.0375297;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.0750594;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 0.600475;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 1.20095;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 3.60285;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 1.7758e-5;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.0177582;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 17.7582;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.00390625;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.015625;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.03125;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 0.625;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 3;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.000627124;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 1.08367;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");
				}
				if (sp1.equals("Imperial tsp.")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.00156374;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.00625495;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.0125099;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.0250198;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 0.200158;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 0.400317;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 1.20095;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 5.9194e-6;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.00591939;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 5.91939;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.00130208;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.00520833;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.0104167;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 0.208333;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 0.333333;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.000209041;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 0.361223;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");

				}
				if (sp1.equals("Cubic foot")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 7.48052;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 29.9221;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 59.8442;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 119.688;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 957.506;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 1915.01;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 5745.04;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 0.0283168;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 28.3168;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 28316.8;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 6.22883;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 24.9153;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 49.8307;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 996.613;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 1594.58;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 4783.74;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm * 1728;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");

				}
				if (sp1.equals("Cubic inch")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.004329;
					y1.setText(String.valueOf(mm1) + " " + "US gal");

					Double mm2 = mm * 0.017316;
					y2.setText(String.valueOf(mm2) + " " + "US quart");

					Double mm3 = mm * 0.034632;
					y3.setText(String.valueOf(mm3) + " " + "US pint");

					Double mm4 = mm * 0.0692641;
					y4.setText(String.valueOf(mm4) + " " + "US cup");

					Double mm5 = mm * 0.554113;
					y5.setText(String.valueOf(mm5) + " " + "US oz");

					Double mm6 = mm * 1.10823;
					y6.setText(String.valueOf(mm6) + " " + "US tbsp.");

					Double mm7 = mm * 3.32468;
					y7.setText(String.valueOf(mm7) + " " + "US tsp.");

					Double mm8 = mm * 1.6387e-5;
					y8.setText(String.valueOf(mm8) + " " + "Cubic meter");

					Double mm9 = mm * 0.0163871;
					y9.setText(String.valueOf(mm9) + " " + "Liter");

					Double mm10 = mm * 16.3871;
					y10.setText(String.valueOf(mm10) + " " + "Milliliter");

					Double mm11 = mm * 0.00360465;
					y11.setText(String.valueOf(mm11) + " " + "Imperial gal");

					Double mm12 = mm * 0.0144186;
					y12.setText(String.valueOf(mm12) + " " + "Imperial quart");

					Double mm13 = mm * 0.0288372;
					y13.setText(String.valueOf(mm13) + " " + "Imperial pint");

					Double mm14 = mm * 0.576744;
					y14.setText(String.valueOf(mm14) + " " + "Imperial oz");

					Double mm15 = mm * 0.92279;
					y15.setText(String.valueOf(mm15) + " " + "Imperial tbsp.");

					Double mm16 = mm * 2.76837;
					y16.setText(String.valueOf(mm16) + " " + "Imperial tsp.");

					Double mm17 = mm * 0.000578704;
					y17.setText(String.valueOf(mm17) + " " + "Cubic foot");

					Double mm18 = mm;
					y18.setText(String.valueOf(mm18) + " " + "Cubic inch");

				}
			}
		});
	}

}
