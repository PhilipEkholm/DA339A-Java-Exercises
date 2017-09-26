//package laboration5;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
//
//public class Exercise5n {
//    public void program() {
//        String menu = "MENYVAL:\n\n" + "" +
//                      "1. Steg vänster\n2. Steg uppåt\n3. Steg höger\n4. Steg nedåt\n" +
//                      "-----------------------\n" +
//                      "0. Avsluta";
//        ImageIcon image = new ImageIcon("M:/bilder/Gubbe.jpg");
//        ImageController cont = new ImageController(image);
////        int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
//    }
//    
//    public static void main(String[] args) {
//        Exercise5n e5n = new Exercise5n();
//        e5n.program();
//    }
//}
package laboration5;
import java.awt.Color;

import gu1.PaintWindow_GU1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise5n {
    public void program() {
    	PaintWindow_GU1.showWindow(500, 500, "Exercise5n", Color.WHITE);
    	String menu = "MENYVAL:\n\n" + "" +
    	    "1. Steg vänster\n2. Steg uppåt\n3. Steg höger\n4. Steg nedåt\n" +
    	    "-----------------------\n" + "0. Avsluta";
    	ImageIcon image = new ImageIcon("images/Gubbe.jpg");
    	PaintWindow_GU1.addIcon("Gubbe", image, 200, 200, true);
    	PaintWindow_GU1.putString("ImageController_name","Gubbe");
    	ImageController cont = new ImageController();
    	
    	PaintWindow_GU1.setKeyPressed(PaintWindow_GU1.VK_A, cont, "left");
    	PaintWindow_GU1.setKeyPressed(PaintWindow_GU1.VK_S, cont, "down");
    	PaintWindow_GU1.setKeyPressed(PaintWindow_GU1.VK_D, cont, "right");
    	PaintWindow_GU1.setKeyPressed(PaintWindow_GU1.VK_W, cont, "up");
    }
    
    public static void main(String[] args) {
        Exercise5n e5n = new Exercise5n();
        e5n.program();
    }
}
