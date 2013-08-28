package com.apps.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public EditText etAmount;
	public TextView tvTipAmount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etAmount = (EditText) findViewById(R.id.etAmount);
		tvTipAmount = (TextView) findViewById(R.id.tvTipAmount);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void calculateTip(View v) {
		Button btntip = (Button) v;
		Double amount = Double.parseDouble(etAmount.getText().toString());
		Double tipPercentage = Integer.parseInt(btntip.getText().toString().replace("%",""))/100.0;
		Double tipAmount = amount * (tipPercentage);
		tvTipAmount.setText(tipAmount.toString());
		
	}

}
