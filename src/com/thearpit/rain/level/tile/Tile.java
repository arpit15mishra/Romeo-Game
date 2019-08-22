package com.thearpit.rain.level.tile;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.Graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile floor = new FloorTile(Sprite.floor);
	public static Tile spawn_grass = new GrassTile(Sprite.grass);
	public static Tile spawn_voidTile = new VoidTile(Sprite.voidSprite);
	public static Tile spawn_flower = new FlowerTile(Sprite.flower);
	public static Tile spawn_rock = new RockTile(Sprite.rock);
	public static Tile spawn_floor = new FloorTile(Sprite.floor);
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	public void display() {
		
	}
	
	public void render(int x, int y, Screen screen) {	
	}
	
	public boolean solid() {
		return false;
	}

}