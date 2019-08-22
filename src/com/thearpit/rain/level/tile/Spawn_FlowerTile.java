package com.thearpit.rain.level.tile;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.Graphics.Sprite;

public class Spawn_FlowerTile extends Tile {

	public Spawn_FlowerTile(Sprite sprite) {
		super(sprite);
	}
	public void display() {
		System.out.println("flower tile");
	}
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
}
