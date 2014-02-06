package csci567.simpleui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView txt = (TextView) findViewById(R.id.textView1);
		txt.setText("Simple UI");
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		
	}
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



	@Override
	public void onClick(View src) {
		
		TextView txt = (TextView) findViewById(R.id.textView1);

		switch(src.getId()){
			case R.id.button1:
				txt.setText("Button 1 Pressed");
				break;
			case R.id.button2:
				txt.setText("Button 2 Pressed");
				break;
		
		}
		
	}

}
