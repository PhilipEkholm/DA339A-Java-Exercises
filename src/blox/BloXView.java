package blox;

import java.awt.Color;
import javax.swing.*;

import gu2.PaintWindow_GU2;

public class BloXView {
	public PaintWindow_GU2 window = new PaintWindow_GU2(800, 600, "BloX", new Color(14, 71, 111)); //Jag gör denna public då det finns funktioner kontrollern måste kunna komma åt
	private ImageIcon ship = new ImageIcon("images/blox/ship.png");
	
	public void spawnPlayer(int x, int y){
		window.addIcon(ship, x, y, true);
	}
	
	public void movePlayerLeft(){
		int x = window.getIconX(ship) - 5; //Konstant då jag inte kan skicka med argument
		
		if(x > 0){
			window.setIconXY(ship, x, window.getIconY(ship));
		}
	}
	
	public void movePlayerRight(){
		int x = window.getIconX(ship) + 5; //Konstant då jag inte kan skicka med argument
		
		window.setIconXY(ship, x, window.getIconY(ship));
	}
}
