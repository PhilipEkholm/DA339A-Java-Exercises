package laboration6;
import java.awt.Color;
import javax.swing.*;
import gu2.PaintWindow_GU2;

public class ShowAndMoveImage {
	public void action1() {
        ImageIcon image = new ImageIcon("images/Summer.jpg");
        MovingImage1 mi = new MovingImage1();
        String coordinates;
        
        mi.init(image, 50, 50);
        
        do{
        	coordinates = JOptionPane.showInputDialog("Mata in koordinater (x, y), skriv inget för att avsluta");
        	
        	int x = Integer.parseInt(coordinates.substring(0, 2)),
        		y = Integer.parseInt(coordinates.substring(5, 8));
        	
        	mi.setLocation(x, y);
        }
        while(coordinates != "");
    }

    public static void main(String[] args) {
        ShowAndMoveImage tmi = new ShowAndMoveImage();
        tmi.action1();
    }
}
