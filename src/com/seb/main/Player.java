package com.seb.main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Player implements Entity{

	private int x,y;
	
	public Player(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void render(Graphics2D ctx) {
		ctx.setColor(Color.red);
		ctx.fillRect(x-50, y-50, 100, 100);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
