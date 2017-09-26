package laboration14;

import java.awt.Color;
import gu2.PaintWindow_GU2;

public class RunRect {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle( 100, 50, 200, 150, Color.BLACK ); 
		Rectangle rect2 = new Rectangle( 80, 150, 100, 150, Color.RED); 
		PaintWindow_GU2 window = new PaintWindow_GU2(600,400,"Uppgift 4a",Color.WHITE); 
		rect1.paint( window ); rect2.paint( window );
	}
}
