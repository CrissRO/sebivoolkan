package com.seb.utils;

public class Tuple2D {
	private double x,y;
	
	public Tuple2D(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {return x;}
	public double getY() {return y;}
	
	public int getXInt() {return (int)x;}
	public int getYInt() {return (int)y;}
	
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
}
