package com.seb.map;

import java.awt.Color;
import java.awt.Graphics2D;

import com.seb.main.Entity;
import com.seb.utils.Tuple2D;

public class Tile implements Entity{

	private Tuple2D position;
	private Tuple2D size;
	private Color clr;
	
	public Tile(Tuple2D position,Tuple2D size,Color clr) {
		this.position = position;
		this.size = size;
		this.clr = clr;
	}
	
	//methods
	
	@Override
	public void render(Graphics2D ctx) {
		ctx.setColor(clr);
		ctx.fillRect(position.getXInt(), position.getYInt(), size.getXInt(), size.getYInt());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	//getters and setters
	public Tuple2D getPosition() {
		return position;
	}

	public void setPosition(Tuple2D position) {
		this.position = position;
	}

	public Tuple2D getSize() {
		return size;
	}

	public void setSize(Tuple2D size) {
		this.size = size;
	}


	
	
}
