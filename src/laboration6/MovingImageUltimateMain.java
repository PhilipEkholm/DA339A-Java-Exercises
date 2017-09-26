package laboration6;
import java.awt.*;
import java.util.*;
import gu2.PaintWindow_GU2;
import javax.swing.*;

public class MovingImageUltimateMain {
	public static void main(String[] args) {
		Color niceYellow = new Color(250, 250, 156);
		Random rand = new Random();
		ImageIcon image1 = new ImageIcon("images/BilH.gif"),
				image2 = new ImageIcon("images/up.png"),
				image3 = new ImageIcon("images/down.png"),
				image4 = new ImageIcon("images/right.png");
		
		PaintWindow_GU2 window = new PaintWindow_GU2(1500, 1000,"Laboration 6i", niceYellow);
		MovingImageUltimate miUltimate = new MovingImageUltimate();
		
		miUltimate.init(window);
		miUltimate.addImage(image1, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
		miUltimate.addImage(image2, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
		miUltimate.addImage(image3, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
		miUltimate.addImage(image4, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
		
		miUltimate.pauseSystem(2000);
		
		for(int i = 0; i < 3; i++){
			miUltimate.setLocation(image1, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
			miUltimate.setLocation(image2, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
			miUltimate.setLocation(image3, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
			miUltimate.setLocation(image4, rand.nextInt(700) + 10, rand.nextInt(700) + 10);
			miUltimate.pauseSystem(2000);
		}
	}
}
