package GissaTal;

import java.awt.Color;

import gu2.PaintWindow_GU2;
import paintpanel.Sound;

public class KorGissaTal {
	
	public KorGissaTal(PaintWindow_GU2 window)
	{
		//new PaintWindow_GU2(800, 600, "Gissa Tal", Color.WHITE);
		Controller controller = new Controller();
		UserInput input = new UserInput(window, controller);
		input.action();
	}
	
	
	
	
	public static void main(String[] args) {
		
	}
}
