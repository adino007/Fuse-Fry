package com.apppoison.fusefry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class BootScreen_LOGO extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//This line is for hiding the status bar(Making the activity fullscreen).
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_boot_screen__logo);
		//The Thread "loader" is to load the Main Menu and the game components.
		Thread loader = new Thread(){
			@Override
			public void run(){
				try{
					sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent intent = new Intent(BootScreen_LOGO.this, MainMenu.class);
					startActivity(intent);
					BootScreen_LOGO.this.finish();
				}
			}
		};
		loader.start();

	}
}
