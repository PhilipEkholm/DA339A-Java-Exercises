package laboration14;

import java.awt.Color;
import gu2.PaintWindow_GU2;

public class Rectangle extends Shape{
	
	private int x, y, width, height;
	private Color color;

	@Override
	public void paint(PaintWindow_GU2 window) {
		window.drawRect(this.x, this.y, this.width, this.height, this.color, 1);
	}
	
	public Rectangle(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
}
