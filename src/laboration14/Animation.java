package laboration14;

import java.awt.Color;

import javax.swing.ImageIcon;

import paintwindow.PaintWindow;

public class Animation extends Shape{
	private ImageIcon[] images;
	private int index;
	private boolean calledOnce = false;

	@Override
	public void paint(PaintWindow window) {
		if(!calledOnce){
			for (int i = 0; i < images.length; i++)
				window.addIcon(images[i], 50, 50, false);

			calledOnce = true;
		}
		
		while(this.index < 10){
			window.showImage(images[this.index]);
			PaintWindow.pause(100);
			this.index++;
		}
		
		this.hideIcons(window);
		this.index = 0;
	}
	
	private void hideIcons(PaintWindow window){
		for(int i = 1; i <= images.length - 1; i++){
			window.hideIcon(images[i]);
		}
	}
	
	public Animation(ImageIcon[] images, int x, int y){
		super(x, y, Color.WHITE);
		this.images = images;
	}
}


































