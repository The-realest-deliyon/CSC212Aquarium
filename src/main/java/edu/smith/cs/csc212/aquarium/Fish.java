package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	//Every fish has a color 
	Color color;
	//Every fish has a position (x, y) that are integers
	int x;
	int y;
	boolean isLittle;

	public Fish(Color c, int startX, int startY, boolean isLittle) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
	}
	public void draw(Graphics2D g){
		if(this.isLittle) {
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		}else {
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		}
		this.swim();
	}
	public void swim() {
		this.x += 1;
		this.y += 1;
	}
}

