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

public class Mass extends Activity {
	
	public Spinner spinner1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mass);
		
		final EditText input = (EditText) findViewById(R.id.editText1);
		final	TextView y1 = (TextView) findViewById(R.id.textView1);
		final	TextView y2 = (TextView) findViewById(R.id.textView2);
		final	TextView y3 = (TextView) findViewById(R.id.textView3);
		final	TextView y4 = (TextView) findViewById(R.id.textView4);
		final	TextView y5 = (TextView) findViewById(R.id.textView5);
		final	TextView y6 = (TextView) findViewById(R.id.textView6);
		final	TextView y7 = (TextView) findViewById(R.id.textView7);
		final	TextView y8 = (TextView) findViewById(R.id.textView8);
		final	TextView y9 = (TextView) findViewById(R.id.textView9);
		final	TextView y10 = (TextView) findViewById(R.id.textView10);
		
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
				if (sp1.equals("Metric ton")) {
					
						Double mm = Double.valueOf(input.getText().toString());
						Double mm1 = mm;
						y1.setText(String.valueOf(mm1)+" "+"Metric ton");
					
					
						Double mm2 = mm * 1000;
						y2.setText(String.valueOf(mm2)+" "+"kilogram");
					
						Double mm3 = mm * 1e+6;
						y3.setText(String.valueOf(mm3)+" "+"Gram");
					
						Double mm4 = mm * 1e+9;
						y4.setText(String.valueOf(mm4)+" "+"Milligram");
					
						Double mm5 = mm * 1e+12;
						y5.setText(String.valueOf(mm5)+" "+"Mcg");
					
						Double mm6 = mm * 0.984207;
						y6.setText(String.valueOf(mm6)+" "+"Long ton");
					
						Double mm7 = mm * 1.10231;
						y7.setText(String.valueOf(mm7)+" "+"Short ton");
					
						Double mm8 = mm * 157.473;
						y8.setText(String.valueOf(mm8)+" "+"Stone");
					
						Double mm9 = mm * 2204.62;
						y9.setText(String.valueOf(mm9)+" "+"Pound");
					
						Double mm10 = mm * 35274;
						y10.setText(String.valueOf(mm10)+" "+"Ounce");
					

				}
				if (sp1.equals("Kilogram")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.001;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm ;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 1000;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm * 1e+6;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 1e+9;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm * 0.000984207;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 0.00110231;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm * 0.157473;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 2.20462;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm * 35.274;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");
				}
				if (sp1.equals("Gram")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1e-6;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 0.001;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm * 1000;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 1e+6;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm * 9.8421e-7;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 1.1023e-6;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm * 0.000157473;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 0.00220462;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm * 0.035274;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");

				}
				if (sp1.equals("Milligram")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1e-9;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 1e-6;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 0.001 ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm ;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 1000;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm * 9.8421e-10;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 1.1023e-9;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm * 1.5747e-7;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 2.2046e-6;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm * 3.5274e-5;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");
				}
				if (sp1.equals("Long ton")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1.01605;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 1016.05;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 1.016e+6 ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm *1.016e+9;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 1.016e+12;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm ;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 1.12;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm * 160;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 2240;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm * 35840;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");
				}
				if (sp1.equals("Short ton")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.907185;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 907.185;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 907185 ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm *9.072e+8;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 9.072e+11;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm *0.892857;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm ;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm * 142.857;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 2000;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm * 32000;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");

				}
				if (sp1.equals("Pound")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.000453592;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 0.453592;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 453.592 ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm *453592;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 4.536e+8;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm *0.000446429;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 0.0005;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm * 0.0714286;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm ;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm * 16;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");
				}
				if (sp1.equals("Stone")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.00635029;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 6.35029;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 6350.29 ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm *6.35e+6;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 6.35e+9;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm *0.00625;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 0.007;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm ;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 14;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm * 224;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");

				}
				if (sp1.equals("Ounce")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 2.835e-5;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 0.0283495;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 28.3495 ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm *28349.5;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm * 2.835e+7;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm *2.7902e-5;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 3.125e-5;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm *0.00446429 ;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 0.0625;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm ;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");
				}
				if (sp1.equals("Mcg")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 1e-12;
					y1.setText(String.valueOf(mm1)+" "+"Metric ton");
				
				
					Double mm2 = mm * 1e-9;
					y2.setText(String.valueOf(mm2)+" "+"kilogram");
				
					Double mm3 = mm * 1e-6 ;
					y3.setText(String.valueOf(mm3)+" "+"Gram");
				
					Double mm4 = mm *0.001;
					y4.setText(String.valueOf(mm4)+" "+"Milligram");
				
					Double mm5 = mm ;
					y5.setText(String.valueOf(mm5)+" "+"Mcg");
				
					Double mm6 = mm *9.8421e-13;
					y6.setText(String.valueOf(mm6)+" "+"Long ton");
				
					Double mm7 = mm * 1.1023e-12;
					y7.setText(String.valueOf(mm7)+" "+"Short ton");
				
					Double mm8 = mm *1.5747e-10 ;
					y8.setText(String.valueOf(mm8)+" "+"Stone");
				
					Double mm9 = mm * 2.2046e-9;
					y9.setText(String.valueOf(mm9)+" "+"Pound");
				
					Double mm10 = mm *3.5274e-8 ;
					y10.setText(String.valueOf(mm10)+" "+"Ounce");

				}

			}
		});
	}
	
}
