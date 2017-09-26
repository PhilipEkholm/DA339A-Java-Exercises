package laboration10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageChooser extends JPanel{
	private static final long serialVersionUID = 1L;
	private JPanel pnlRadioButtons = new JPanel(new GridLayout(5, 1));
	private JRadioButton rb1, rb2, rb3, rb4, rb5;
	private JButton btn;
	private Controller controller;
	
	public ImageChooser(Controller controller){
		this.controller = controller;
		pnlRadioButtons.add(rb1);
		pnlRadioButtons.add(rb2);
		pnlRadioButtons.add(rb3);
		pnlRadioButtons.add(rb4);
		pnlRadioButtons.add(rb5);
		this.addListeners();
		this.add(pnlRadioButtons, BorderLayout.CENTER);
		this.add(btn, BorderLayout.SOUTH);
	}
	
	public void addListeners(){
		ImageListener listener = new ImageListener();
		rb1.addActionListener( listener );
		rb2.addActionListener( listener );
		rb3.addActionListener( listener );
		rb4.addActionListener( listener );
		rb5.addActionListener( listener );
		btn.addActionListener( new EraseListener() );
	}
	
	private class EraseListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.eraseImage();
		}	
	}
	
	private class ImageListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if( rb1.isSelected() ){
				controller.newImage("images/london06.jpg");
			}
			else if(rb1.isSelected()){
				controller.newImage("images/filmlogga.jpg");
			}	
			else if(rb3.isSelected()){
				controller.newImage("images/lugi.gif");
			}
			else if(rb4.isSelected() ){
				controller.newImage("images/tandem1.jpg");
			}
			else if(rb5.isSelected()){
				controller.newImage("images/program.bmp");
			}
		}
	}
}
