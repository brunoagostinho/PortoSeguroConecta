package br.com.conecta.lugares;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

@SuppressLint("NewApi") public class SplashScreen extends Activity {

	private boolean backbtnPress;
	private static final int SPLASH_DURATION = 3000;
	private Handler myHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//Hide ActionBar			
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		getActionBar().hide();
		
		
		
		setContentView(R.layout.activity_splash);

		myHandler = new Handler();
		myHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();

				if(!backbtnPress){

					Intent intent = new Intent(SplashScreen.this,LugaresActivity.class);
					SplashScreen.this.startActivity(intent);
				}

			}
		}, SPLASH_DURATION);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		backbtnPress = true;
		super.onBackPressed();
	}

}
