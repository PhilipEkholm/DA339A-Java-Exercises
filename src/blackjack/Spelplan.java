package blackjack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class Spelplan extends JPanel implements ActionListener
{
	Timer theTimer;
	int delay=20;

	public Spelplan()
	{
		theTimer = new Timer(delay, this);
		//setContentPane(new JLabel(new ImageIcon("images/background.png")));
		JLabel text = new JLabel("");
		JButton onemore = new JButton("Hit");
		onemore.setBounds(300, 400, 100, 50);
		
		JButton hold = new JButton("Stand");
		hold.setBounds(200, 400, 100, 50);
		Font theFont = new Font("Times", Font.PLAIN, 45);
		text.setFont(theFont);
		text.setForeground(Color.red);
		text.setBounds(180, 20, 600, 123);
		
        JLabel thecard = new JLabel(new ImageIcon("images/KnightSpades.png"));
        thecard.setBounds(200, 200, 79, 123);
        JLabel thecard2 = new JLabel(new ImageIcon("images/knighthearts.png"));
        thecard2.setBounds(300, 200, 79, 123);
        JLabel thecard3 = new JLabel(new ImageIcon("images/AceHearts.png"));
        thecard3.setBounds(400, 200, 79, 123);
        setLayout(null);
        
        
       /* add(thecard); // see javadoc for more info on the parameters 
        add(thecard2);
        add(thecard3);*/
        add(onemore);
        add(hold);
        add(text);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}
	
	  protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
           
	    }
	
}
