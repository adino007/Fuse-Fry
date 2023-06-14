package com.apppoison.fusefry;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class VerticalLineLayout extends View {

	private Paint lineUI;
	private Display display;
	private WindowManager wm;
	private Point firstStartPoint;
	private Point firstStopPoint;
	private Point secondStartPoint;
	private Point secondStopPoint;
	private Point thirdStartPoint;
	private Point thirdStopPoint;
	private Point fourthStartPoint;
	private Point fourthStopPoint;
	private Point fifthStartPoint;
	private Point fifthStopPoint;
	private float strokeWidth;


	public VerticalLineLayout(Context context) {
		super(context);
		wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		display = wm.getDefaultDisplay();
		lineUI = new Paint();
		lineUI.setColor(0xffffffff);
		lineUI.setStrokeWidth((float) (display.getWidth() * 0.01));
		strokeWidth = lineUI.getStrokeWidth();
		
		firstStartPoint = new Point(1, 0);
		firstStopPoint = new Point(1, display.getHeight());

		secondStartPoint = new Point((int) (display.getWidth() * 0.25), 0);
		secondStopPoint = new Point((int) (display.getWidth() * 0.25), display.getHeight());

		thirdStartPoint = new Point((int) (display.getWidth() * 0.5), 0);
		thirdStopPoint = new Point((int) (display.getWidth() * 0.5), display.getHeight());

		fourthStartPoint = new Point((int) (display.getWidth() * 0.75), 0);
		fourthStopPoint = new Point((int) (display.getWidth() * 0.75), display.getHeight());

		fifthStartPoint = new Point(display.getWidth() - 2, 0);
		fifthStopPoint = new Point(display.getWidth() - 2, display.getHeight());

	}
	public float getStrokeWidth(){
		return strokeWidth;
	}
	
	public int getFirstStartPointX() {
		return firstStartPoint.x;
	}

	public int getFirstStopPointX() {
		return firstStopPoint.x;
	}

	public int getSecondStartPointX() {
		return secondStartPoint.x;
	}

	public int getSecondStopPointX() {
		return secondStopPoint.x;
	}

	public int getThirdStartPointX() {
		return thirdStartPoint.x;
	}

	public int getThirdStopPointX() {
		return thirdStopPoint.x;
	}

	public int getFourthStartPointX() {
		return fourthStartPoint.x;
	}

	public int getFourthStopPointX() {
		return fourthStopPoint.x;
	}

	public int getFifthStartPointX() {
		return fifthStartPoint.x;
	}

	public int getFifthStopPointX() {
		return fifthStopPoint.x;
	}

	public int getFirstStartPointY() {
		return firstStartPoint.y;
	}

	public int getFirstStopPointY() {
		return firstStopPoint.y;
	}

	public int getSecondStartPointY() {
		return secondStartPoint.y;
	}

	public int getSecondStopPointY() {
		return secondStopPoint.y;
	}

	public int getThirdStartPointY() {
		return thirdStartPoint.y;
	}

	public int getThirdStopPointY() {
		return thirdStopPoint.y;
	}

	public int getFourthStartPointY() {
		return fourthStartPoint.y;
	}

	public int getFourthStopPointY() {
		return fourthStopPoint.y;
	}

	public int getFifthStartPointY() {
		return fifthStartPoint.y;
	}

	public int getFifthStopPointY() {
		return fifthStopPoint.y;
	}

	public float getLineWidth() {
		return lineUI.getStrokeWidth();
	}

	public void setFirstStartPointX(int firstStartPointX) {
		this.firstStartPoint.x = firstStartPointX;
	}

	public void setFirstStopPointX(int firstStopPointX) {
		this.firstStopPoint.x = firstStopPointX;
	}

	public void setSecondStartPointX(int secondStartPointX) {
		this.secondStartPoint.x = secondStartPointX;
	}

	public void setSecondStopPointX(int secondStopPointX) {
		this.secondStopPoint.x = secondStopPointX;
	}

	public void setThirdStartPointX(int thirdStartPointX) {
		this.thirdStartPoint.x = thirdStartPointX;
	}

	public void setThirdStopPointX(int thirdStopPointX) {
		this.thirdStopPoint.x = thirdStopPointX;
	}

	public void setFourthStartPointX(int fourthStartPointX) {
		this.fourthStartPoint.x = fourthStartPointX;
	}

	public void setFourthStopPointX(int fourthStopPointX) {
		this.fourthStopPoint.x = fourthStopPointX;
	}

	public void setFifthStartPointX(int fifthStartPointX) {
		this.fifthStartPoint.x = fifthStartPointX;
	}

	public void setFifthStopPointX(int fifthStopPointX) {
		this.fifthStopPoint.x = fifthStopPointX;
	}

	public void setFirstStartPointY(int firstStartPointY) {
		this.firstStartPoint.y = firstStartPointY;
	}

	public void setFirstStopPointY(int firstStopPointY) {
		this.firstStopPoint.y = firstStopPointY;
	}

	public void setSecondStartPointY(int secondStartPointY) {
		this.secondStartPoint.y = secondStartPointY;
	}

	public void setSecondStopPointY(int secondStopPointY) {
		this.secondStopPoint.y = secondStopPointY;
	}

	public void setThirdStartPointY(int thirdStartPointY) {
		this.thirdStartPoint.y = thirdStartPointY;
	}

	public void setThirdStopPointY(int thirdStopPointY) {
		this.thirdStopPoint.y = thirdStopPointY;
	}

	public void setFourthStartPointY(int fourthStartPointY) {
		this.fourthStartPoint.y = fourthStartPointY;
	}

	public void setFourthStopPointY(int fourthStopPointY) {
		this.fourthStopPoint.y = fourthStopPointY;
	}

	public void setFifthStartPointY(int fifthStartPointY) {
		this.fifthStartPoint.y = fifthStartPointY;
	}

	public void setFifthStopPointY(int fifthStopPointY) {
		this.fifthStopPoint.y = fifthStopPointY;
	}

	public void draw(Canvas canvas) {
		canvas.drawLine(firstStartPoint.x, firstStartPoint.y, firstStopPoint.x, firstStopPoint.y, lineUI);

		canvas.drawLine(secondStartPoint.x, secondStartPoint.y, secondStopPoint.x, secondStopPoint.y, lineUI);

		canvas.drawLine(thirdStartPoint.x, thirdStartPoint.y, thirdStopPoint.x, thirdStopPoint.y, lineUI);

		canvas.drawLine(fourthStartPoint.x, fourthStartPoint.y, fourthStopPoint.x, fourthStopPoint.y, lineUI);

		canvas.drawLine(fifthStartPoint.x, fifthStartPoint.y, fifthStopPoint.x, fifthStopPoint.y, lineUI);
	}

}
