package laboration6;

import javax.swing.ImageIcon;

import gu2.PaintWindow_GU2;

public class MovingImageUltimate {
	private PaintWindow_GU2 window;
	private ImageIcon image;
	private int x;
	private int y;    
	
	public void init(PaintWindow_GU2 window) {
		this.window = window;
	}      
	
	public void addImage(ImageIcon image, int x, int y){
		this.image = image;
		window.addIcon(this.image, x, y, true);
	}
	
	public void setLocation(ImageIcon image, int x, int y) {
		this.x = x;
		this.y = y;
		window.setIconXY(image, this.x, this.y);
	}   
	
	public void show() {         
		window.showIcon(image);     
	}
	
	public void hide() {         
		window.hideIcon(image);
	}
	
	public void pauseSystem(int ms){
		this.window.pause(ms);
	}
}
