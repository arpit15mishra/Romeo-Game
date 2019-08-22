package com.thearpit.rain.entity.mob;

import com.thearpit.rain.entity.Entity;
import com.thearpit.rain.Graphics.Sprite;

public abstract class Mob extends Entity {

	protected Sprite sprite;
	protected int dir = 2;
	protected boolean moving = false;

	public void move(int xa, int ya) {
        if(xa > 0) dir = 1;
		if(xa < 0) dir = 3;
		if(ya > 0) dir = 2;
		if(ya < 0) dir = 0;
		
		if(!collision()) {
			x += xa;
			y += ya;
		}
	}
	
	public void update() {
	}
	
	public void render() {
	}
	
	private boolean collision() {
		return false;
	}
}