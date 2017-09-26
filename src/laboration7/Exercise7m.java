package laboration7;
import gu2.PaintWindow_GU2;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Exercise7m {
	private PaintWindow_GU2 window;
	private Picture man1, man2;
	
    public void action1() {
        ImageIcon image1 = new ImageIcon("images/sommar.jpg");
        ImageIcon image2 = new ImageIcon("images/LiggandeGubbe.jpg");
        ImageIcon image3 = new ImageIcon("images/Gubbe.jpg");

        window = new PaintWindow_GU2(800,600,"Uppgift 7m",image1,0,0);
        
        int width = window.getCameraWidth();
        int height = window.getCameraHeight();
        
        // image2.getIconHeight() ger bildens höjd
        man1 = new Picture(image2,0,(height-image2.getIconHeight())/2);
        // image3.getIconWidth() ger bildens bredd
        man2 = new Picture(image3,(width-image3.getIconWidth())/2, height-image3.getIconHeight());
        addPicture(man1);
        addPicture(man2);
    }

    public void addPicture(Picture picture) {
    	window.addIcon(picture.getIcon(), picture.getX(), picture.getY(), true);
    }

    public static void main(String[] args) {
        Exercise7m u7m = new Exercise7m();
        u7m.action1();
    }
}
