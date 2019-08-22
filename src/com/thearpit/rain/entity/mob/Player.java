package com.thearpit.rain.entity.mob;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.Graphics.Sprite;
import com.thearpit.rain.input.Keyboard;

public class Player extends Mob {
	
	private Keyboard input;
	private int anim = 0;
	private boolean walking= false;

	public Player(Keyboard input) {
		this.input = input;
		sprite = sprite.player_backward;
	}
	
	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
		sprite = sprite.player_backward;
	}
	
	public void update() {
		int xa = 0, ya = 0;
		if(anim < 7500) anim++;
		else anim = 0;
		
		if(input.up) ya--;
		if(input.down) ya++;
		if(input.left) xa--;
		if(input.right) xa++;
		
		if(xa != 0 || ya != 0) {
			move(xa, ya);
		walking = true;} else walking = false;
	}
	
	public void render(Screen screen) {

		
		
		if (dir == 0) {
			if(walking) {
			if(anim%30 < 10 ) {
				sprite = Sprite.player_forward;
			}else if (anim%30<20){
				sprite = Sprite.player_forward1;
			}else {
				sprite = Sprite.player_forward2;
			}
		}
			}
		if (dir == 1) {
			if(walking) {
				if(anim%30<10) {
					sprite = Sprite.player_right;
				}else
					if(anim%30<20){
					sprite = Sprite.player_right1;
				}else {
					sprite = Sprite.player_right2;
				}
			}
		}
		if (dir == 2) {	if(walking) {
			if(anim%30<10) {
				sprite = Sprite.player_backward;
			}else if(anim%30<20){
				sprite = Sprite.player_backward1;
			} else {
				sprite = Sprite.player_backward2;
			}
			}
		}
		if (dir == 3) { 	if(walking) {
			if(anim%30<10) {
				sprite = Sprite.player_left;
			}else 
				if(anim%30<20) {
				sprite = Sprite.player_left1;
			} else {
				sprite = Sprite.player_left2;
			}
		}
		}
		screen.renderPlayer(x-16,y-16,sprite);
			}
}