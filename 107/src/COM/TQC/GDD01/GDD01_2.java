package COM.TQC.GDD01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GDD01_2 extends Activity {
	Button btn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mylayout);
		btn2 = (Button) findViewById(R.id.button2);
		
		
		btn2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				setResult(99, getIntent());
				finish();
			
			}
		});
	}
	
	
	

}
