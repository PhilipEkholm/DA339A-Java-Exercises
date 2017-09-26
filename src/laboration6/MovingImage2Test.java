package laboration6;
import java.awt.Color;

import gu2.PaintWindow_GU2;

import javax.swing.ImageIcon;

public class MovingImage2Test {
    public void action1() {
        PaintWindow_GU2 window = new PaintWindow_GU2(600,400,"Laboration 6i",Color.WHITE);
        ImageIcon image1 = new ImageIcon("images/gubbe.jpg");
        ImageIcon image2 = new ImageIcon("images/BilH.gif");
        ImageIcon image3 = new ImageIcon("images/LiggandeGubbe.jpg");
        MovingImage2 mi1 = new MovingImage2();
        MovingImage2 mi2 = new MovingImage2();
        MovingImage2 mi3 = new MovingImage2();
        
        mi1.init(window,image1,300,200);
        mi2.init(window,image2,70,240);

        PaintWindow_GU2.pause(2000);
        mi2.setLocation(90, 240);
        PaintWindow_GU2.pause(300);
        mi2.setLocation(110, 240);
        PaintWindow_GU2.pause(300);
        mi2.setLocation(130, 240);
        PaintWindow_GU2.pause(300);
        mi2.setLocation(150, 240);
        PaintWindow_GU2.pause(300);
        mi2.setLocation(170, 240);
        PaintWindow_GU2.pause(300);
        mi2.setLocation(190, 240);
        PaintWindow_GU2.pause(300);
        mi2.setLocation(210, 240);
        
        mi3.init(window,image3,320,170);
        mi1.hide();
        PaintWindow_GU2.pause(300);
        mi3.setLocation(340,150);
        PaintWindow_GU2.pause(300);
        mi3.setLocation(360,140);
        PaintWindow_GU2.pause(300);
        mi3.setLocation(380,150);
        PaintWindow_GU2.pause(300);
        mi3.setLocation(400,170);
        PaintWindow_GU2.pause(300);
        mi3.setLocation(420,200);
    }

    public static void main(String[] args) {
        MovingImage2Test tmi = new MovingImage2Test();
        tmi.action1();
    }
}
