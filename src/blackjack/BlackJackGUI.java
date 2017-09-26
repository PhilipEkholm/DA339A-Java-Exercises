package blackjack;

import java.awt.Color;
import java.awt.Font;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import gu2.PaintWindow_GU2;
import paintpanel.Text;
import paintwindow.PaintWindow;
import paintpanel.Sound;

public class BlackJackGUI{
	PaintWindow gui;
	boolean animOnGoing=false;
	Controller theController;
	Text instructLabel;
	Text chipsLabel;
	public Sound theSound = null;
	Icon startpic;
	
	
	// Initiering av Konstruktorn fÃ¶r grÃ¤nssnittet
	public BlackJackGUI(PaintWindow gui) 
	{
		//BlackJackGUI.class.getResource("cdcd");
		
		
		//theSound.play();
		this.gui = gui;
		theController = new Controller(this);
		startpic = new ImageIcon("images/blackjack_startpic.png");
		playSong();
		showStartPic();
			
		
		Icon imageIcon = new ImageIcon("images/background.png");
		gui.setBackground(imageIcon);
		
		Icon hitIcon = new ImageIcon("images/Hit.png");
		Icon standIcon = new ImageIcon("images/Stand.png");
		Icon theLogo = new ImageIcon("images/Logo.png");
		Icon play = new ImageIcon("images/play.png");
		Icon quit = new ImageIcon("images/quit.png");
		

		instructLabel = new Text("", new Font("Arialâ€�", Font.PLAIN, 22));
		instructLabel.setBackground(new Color(12, 66, 7));
		instructLabel.setForeground(Color.WHITE);
		
		chipsLabel = new Text(0+"", new Font("Arialâ€�", Font.PLAIN, 17));
		chipsLabel.setBackground(Color.BLACK);
		chipsLabel.setForeground(Color.WHITE);


		
		gui.addIcon(hitIcon, 422, 500, true);
		gui.addIcon(standIcon, 300, 500, true);
		gui.addIcon(theLogo, 350, 205, true);
		gui.addIcon(play, 7, 20+10, true);
		gui.addIcon(quit, 6, 51+10, true);
		gui.addIcon(chipsLabel, 7, 10, true);
		//gui.addIcon(instructLabel, 375, 180, true);
		gui.addText(instructLabel, 347, 180);

		gui.setIconAction(hitIcon, this, "printOutHit");
		gui.setIconAction(standIcon, this, "printOutStand");
		gui.setIconAction(play, this, "playTheGame");
		gui.setIconAction(quit, this, "quit");
		
		gui.fillRect(0, 0, 100, 600, new Color(12, 66, 7));
		gui.fillRect(7, 10, 87, 21, Color.BLACK);
		
		
		//this.theController = theController;	
		
	}
		
		public void setInstructText(String theText)
		{
			instructLabel.setText(theText);
		}
		
		public void setChipsLabel(String theAmount)
		{
			chipsLabel.setText(theAmount);
		}
		
		public void playTheGame() 
		{	
			if(theController.getRoundNumber()==4 && animOnGoing==false)
			{
				String amount = JOptionPane.showInputDialog("Insert coins");
				stopMusic();
				if(amount!=null)
				{
					chipsLabel.setText(amount);
					theController.getHumanPlayer().setChips(Integer.parseInt(amount));
				}
				else
					chipsLabel.setText(100+"");	
				
				theController.runFirstRound();
			}
		}
			
		
		public void playSong()
		{
			try
			{
				theSound = new Sound("sounds/music.mp3");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "The file \"TheCarSound.mp3\" must be stored in the folder \"sounds\".");
				System.exit(0);
			
			}
			
			theSound.play();
		}
		
	public void showStartPic()
	{
		gui.addIcon(startpic, 0, 0, true);
		PaintWindow_GU2.pause(3000);
		gui.removeIcon(startpic);
		
	}
	
	public void stopMusic()
	{
		for(double i=1; i>0;i-=0.1)
		{
			theSound.setVolume(i);
			PaintWindow_GU2.pause(20);
		}
		theSound.stop();
	}
		
	// Quit game
	public void quit() 
	{
		if(animOnGoing==false)
		{
			theController.setRoundNumber(4);
			//theController.newSet();
			gui.clearAll();
			stopMusic();
			gui.setBackground(Color.DARK_GRAY, 800, 600);
			new main.Main();
			//System.exit(0);
		}
					
	}
	
	// metodanrop fÃ¶r Hit
	public void printOutHit() 
	{	
		if(theController.getRoundNumber()==2 && animOnGoing==false)
		{
			theController.runHumanRound();
			
		}
		
	}

	//  metodanrop fÃ¶r Stand
	public void printOutStand() 
	{
		int theRoundNumber = theController.getRoundNumber();
		if(theRoundNumber==2 && animOnGoing==false)
		{
			theController.setRoundNumber(3);
			setInstructText("Computer's turn");
			theController.computerRound();
		}
	}

	public void animateTheComputerCard(Card theCard, int amountOfCards) 
	{
		animOnGoing=true;
		int theXDestination = 100+(40*amountOfCards);
		int theXPosition = 800;
		int theYposition = 50;
		int theXStep=2;
		ImageIcon theImage = theCard.getPictureObjekt();
		theCard.setX(theXPosition);
		theCard.setY(theYposition);
		
		gui.addIcon(theImage, theXPosition, theYposition, true);
		
		while(theXPosition > theXDestination)
		{
			theXPosition-=theXStep;
			theCard.setX(theXPosition);
			gui.setIconXY(theImage,theXPosition,theYposition); 
			PaintWindow_GU2.pause(10); 
		}
		animOnGoing=false;
	}
	
	public void animateTheHumanCard(Card theCard, int amountOfCards) 
	{
		animOnGoing=true;
		
		int theXDestination = 100+(40*amountOfCards);
		int theYDestination=350;
		int theYPosition = -122;
		int theYStep=2;
		ImageIcon theImage = theCard.getPictureObjekt(); 
		theCard.setX(theXDestination);
		theCard.setY(theYPosition);
		
		
		gui.addIcon(theImage, theXDestination, theYPosition, true);
		
		while(theYPosition <= theYDestination)
		{
			theYPosition+=theYStep;
			theCard.setY(theYPosition);
			gui.setIconXY(theImage,theXDestination,theYPosition); 
			PaintWindow_GU2.pause(10); 
		}
		
		animOnGoing=false;
	}
	
	
	public void moveCardToTheRight(Card theCard) 
	{
		int theX=theCard.getX();
		theX = theX + 2;
		theCard.setX(theX);
		
		gui.setIconXY(theCard.getPictureObjekt(), theX,theCard.getY()); 
	}
		
	public void animateClearTable() 
	{
		animOnGoing=true;
		Card[] theDeck = theController.getCardDeck();
		
		int startIndex = theController.getLastCardIndex()+1;
		Card[] tempDeck = new Card[theDeck.length-startIndex];
		
		int a=0;
		for(int i=startIndex; i<theDeck.length; i++)
		{
			tempDeck[a]=theDeck[i];
			a++;
		}
		
		int ap=0;
		while(tempDeck[tempDeck.length-1].getX()<800)
		{
			for(int i=0; i<tempDeck.length;i++)
			{
				moveCardToTheRight(tempDeck[i]);
			}
			PaintWindow_GU2.pause(10); 
			ap++;
		}
		
		for(int i=0; i<tempDeck.length;i++)
		{
			gui.removeIcon(tempDeck[i].getPictureObjekt());		
		}
		
		
		animOnGoing=false;
		
	}
		
	
	
	
	
	
	
	
	
	
}
