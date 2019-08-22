package com.thearpit.rain.level;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.level.tile.Tile;

public class Level {
	
	protected int width, height;
	protected int[] levelpixels;
	protected int choice;
	
	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		levelpixels = new int[width * height];
		generateLevel();
	}
	
	public Level(String path) {
		loadLevel(path);
	}
	
	protected void generateLevel() {
	}
	
	protected void loadLevel(String path) {
		
	}
	
	private void time() {
	}
	
	public void update() {
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;
		
		for(int y = y0; y < y1; y++) {
			for(int x = x0; x < x1; x++) {
				screen.renderTile(x<<4, y<<4, getTile(x,y,choice));
			}
		}
	}
	
	public Tile getTile(int x, int y, int choice) {
    if(x < 0 || y < 0 || x >= (width) || y >= height) return Tile.voidTile;
	if(choice == 0) {
    if(levelpixels[x + y * width] == 0) return Tile.grass;
		if(levelpixels[x + y * width] == 1) return Tile.flower;
		if(levelpixels[x + y * width] == 2) return Tile.rock;
		if(levelpixels[x + y * width] == 3) return Tile.floor;
		return Tile.voidTile;
	}else
	{
		System.out.println(x +  y*width);
		 if(levelpixels[x + (y) * width] == 0xff4CFF00) return Tile.grass;
		 if(levelpixels[x + (y) * width] == 0xffFFD800) return Tile.flower;
		 if(levelpixels[x + (y) * width] == 0xff7F3300) return Tile.rock;
		 if(levelpixels[x + (y) * width] == 0xff808080) return Tile.floor;
		 return Tile.voidTile;
	}
	}

}