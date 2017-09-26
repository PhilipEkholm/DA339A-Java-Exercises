package laboration10;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImageViewer extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel lblTitle = new JLabel(),
				   lblImage = new JLabel();

	public ImageViewer(){
		this.setLayout(new BorderLayout());
		
		this.addComponents();
	}
	
	public void showImage(String filePath){
		lblImage.setText("");
		lblImage.setIcon(new ImageIcon(filePath));
		lblTitle.setText(filePath);
		File f = new File(filePath);
		if(!f.exists()){
			System.out.println("Felaktig sökväg :(");
		}
	}
	
	public void noImage(){
		lblImage.setIcon(null);//Tar bort bild
		lblImage.setText("Ingen bild vald");
		lblTitle.setText("");
	}
	
	private void addComponents(){
		this.add(lblTitle, BorderLayout.NORTH);
		this.add(lblImage, BorderLayout.CENTER);
	}
}
