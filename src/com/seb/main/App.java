package com.seb.main;

import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class App {

	private final JFrame FRAME;
	private final Screen SCREEN;
	
	public static final int WIDTH = 720;
	public static final int HEIGHT = WIDTH / 16 * 9;
	
	public static  final Rectangle BOUNDS = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
	
	public static final int SCREEN_WIDTH = (int) (isMac() ? BOUNDS.getWidth() : Toolkit.getDefaultToolkit().getScreenSize().getWidth());
	public static final int SCREEN_HEIGHT = (int) (isMac() ? BOUNDS.getHeight() : Toolkit.getDefaultToolkit().getScreenSize().getHeight());
	
	public App() {
		
		SCREEN = new Screen();
		FRAME = new JFrame();
		
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		FRAME.setUndecorated(true);
		
		FRAME.setVisible(true);
		FRAME.add(SCREEN);
		
		System.out.println("Running....");
	}
	
	public static boolean isMac() {
		return System.getProperty("os.name").indexOf("Mac OS X") >=0 || System.getProperty("os.name").indexOf("Linux") >=0;
	}
}
