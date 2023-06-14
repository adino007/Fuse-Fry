/*
 * 
 * 
 * 
 * 
 * 
 */
package com.apppoison.fusefry;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MusicPlayer extends MediaPlayer {
	Boolean isPlaying;
	Boolean isSoundEnabled;
	ToggleButton musicToggle;
	MediaPlayer music;

	public MusicPlayer(ToggleButton musicToggleB, Context context, int musicID) {
		this.musicToggle = musicToggleB;
		music = MediaPlayer.create(context, musicID);
		music.setLooping(true);
		isSoundEnabled = true;
	}

	@Override
	public void start() {
		musicToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					if (!music.isPlaying())
						music.start();
					isSoundEnabled = true;
				}
				if (!isChecked) {
					if (music.isPlaying())
						music.stop();
					isSoundEnabled = false;
				}

			}
		});
	}

	@Override
	public boolean isPlaying() {
		super.isPlaying();
		this.isPlaying = music.isPlaying();
		return isPlaying;
	}

	public void pauseIfPlaying() {
		if (music.isPlaying()) {
			music.pause();
			Log.d("MusicPlayer", "Music paused");
		}
	}

	public void resumeIfToggled() {
		if (isSoundEnabled) {
			music.start();
			Log.d("MusicPlayer", "Music resumed");
		}
	}

}
