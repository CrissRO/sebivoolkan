package com.seb.main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Screen extends JPanel{
	
	
	private List<Entity> entities = new ArrayList<>();
	
	public Screen() {}
	
	
	public void addEntity(Entity e) {
		if(!entities.contains(e))
			entities.add(e);
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D ctx = (Graphics2D)g;
		ctx.scale(1.0 * App.SCREEN_WIDTH / App.WIDTH, 1.0 * App.SCREEN_HEIGHT / App.HEIGHT);
		//aici se vor desena entitatile
		for(Entity e : entities)
			e.render(ctx);
		//aici se curata memoria
		ctx.dispose();
		g.dispose();
	}
}
