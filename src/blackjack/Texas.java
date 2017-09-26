package blackjack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Texas extends JFrame implements ActionListener
{
	
	
	Spelplan theField;
	JLabel coins;
	JButton start;
	JButton replay;
	
	int amountOfCoins=0;
	
	
	public Texas()
	{
		
		
		theField = new Spelplan();
		theField.setBounds(100, 10, 690, 555);
		theField.setOpaque(false);
		
		
		coins = new JLabel("0", JLabel.RIGHT);
		coins.setBackground(Color.BLACK);
		coins.setOpaque(true);
		coins.setForeground(Color.WHITE);
		coins.setBounds(10, 15, 70, 20);
		
		start = new JButton("Replay");
		start.setBounds(10, 35, 70, 20);
		
		replay = new JButton("Quit");
		replay.setBounds(10, 55, 70, 20);
		
		setTitle("Black Jack");
		setSize(800, 600);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("images/background.png")));
		
		setLocation(700, 400);
		add(theField);
		add(coins);
		add(start);
		add(replay);
		
		
		
		JPanel theRightPanel = new JPanel(){
	        @Override
	        public void paintComponent(Graphics g){
	            super.paintComponent(g);
	            //g.drawRect(50, 50, 300, 200);
	        }
	    };
	    theRightPanel.setBounds(new Rectangle(0, 0, 100, 600));
	    theRightPanel.setBackground(new Color(12, 66, 7));
		
	    add(theRightPanel);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		amountOfCoins=Integer.parseInt(JOptionPane.showInputDialog("Insert coins"));
		coins.setText(amountOfCoins+"");
		//this.repaint();
		
		
		
	}
		
	public static void main(String oo[])
	{
		new Texas();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}
	
	
}
