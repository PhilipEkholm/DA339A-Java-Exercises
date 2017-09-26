package laboration3;
import java.awt.Color;


import gu1.PaintWindow_GU1;
import javax.swing.ImageIcon;
import gu1.PaintWindow_GU1;

public class Program3f {
	
	public void images(){
		ImageIcon img1 = new ImageIcon("images/jönköping summer.jpg");
		ImageIcon img2 = new ImageIcon("images/winter.jpg");
		PaintWindow_GU1.showWindow(1500, 700, "Collage", Color.WHITE);
		PaintWindow_GU1.addIcon("sommar",img1 , 50, 50, true);
		PaintWindow_GU1.addIcon("winter", img2, 600, 50, true);
	}
	
	public static void main(String[] args) {
		Program3f prg = new Program3f();
		prg.images();
	}
}
