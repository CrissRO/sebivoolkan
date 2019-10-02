package com.seb.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Screen extends JPanel{
	
	
	public Screen() {}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D ctx = (Graphics2D)g;
		ctx.scale(1.0 * App.SCREEN_WIDTH / App.WIDTH, 1.0 * App.SCREEN_HEIGHT / App.HEIGHT);
		//aici se vor desena entitatile
		
		ctx.setColor(Color.black);
		ctx.fillRect(0, 0, 360, 100);
		
		ctx.setColor(Color.green);
		ctx.fillRect(0, 100, 100, 100);
		
		ctx.setColor(Color.blue);
		ctx.fillRect(0, 200, 100, 100);
		
		ctx.setColor(Color.red);
		ctx.fillRect(0, 300, 100, 100);
		
		ctx.setColor(Color.cyan);
		ctx.fillRect(0, 400, 100, 5);
		
		
		//aici se curata memoria
		ctx.dispose();
		g.dispose();
	}
}
