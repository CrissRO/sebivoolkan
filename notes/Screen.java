package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Screen extends JPanel{

	private static final long serialVersionUID = 1L;
	private List<Entity> entities;
	
	public Screen() {
		entities = new ArrayList<>();
	}
	
	public boolean addEntity(Entity e) {
		entities.add(e);
		return true;
	}
	
	public boolean removeEntity(Entity e) {
		entities.remove(e);
		return true;
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D ctx = (Graphics2D)g;
		
		/*
		for(Entity e : entities)
			e.render(ctx);
		*/
		System.out.println(App.SCREEN_WIDTH / App.WIDTH);
		System.out.println(1.0 * App.SCREEN_WIDTH / App.WIDTH);
		ctx.scale(1.0 * App.SCREEN_WIDTH / App.WIDTH, 1.0 * App.SCREEN_HEIGHT / App.HEIGHT);
		
		ctx.setColor(Color.black);
		ctx.fillRect(0, 0, 100, 100);
		
		ctx.setColor(Color.green);
		ctx.fillRect(0, 100, 100, 100);
		
		ctx.setColor(Color.blue);
		ctx.fillRect(0, 200, 100, 100);
		
		ctx.setColor(Color.red);
		ctx.fillRect(0, 300, 100, 100);
		
		ctx.setColor(Color.cyan);
		ctx.fillRect(0, 400, 100, 5);
		ctx.dispose();
		g.dispose();
	}

}
