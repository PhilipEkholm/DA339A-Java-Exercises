package laboration6; 

import javax.swing.ImageIcon;
import gu2.PaintWindow_GU2;
import java.awt.*;

public class MovingImage1 {     
	private PaintWindow_GU2 window = new PaintWindow_GU2(600,400,"Laboration 6h", Color.WHITE);
	private ImageIcon image;
	private int x;
	private int y;
	
	/**      
	 * Metoden för över parametrarnas värde i motsvarande instansvariabler.      
	 * Sedan anropas metoden addIcon så att bilden visar sig i fönstret.      
	 */     
	
	public void init(ImageIcon image, int x, int y) {
		this.image = image;
		this.x = x;
		this.y = y;
		window.addIcon(this.image, this.x, this.y, true);
	}      
	
	/**      
	 * Metoden för över parametrarnas värde i motsvarande instansvariabler.      
	 * Sedan anropas metoden setIconXY så att bilden visar sig på ny position i      
	 * fönstret.      
	 */
	
	public void setLocation(int x, int y) { 
		this.x = x;
		this.y = y;
		window.setIconXY(image, this.x, this.y);
	}      
	
	/**      
	 * Metoden ser till att bilden blir synlig      
	 */     
	
	public void show() {         
		window.showIcon(image);     
	}      
	
	/**      
	 * Metoden ser till att bilden ej syns längre      
	 */
	
	public void hide() {         
		window.hideIcon(image);
	}
}


































