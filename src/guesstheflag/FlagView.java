package guesstheflag;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import gu2.PaintWindow_GU2;
import paintpanel.Text;

public class FlagView {
	private PaintWindow_GU2 window; //= new PaintWindow_GU2(800, 600, "} player.getRekt()", Color.WHITE);
	private Font headerFont = new Font("Arial", Font.ITALIC, 50),
				pointsFont = new Font("Arial", Font.PLAIN, 15);
	private Text headerText = new Text("Hej", headerFont, Color.BLACK),
				pointsText = new Text("Hej", pointsFont, Color.BLACK);
	private ImageIcon	placeholder1,
						placeholder2,
						placeholder3,
						noneOfThem;
	ImageIcon back;
	
	private static Color lightGrey = new Color(200, 200, 200);
	
	public FlagView(PaintWindow_GU2 parWindow)
	{
		window = parWindow;
	}
	
	public PaintWindow_GU2 getWindow(){
		return this.window;
	}
	
	public ImageIcon[] getWindowIcons(){
		ImageIcon[] images = {
			this.placeholder1,
			this.placeholder2,
			this.placeholder3,
			this.noneOfThem
		};
		
		return images;
	}
	
	public void startupScreen(){
		window.setBackground(new Color(3, 60 ,167), window.getBackgroundWidth(), window.getBackgroundHeight());
		ImageIcon worldFlag = new ImageIcon("images/guesstheflag/The-International-Flag-of-Planet-Earth-6.jpg");
		ImageIcon guesstheflag = new ImageIcon("images/guesstheflag/guess the flag.jpg");
		window.addIcon(guesstheflag, 0, 400, true);
		window.addIcon(worldFlag, 0, 0, true);
		PaintWindow_GU2.pause(3000);
		window.setBackground(Color.WHITE, window.getBackgroundWidth(), window.getBackgroundHeight());
		window.removeIcon(worldFlag);
		window.removeIcon(guesstheflag);
		window.addText(pointsText, 100, 201);
		PaintWindow_GU2.pause(200);
		window.removeIcon(pointsText);
	}
	
	public void startGame(){
		headerText.setText("Land");
		
		back = new ImageIcon("images/gissaTal_Back.png");
		window.addIcon(back, 620, 500, true);
		window.setIconAction(back, this, "back");
		
		window.addText(headerText, 250, 90);
		pointsText.setText("Poäng: 0");
		window.addText(pointsText, 700, 40);
		
		this.placeholder1 = new ImageIcon("images/guesstheflag/flags250/ad.jpg");
		this.placeholder2 = new ImageIcon("images/guesstheflag/flags250/ae.jpg");
		this.placeholder3 = new ImageIcon("images/guesstheflag/flags250/af.jpg");
		this.noneOfThem = new ImageIcon("images/guesstheflag/noneofthem.jpg");
		
		window.fillRect(0, 190, window.getBackgroundWidth(), 250, FlagView.lightGrey);
		
		window.addIcon(placeholder1, 10, 200, true);
		window.addIcon(placeholder2, 270, 200, true);
		window.addIcon(placeholder3, 530, 200, true);
		window.addIcon(noneOfThem, 300, 500, true);
	}
	public void back()
	{
		window.clearAll();
		new main.Main();
	}
	
	public void updateContent(String title, String[] paths, int points){
		
		this.pointsText.setText("Points: " + points);
		this.headerText.setText(title);
		
		window.hideIcon(placeholder1);
		window.hideIcon(placeholder2);
		window.hideIcon(placeholder3);
		
		this.placeholder1 = new ImageIcon(paths[0] + ".jpg");
		this.placeholder2 = new ImageIcon(paths[1] + ".jpg");
		this.placeholder3 = new ImageIcon(paths[2] + ".jpg");
		
		window.addIcon(placeholder1, 10, 200, true);
		window.addIcon(placeholder2, 270, 200, true);
		window.addIcon(placeholder3, 530, 200, true);
		
		
	}
	
	public void updatePoints(int pts){
		this.pointsText.setText("Points: " + pts);
	}
	
	public void showMessage(String message){
		JOptionPane.showMessageDialog(null, message);
	}
}





























