package laboration10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class ImageChooser extends JPanel{
	/* Serial Version default ID required to avoid warning */
	private static final long serialVersionUID = 1L;

	private JPanel pnlRadioButtons;
	private JRadioButton[] rb;
	private ButtonGroup radioGroup = new ButtonGroup();
	private JButton btn;
	private final Controller controller;
	
	public ImageChooser(Controller controller){
		this.controller = controller;
		final int 	WINDOW_WIDTH  = 250,
					WINDOW_HEIGHT = 200;
		
		setLayout(null);
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		initializeComponents();
		setBounds();
		addListeners();
		
		add(pnlRadioButtons, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}
	
	private void initializeComponents() {
		
		final int 	NBR_RADIO_BUTTONS = 5,
					GRID_WIDTH        = 5,
					GRID_HEIGHT       = 1;
		final String[] LABELS = {
			"London",
			"FilmLogga",
			"Lugi",
			"Tandem",
			"Detta program",
		};
		
		rb = new JRadioButton[NBR_RADIO_BUTTONS];
		pnlRadioButtons = new JPanel(new GridLayout(GRID_WIDTH, GRID_HEIGHT));
		btn = new JButton("Ta bort bild");
		
		for (int i = 0; i < NBR_RADIO_BUTTONS; ++i) {
			rb[i] = new JRadioButton();
			pnlRadioButtons.add(rb[i]);
			rb[i].setText(LABELS[i]);
			radioGroup.add(rb[i]);
		}
	}
	
	private void setBounds() {
		btn.setBounds(5, 170, 240, 25);
		pnlRadioButtons.setBounds(10, 10, 150, 150);
	}
	
	public void addListeners(){
		final String IMGDIR = "images/";
		final String[] IMGPATHS = {
			"london06.jpg",
			"filmlogga.jpg",
			"lugi.gif",
			"tandem1.jpg",
			"program.bmp",
		};

		for (int i = 0; i < rb.length; ++i) {
			rb[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < rb.length; ++i) {
						if (rb[i].isSelected())
							controller.newImage(IMGDIR + IMGPATHS[i]);
					}
				}
			});
		}
		
		/* Erase chosen image */
		
		btn.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.eraseImage();
			}
		} );
	}
}
