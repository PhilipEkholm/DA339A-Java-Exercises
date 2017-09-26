package laboration14;

import java.awt.Color;

import javax.swing.ImageIcon;

import gu2.PaintWindow_GU2;

public class Animation extends Shape{
	private ImageIcon[] images;
	private int index;
	private boolean calledOnce = false;

	@Override
	public void paint(PaintWindow_GU2 window) {
		
		if(!calledOnce){
			for(int i = 0; i < images.length; i++){
				window.addIcon(images[i], 50, 50, false);
			}
			calledOnce = true;
		}
		
		while(this.index < 10){
			window.showIcon(images[this.index]);
			PaintWindow_GU2.pause(100);
			this.index++;
		}
		
		this.hideIcons(window);
		this.index = 0;
	}
	
	private void hideIcons(PaintWindow_GU2 window){
		for(int i = 1; i <= images.length - 1; i++){
			window.hideIcon(images[i]);
		}
	}
	
	public Animation(ImageIcon[] images, int x, int y){
		super(x, y, new Color(255, 255, 255));
		this.images = images;
	}
}


































