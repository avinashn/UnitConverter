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

public class FuelConsumption extends Activity {
	
	public Spinner spinner1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.fuel);
		
		final EditText input = (EditText) findViewById(R.id.editText1);
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		final TextView y1 = (TextView) findViewById(R.id.textView1);
		final TextView y2 = (TextView) findViewById(R.id.textView2);
		final TextView y3 = (TextView) findViewById(R.id.textView3);
		final TextView y4 = (TextView) findViewById(R.id.textView4);
		
		
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
				if (sp1.equals("MPG(US)")) {
					
						Double mm = Double.valueOf(input.getText().toString());
						Double mm1 = mm;
						y1.setText(String.valueOf(mm1)+ " "+"MPG(US)");
					 
						
						Double mm2 = mm * 1.20095;
						y2.setText(String.valueOf(mm2)+" "+"MPG(imp.)");
				
						Double mm3 = mm * 0.425144;
						y3.setText(String.valueOf(mm3)+" "+"Km/liter");
					
						Double mm4 = mm * 235.215;
						y4.setText(String.valueOf(mm4)+" "+"Liter/100Km");
					
				}
				if (sp1.equals("MPG(imp.)")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 0.832674;
					y1.setText(String.valueOf(mm1)+ " "+"MPG(US)");
				 
					
					Double mm2 = mm ;
					y2.setText(String.valueOf(mm2)+" "+"MPG(imp.)");
			
					Double mm3 = mm * 0.354006;
					y3.setText(String.valueOf(mm3)+" "+"Km/liter");
				
					Double mm4 = mm * 282.481;
					y4.setText(String.valueOf(mm4)+" "+"Liter/100Km");
				}
				if (sp1.equals("Km/liter")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 2.35215;
					y1.setText(String.valueOf(mm1)+ " "+"MPG(US)");
				 
					
					Double mm2 = mm * 2.82481 ;
					y2.setText(String.valueOf(mm2)+" "+"MPG(imp.)");
			
					Double mm3 = mm ;
					y3.setText(String.valueOf(mm3)+" "+"Km/liter");
				
					Double mm4 = mm * 100;
					y4.setText(String.valueOf(mm4)+" "+"Liter/100Km");
				}
				if (sp1.equals("Liter/100Km")) {
					Double mm = Double.valueOf(input.getText().toString());
					Double mm1 = mm * 235.215;
					y1.setText(String.valueOf(mm1)+ " "+"MPG(US)");
				 
					
					Double mm2 = mm * 282.481 ;
					y2.setText(String.valueOf(mm2)+" "+"MPG(imp.)");
			
					Double mm3 = mm *100 ;
					y3.setText(String.valueOf(mm3)+" "+"Km/liter");
				
					Double mm4 = mm ;
					y4.setText(String.valueOf(mm4)+" "+"Liter/100Km");
				}
			}
		});
	}
	
}
