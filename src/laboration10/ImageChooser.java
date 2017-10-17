package laboration10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class ImageChooser extends JPanel{
	/* Ser. Version def. ID required to avoid warning */
	private static final long serialVersionUID = 1L;

	private JPanel pnlRadioButtons;
	private JRadioButton[] rb;
	private JButton btn;
	private final Controller controller;
	private final String[] imgPaths = {
		"images/london06.jpg",
		"images/filmlogga.jpg",
		"images/lugi.gif",
		"images/tandem1.jpg",
		"images/program.bmp",
	};
	
	public ImageChooser(Controller controller){
		this.controller = controller;
		
		initializeComponents();
		addListeners();
		
		add(pnlRadioButtons, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}
	
	private void initializeComponents() {
		final int 	NBR_RADIO_BUTTONS = 5,
					GRID_WIDTH = 5,
					GRID_HEIGHT = 1;
		
		rb = new JRadioButton[NBR_RADIO_BUTTONS];
		pnlRadioButtons = new JPanel(new GridLayout(GRID_WIDTH, GRID_HEIGHT));
		btn = new JButton();
		
		for (int i = 0; i < NBR_RADIO_BUTTONS; ++i) {
			rb[i] = new JRadioButton();
			pnlRadioButtons.add(rb[i]);
		}
	}
	
	public void addListeners(){
		ImageListener listener = new ImageListener();

		for (int i = 0; i < rb.length; ++i) {
			rb[i].addActionListener(listener);
		}
		
		btn.addActionListener( new EraseListener() );
	}
	
	private final class EraseListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.eraseImage();
		}
	}
	
	private final class ImageListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < rb.length; ++i) {
				if (rb[i].isSelected())
					controller.newImage(imgPaths[i]);
			}
		}
	}
}
