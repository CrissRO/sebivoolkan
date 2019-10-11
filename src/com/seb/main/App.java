package com.seb.main;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.seb.map.Map;
import com.seb.utils.Tuple2D;

public class App {

	private final JFrame FRAME;
	private final Screen SCREEN;
	
	public static final int WIDTH = 720;
	public static final int HEIGHT = 480;
	
	public static  final Rectangle BOUNDS = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
	
	public static final int SCREEN_WIDTH = (int) (isMac() ? BOUNDS.getWidth() : Toolkit.getDefaultToolkit().getScreenSize().getWidth());
	public static final int SCREEN_HEIGHT = (int) (isMac() ? BOUNDS.getHeight() : Toolkit.getDefaultToolkit().getScreenSize().getHeight());
	
	
	public static final int CELL_SIZE = 20;
	
	public static final Map MAP = new Map(new Tuple2D(HEIGHT/CELL_SIZE,WIDTH/CELL_SIZE),new Tuple2D(CELL_SIZE,CELL_SIZE));
	
	public App() {
		
		SCREEN = new Screen();
		FRAME = new JFrame();
		
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		FRAME.setUndecorated(true);
		
		FRAME.setVisible(true);
		FRAME.add(SCREEN);
		
		SCREEN.addEntity(MAP);
		
		System.out.println("Running....");
	}
	
	public static boolean isMac() {
		return System.getProperty("os.name").indexOf("Mac OS X") >=0 || System.getProperty("os.name").indexOf("Linux") >=0;
	}
}
