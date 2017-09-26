package GissaTal;


import javax.swing.ImageIcon;

import gu2.PaintWindow_GU2;

public class UserInput 
{
	private PaintWindow_GU2 window;
	private Controller controller;
	public UserInput(PaintWindow_GU2 window, Controller controller){
	this.window = window;
	this.controller = controller;
}
public void action()
{
	ImageIcon btnEasy = new ImageIcon("image/btnEasy.png");
	ImageIcon btnMedium = new ImageIcon("image/btnMedium.png");
	ImageIcon btnHard = new ImageIcon("image/btnHard.png");
	ImageIcon btnExit = new ImageIcon("image/btnExit.png");
	ImageIcon background = new ImageIcon("image/background.jpg");
	
	window.addIcon(background, 0, 0, true);
	window.addIcon(btnEasy, 0, window.getBackgroundHeight()/2, true);
	window.addIcon(btnMedium, 200, window.getBackgroundHeight()/2, true);
	window.addIcon(btnHard, 400, window.getBackgroundHeight()/2, true);
	window.addIcon(btnExit, 600, window.getBackgroundHeight()/2, true);
	
	window.setIconAction(btnEasy, controller, "setEasy");
	window.setIconAction(btnMedium, controller, "setMedium");
	window.setIconAction(btnHard, controller, "setHard");
	window.setIconAction(btnExit, this, "exit");
}

public void exit() {
	window.clearAll();
	new main.Main();
}
}
