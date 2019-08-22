package com.thearpit.rain.entity;

import java.util.Random;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.level.Level;

public abstract class Entity {
	
	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update() {
		
	}
	
	public void render(Screen screen) {
		
	}
	
	public void remove() {
		// Remove from level
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}
}