package com.example.gd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnterActivity extends Activity {
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter);
	}

	public void btnClick(View v) {
		switch (v.getId()) {
		case R.id.ditu:
			intent = new Intent(this, MainActivity.class);
			startActivity(intent);
			break;
		case R.id.dingwei:
			intent = new Intent(this, DingWeiActivity.class);
			startActivity(intent);
			break;

		default:
			break;
		}

	}

}
