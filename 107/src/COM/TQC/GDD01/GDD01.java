package COM.TQC.GDD01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GDD01 extends Activity {
  private static final String TAG = "Android_Log";
  private TextView tv;
  private Button b1;
  private Button b2;
  
  @Override
  public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    
    Log.i(TAG, "onCreate()");	
    tv=(TextView) findViewById(R.id.text1);;
    b1 = (Button) findViewById(R.id.button1);
    b2 = (Button) findViewById(R.id.button2);
    
    b1.setOnClickListener(new Button.OnClickListener(){
      public void onClick(View v){
    	Intent intent = new Intent(GDD01.this, GDD01_2.class);  
    	startActivityForResult(intent, 0);
    	  
    	  
    	  
      }
    });
    
    b2.setOnClickListener(new Button.OnClickListener(){
      public void onClick(View v){
      }
    });
  }
  
  @Override
  public void onStart(){
    super.onStart();
    Log.i(TAG, "onStart()");
  }
  @Override
  public void onResume(){
    super.onResume();
    Log.i(TAG, "onResume()");
  }
  @Override
  public void onPause(){
    super.onPause();
    Log.i(TAG, "onPause()");
  }
  @Override
  public void onStop(){
    super.onStop();
    Log.i(TAG, "onStop()");
  }
  @Override
  public void onRestart(){
    super.onRestart();
    Log.i(TAG, "onRestart()");
  }
  @Override
  public void onDestroy(){
    super.onDestroy();
    Log.i(TAG, "onDestroy()");
  }

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	super.onActivityResult(requestCode, resultCode, data);
	tv.setText("" + resultCode);
}
  
}