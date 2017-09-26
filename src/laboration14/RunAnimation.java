package laboration14;

import java.awt.Color;
import javax.swing.ImageIcon;
import gu2.PaintWindow_GU2;

public class RunAnimation {
	public static void main(String[] args) {
		PaintWindow_GU2 window = new PaintWindow_GU2(800,600,"Uppgift 5",Color.WHITE); 
		ImageIcon[] images = new ImageIcon[10]; 
		
		for(int i=0; i<images.length; i++) {     
			images[i] = new ImageIcon("images/lab14/new" + (i+1) + ".jpg"); 
		} 
		
		Animation anim = new Animation(images, 100, 100); 
		
		for(int i=0; i<100; i++) {     
			anim.paint(window);
			PaintWindow_GU2.pause(50);
		}
	}
}











