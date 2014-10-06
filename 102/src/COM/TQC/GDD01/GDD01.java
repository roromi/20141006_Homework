package COM.TQC.GDD01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class GDD01 extends Activity {
	
	Spinner sp1;
	EditText inputa;
	EditText inputhr;
	EditText inputm;
    Button btn;
    TextView tv1;
    int volt;
    
    
	//protected TextView MyOutcome;
	//protected int volt;
     
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        sp1 = (Spinner) findViewById(R.id.input_v);
        inputa = (EditText) findViewById(R.id.input_a);
        inputhr = (EditText) findViewById(R.id.input_hr);
        inputm = (EditText) findViewById(R.id.input_m);
        btn = (Button) findViewById(R.id.btn);
        tv1 = (TextView) findViewById(R.id.textView7);
        
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(GDD01.this, R.array.option_vs, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);   
        sp1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				volt = arg2;
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			
			}
		});
        
        btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int input_v = 0;
				if (volt == 0) {
					input_v =110;
				} else {
					input_v = 220;

				}
				
				double input_a =  Double.parseDouble(inputa.getText().toString());
				int input_hr = Integer.parseInt(inputhr.getText().toString());
				int input_m = Integer.parseInt(inputm.getText().toString());
				
				double w = input_v*input_a;
				
				int total = (int) Math.round(w/1000*input_hr*30*input_m);
				
				tv1.setText("$" + total);
			}
		}) ;
 
    }

}