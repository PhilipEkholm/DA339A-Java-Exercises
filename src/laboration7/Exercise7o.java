package laboration7;
import gu2.PaintWindow_GU2;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Exercise7o {
	private PaintWindow_GU2 window;
	private Picture man1, man2;
	
    public void action1() {
        ImageIcon image1 = new ImageIcon("images/sommar.jpg");
        ImageIcon image2 = new ImageIcon("images/LiggandeGubbe.jpg");
        ImageIcon image3 = new ImageIcon("images/Gubbe.jpg");

        window = new PaintWindow_GU2(800,600,"Uppgift 7o",image1,0,0);
        
        int width = window.getCameraWidth();
        int height = window.getCameraHeight();
        
        man1 = new Picture(image2,0,(height-image2.getIconHeight())/2);
        man2 = new Picture(image3,(width-image3.getIconWidth())/2, height-image3.getIconHeight());
        addPicture(man1);
        addPicture(man2);
        move();
    }
    
    public void move() {
    	man1.setDx(3);
    	man1.setDy(-1);
    	man2.setDx(2);
    	man2.setDy(-3);
    	while(true) {
    		move(man1);
    		move(man2);
    		PaintWindow_GU2.pause(20);
    	}
    }
    
    private void move(Picture picture) {
    	if(picture.getX() < 0 || picture.getX() > (window.getBackgroundWidth() - 100)){
    		picture.setDx(-picture.getDx());
    	}
    	else if(picture.getY() < 0 || picture.getY() > (window.getBackgroundHeight() - 100)){
    		picture.setDy(-picture.getDy());
    	}
    	picture.setX(picture.getX() + picture.getDx());
    	picture.setY(picture.getY() + picture.getDy());
    	movePicture(picture);
    }
    
    public void addPicture(Picture picture) {
    	window.addIcon(picture.getIcon(), picture.getX(), picture.getY(), true);
    }
    
    public void movePicture(Picture picture) {
    	window.setIconXY(picture.getIcon(), picture.getX(), picture.getY());
    }

    public static void main(String[] args) {
        Exercise7o u7o = new Exercise7o();
        u7o.action1();
    }
}
