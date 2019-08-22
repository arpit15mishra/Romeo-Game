package com.thearpit.rain.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.thearpit.rain.Graphics.Screen;
import com.thearpit.rain.level.tile.Tile;

public class SpawnLevel extends Level{
	
	
	public SpawnLevel(String path) {
		super(path);
		choice = 1;
	}
	protected void generateLevel() {
		
		
	}
	

	protected void loadLevel(String path) {
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));


			int w = width = image.getWidth();
			int h = height = image.getHeight();
			System.out.println("width:" + width);
			System.out.println("height:" + height);
			
			levelpixels = new int[w*h];
			System.out.println("hello i am being openned");
			image.getRGB(0,0,w,h, levelpixels, 0, w);
		}catch(IOException e) {
			System.out.println("Exception ! could not load level file!");
			e.printStackTrace();
			
			
		}
	}

}
