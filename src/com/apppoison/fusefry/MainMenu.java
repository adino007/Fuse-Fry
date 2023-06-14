package com.apppoison.fusefry;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainMenu extends Activity {
	ToggleButton musicToggle;
	MusicPlayer menuMusic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main_menu);
		musicToggle = (ToggleButton) findViewById(R.id.musicToggle);
	    menuMusic = new MusicPlayer(musicToggle,this,R.raw.mainmenu_music);
		menuMusic.start();
		
		Button play = (Button) findViewById(R.id.play);
		play.setOnClickListener(new View.OnClickListener() {
			MediaPlayer playClick;

			@Override
			public void onClick(View v) {
				playClick = MediaPlayer.create(MainMenu.this, R.raw.playbutton_click);
				if (menuMusic.isPlaying())
					menuMusic.pause();
				playClick.start();
				Intent intent = new Intent(MainMenu.this, GameActivityClass.class);
				startActivity(intent);
				Log.d("MainMenu-onCreate()", "MainMenu Activity Killed!");
				MainMenu.this.finish();

			}
		});
	}

	@Override
	protected void onPause() {
		super.onPause();
		menuMusic.pauseIfPlaying();
	}

	@Override
	protected void onResume() {
		super.onResume();
		menuMusic.resumeIfToggled();
	}

}