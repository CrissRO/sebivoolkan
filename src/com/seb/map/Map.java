package com.seb.map;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.seb.main.Entity;
import com.seb.utils.Tuple2D;

public class Map implements Entity{
	
	private Tile[][] matrix;
	
	//tuple : x - rows, y - cols
	private Tuple2D size;
	
	//tuple: x - width, y - height
	private Tuple2D cellSize;
	
	public Map(Tuple2D size,Tuple2D cellSize) {
		this.size = size;
		this.cellSize = cellSize;
		this.matrix = new Tile[this.size.getXInt()][this.size.getYInt()];
		generate();
	}

	private void generate() {
		Random rand = new Random();
		List<Color> colors = new ArrayList<>();
		
		colors.add(Color.BLUE);
		colors.add(Color.RED);
		colors.add(Color.GREEN);
		colors.add(Color.MAGENTA);
		colors.add(Color.CYAN);
		colors.add(Color.YELLOW);
		
		for(int r = 0;r < this.size.getXInt();r++)
			for(int c = 0;c < this.size.getYInt();c++)
				matrix[r][c] = new Tile(new Tuple2D(c * (cellSize.getXInt()+2),r * (cellSize.getYInt()+2)),cellSize,colors.get(rand.nextInt(colors.size())));
	}
	
	@Override
	public void render(Graphics2D ctx) {
		for(int r = 0;r < this.size.getXInt();r++)
			for(int c = 0;c < this.size.getYInt();c++)
				matrix[r][c].render(ctx);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	
	
}
