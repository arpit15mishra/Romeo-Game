package com.thearpit.rain.level.tile;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.Graphics.Sprite;

public class GrassTile extends Tile {
	
	public GrassTile(Sprite sprite) {
		super(sprite);
	}
	public void display() {
		System.out.println("grass tile");
	}
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}