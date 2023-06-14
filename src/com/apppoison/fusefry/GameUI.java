package com.apppoison.fusefry;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ToggleButton;

public class GameUI extends View {
	private Handler gameLoopHandler;
	private VerticalLineLayout vll;
	private HorizontalLines hls;
	private Boolean gameOver = false;
	private MusicPlayer gameMusic;// GameUI music
	private ToggleButton musicToggle;
	private boolean tappedToStart = false;
	private float gameSpeed;

	public GameUI(Context context) {
		super(context);
		// musicToggle = (Button) findViewById(R.id.musicToggle);

		// Checking if game has started to start game music...
		// while(gameNotStarted){
		//
		// }
		gameMusic = new MusicPlayer(musicToggle, context, R.raw.game_music);
		gameMusic.setLooping(true);
		Log.d("GameUI-onCreate()", "Music started");

		gameLoopHandler = new Handler();
		vll = new VerticalLineLayout(context);
		hls = new HorizontalLines(context);

		gameSpeed = 1;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawColor(0xff000000);
		if(tappedToStart)
			tappedToStart=true;
		vll.draw(canvas);
		hls.draw(canvas);
		if (gameOver == false) {
			/*
			 * add if statement if image tapped, set tappedToStart to true or
			 * make a button listener and set it to true
			 */
			
			if (tappedToStart) {
				gameMusic.start();
				hls.moveLines(1);
				/*
				 * add if statement if circuit not turned when it gets to the
				 * end of the screen, set gameOver to true
				 */
			}

			gameLoopHandler.postDelayed(new Runnable() {

				@Override
				public void run() {
					invalidate();
				}
			}, 1);
		}
		// gameSpeed *=1.5;
		if (gameOver) {
			gameMusic.stop();
			
			gameLoopHandler.removeCallbacks(null);
			// show the gameover screen with score etc...
		}

	}

}
