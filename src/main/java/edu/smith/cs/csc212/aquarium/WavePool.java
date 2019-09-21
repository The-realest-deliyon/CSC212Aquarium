package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;

public class WavePool {
	
	int x;
	int y;
	int wiggle;
	Random rand = new Random();

	public WavePool() {
		this.x = rand.nextInt(500);
		this.y = rand.nextInt(500);
		this.wiggle = 0;
	}

	
	public void draw(Graphics2D win) {
		Font f = win.getFont();
		win.setFont(f.deriveFont(40.0f));
		win.setColor(Color.white);
		win.drawString("~", this.x, this.y+this.wiggle);
		
		animate();
	}
	
	public void animate() {
		this.x -= 6;
		if (this.x < -450) {
			this.x =550;
			this.y = rand.nextInt(500);
			
		}
		
		this.wiggle = (int) (30.0 * Math.sin(this.x / 60.0 ));
	}
}
