package laboration5;
import java.awt.Color;
import gu1.PaintWindow_GU1;
import javax.swing.ImageIcon;
/**
 * Flytta bild i ett PaintWindow_GU1-fönster
 * @author tsroax
 */
public class Exercise5e {
    
    public void leftRight() {
        int x = PaintWindow_GU1.getIconX("Gubbe");
        int y = PaintWindow_GU1.getIconY("Gubbe");
        int width = PaintWindow_GU1.getCameraWidth();
        int iconWidth = PaintWindow_GU1.getIconWidth("Gubbe");
        int maxX = width - iconWidth;
        
        while(x<maxX) {
        	x += 7;
            PaintWindow_GU1.setIconXY("Gubbe", x, y);
            PaintWindow_GU1.pause(20);
        }
    }
    
    public void rightLeft() {
    	int x = PaintWindow_GU1.getIconX("Gubbe");
        int y = PaintWindow_GU1.getIconY("Gubbe");
        
        while(x>0){
        	x -= 7;
        	PaintWindow_GU1.setIconXY("Gubbe", x, y);
        	PaintWindow_GU1.pause(20);
        }
    }
        
    public void upDown() {
    	int x = PaintWindow_GU1.getIconX("Gubbe");
        int y = PaintWindow_GU1.getIconY("Gubbe");
        int width = PaintWindow_GU1.getCameraWidth();
        int height = PaintWindow_GU1.getCameraHeight();
        int iconWidth = PaintWindow_GU1.getIconWidth("Gubbe");
        int maxY = height - PaintWindow_GU1.getIconHeight("Gubbe");
        
        while(y > 0){
        	y -= 7;
        	PaintWindow_GU1.setIconXY("Gubbe", x, y);
        	PaintWindow_GU1.pause(20);
        }
        
        while(y <= maxY){
        	y += 7;
        	PaintWindow_GU1.setIconXY("Gubbe", x, y);
        	PaintWindow_GU1.pause(20);
        }
    }
        
    public void downUp() {
    	int x = PaintWindow_GU1.getIconX("Gubbe");
        int y = PaintWindow_GU1.getIconY("Gubbe");
        int width = PaintWindow_GU1.getCameraWidth();
        int height = PaintWindow_GU1.getCameraHeight();
        int iconWidth = PaintWindow_GU1.getIconWidth("Gubbe");
        int maxY = height - PaintWindow_GU1.getIconHeight("Gubbe");
        
        while(y > 0){
        	y -= 7;
        	PaintWindow_GU1.setIconXY("Gubbe", x, y);
        	PaintWindow_GU1.pause(20);
        }
    }
    
    public static void main(String[] args) {
        Exercise5e e5e = new Exercise5e();
        PaintWindow_GU1.showWindow(600, 400, "Exercise5e", Color.WHITE);
        ImageIcon man = new ImageIcon("images/Gubbe.jpg");
        
        PaintWindow_GU1.addIcon("Gubbe", man, 0, 150, true);
        e5e.leftRight();
        
//      PaintWindow_GU1.addIcon("Gubbe", man, 500, 150, true);
        e5e.rightLeft();
        
//      PaintWindow_GU1.addIcon("Gubbe", man, 250, 0, true);
        e5e.upDown();
        
//      PaintWindow_GU1.addIcon("Gubbe", man, 250, 300, true);
        e5e.downUp();
        
    }
}
