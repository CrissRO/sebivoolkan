package main;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class App implements Runnable{

	private final Thread MAIN;
	private final JFrame FRAME;
	private final Screen SCREEN; 
	
	public static final int WIDTH = 720;
	public static final int HEIGHT = WIDTH / 16 * 9;
	
	public static  final Rectangle BOUNDS = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
	
	public static final int SCREEN_WIDTH = (int) (isMac() ? BOUNDS.getWidth() : Toolkit.getDefaultToolkit().getScreenSize().getWidth());
	public static final int SCREEN_HEIGHT = (int) (isMac() ? BOUNDS.getHeight() : Toolkit.getDefaultToolkit().getScreenSize().getHeight());
	
	private boolean running;
	
	public App() {	
		MAIN = new Thread(this);
		
		SCREEN = new Screen();
		
		FRAME = new JFrame();
		
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		FRAME.setUndecorated(true);
		
		FRAME.setVisible(true);
		FRAME.add(SCREEN);

		MAIN.start();
	}
	
	@Override
	public void run() {
		setup();
		while(running) {
			render();
			update();
		}
	}
	
	public static boolean isMac() {
		return System.getProperty("os.name").indexOf("Mac OS X") >=0;
	}

	public void setup() {
		running = true;
	}
	
	public void update() {
		
	}

	public void render() {
		
	}
	
	public int getWIDTH() {
		return WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public int getSCREEN_WIDTH() {
		return SCREEN_WIDTH;
	}

	public int getSCREEN_HEIGHT() {
		return SCREEN_HEIGHT;
	}
	
}
