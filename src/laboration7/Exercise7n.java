package laboration7;
import gu2.PaintWindow_GU2;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Exercise7n {
	private PaintWindow_GU2 window;
	private Picture man1, man2;
	
    public void action1() {
        ImageIcon image1 = new ImageIcon("images/sommar.jpg");
        ImageIcon image2 = new ImageIcon("images/LiggandeGubbe.jpg");
        ImageIcon image3 = new ImageIcon("images/Gubbe.jpg");

        window = new PaintWindow_GU2(800,600,"Uppgift 7n",image1,0,0);
        
        int width = window.getCameraWidth();
        int height = window.getCameraHeight();
        System.out.println("height="+height);
        
        man1 = new Picture(image2,0,(height-image2.getIconHeight())/2);
        man2 = new Picture(image3,(width-image3.getIconWidth())/2, height-image3.getIconHeight());
        addPicture(man1);
        addPicture(man2);
        move();
    }
    
    public void move() {
    	int x,dx, y, dy;
    	int maxX = window.getBackgroundWidth()-man1.getIcon().getIconWidth(),
    		maxY = window.getBackgroundHeight()-man1.getIcon().getIconHeight();
    	man1.setDx(3);
    	man1.setDy(-1);
    	while(true) {
    		//X-position
    		x = man1.getX() + man1.getDx();
    		man1.setX(x);
    		movePicture(man1);
    		if(x<0 || x>maxX) {
    			dx = man1.getDx();
    			man1.setDx(-dx);
    		}
    		//Y-position
    		y = man1.getY() + man1.getDy();
    		man1.setY(y);
    		if(y > maxY || y < 0){
    			dy = man1.getDy();
    			man1.setDy(-dy);
    		}
    		PaintWindow_GU2.pause(20);
    	}
    }
    
    public void addPicture(Picture picture) {
    	window.addIcon(picture.getIcon(), picture.getX(), picture.getY(), true);
    }
    
    public void movePicture(Picture picture) {
    	window.setIconXY(picture.getIcon(), picture.getX(), picture.getY());
    }
    
    public static void main(String[] args) {
        Exercise7n u7n = new Exercise7n();
        u7n.action1();
    }
}
