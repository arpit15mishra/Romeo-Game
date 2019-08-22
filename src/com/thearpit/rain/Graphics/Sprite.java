package com.thearpit.rain.Graphics;

public class Sprite {

	private int x, y;
	private Spritesheet sheet;
	
	public final int SIZE;
	public int[] pixels;
	
	public static Sprite grass = new Sprite(16, 0, 1, Spritesheet.tiles); 
	public static Sprite flower = new Sprite(16, 1, 2, Spritesheet.tiles);
	public static Sprite rock = new Sprite(16, 1, 0, Spritesheet.tiles);
	public static Sprite floor = new Sprite(16, 0, 4, Spritesheet.tiles); 
	public static Sprite voidSprite = new Sprite(16, 0x1B87E0);
	
	public static Sprite player_forward = new Sprite(32,0 , 7, Spritesheet.tiles);
	public static Sprite player_left = new Sprite(32,0 , 5, Spritesheet.tiles);
	public static Sprite player_right = new Sprite(32,0 , 6, Spritesheet.tiles);
	public static Sprite player_backward = new Sprite(32,0 , 4, Spritesheet.tiles);
	
	public static Sprite player_forward1 = new Sprite(32,1 , 7, Spritesheet.tiles);
	public static Sprite player_left1 = new Sprite(32,1 , 5, Spritesheet.tiles);
	public static Sprite player_right1 = new Sprite(32,1 , 6, Spritesheet.tiles);
	public static Sprite player_backward1 = new Sprite(32,1 , 4, Spritesheet.tiles);
	
	public static Sprite player_forward2 = new Sprite(32,2 , 7, Spritesheet.tiles);
	public static Sprite player_left2 = new Sprite(32,2 , 5, Spritesheet.tiles);
	public static Sprite player_right2 = new Sprite(32,2 , 6, Spritesheet.tiles);
	public static Sprite player_backward2 = new Sprite(32,2 , 4, Spritesheet.tiles);
	
	// this is the spawn level sprite
	public static Sprite spawn_grass = new Sprite(16,0 , 2, Spritesheet.spawn_level);
	public static Sprite spawn_flower = new Sprite(16,1 , 2, Spritesheet.spawn_level);
	public static Sprite spawn_rock = new Sprite(16, 2 ,0, Spritesheet.spawn_level);
	public static Sprite spawn_floor = new Sprite(16, 2 ,1 ,Spritesheet.spawn_level);
	public static Sprite spawn_tree = new Sprite(32,0,0,Spritesheet.spawn_level);
	public static Sprite spawn_gold = new Sprite(16,2,2,Spritesheet.spawn_level);
	
	
	
	public Sprite(int size, int x, int y, Spritesheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColor(color);
	}
	
	private void setColor(int color) {
		for(int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = color;
		}
	}
	
	private void load() {
		for(int y = 0; y < SIZE; y++) {
			for(int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}
}
