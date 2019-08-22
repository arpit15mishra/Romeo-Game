package com.thearpit.rain.level.tile;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.Graphics.Sprite;

public class Spawn_RockTile extends Tile{
	
	public Spawn_RockTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	public void display() {
		System.out.println("rock tile");
	}
	public boolean solid() {
		return true;
		
	}

}
