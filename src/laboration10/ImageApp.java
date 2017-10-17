package laboration10;
import javax.swing.*;

public class ImageApp {
	public void newFrame(JPanel panel, String title) {
		final int OFFSET = 50;
		
		JFrame frame = new JFrame( title );
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add( panel );
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(OFFSET, OFFSET);
		/* TODO: Change later to false */
		frame.setResizable(true);
	}
	
	public static void main(String[] args) {
		ImageApp app = new ImageApp();
		ImageViewer viewer = new ImageViewer();
		Controller cont = new Controller(viewer);
		ImageChooser chooser = new ImageChooser(cont);
		
		app.newFrame(viewer, "Image Viewer");
		app.newFrame(chooser, "Image Chooser");
	}
}
