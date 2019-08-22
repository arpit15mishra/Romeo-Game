package com.thearpit.rain.level;

import java.util.Random;

public class RandomLevel extends Level{

	private static final Random r = new Random();
	private int[] tilesInt;
	
	public RandomLevel(int width, int height) {
		super(width, height);
		choice = 0;
		
	}
	
	protected void generateLevel() {
		for(int y = 0 ; y < height ; y++) {
			for(int x = 0 ; x < width ; x++) {
				levelpixels[x + y*width] = r.nextInt(4);
			}
		}
	}


}
