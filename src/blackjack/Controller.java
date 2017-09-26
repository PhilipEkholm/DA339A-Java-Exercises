package blackjack;


import java.util.Random;

import javax.swing.ImageIcon;


import gu2.PaintWindow_GU2;

public class Controller
{
	Card[] cardDeck;
	int amountPerSet=20;
	int lastCardIndex=51;
	int roundNumber=4;

	Player theComputer;
	Player theHuman;
	BlackJackGUI theGUI;
	
	
	public Controller(BlackJackGUI theGUI)
	{
		setCardDeck();
		theComputer = new Player();
		theHuman = new Player();
		this.theGUI=theGUI;
		//theGUI = new BlackJackGUI(this);


	}
	// Round 1
	public void runFirstRound()
	{
		roundNumber=1;
		computerPicksNewCard();
		humanPicksNewCard();
		humanPicksNewCard();
		
		theGUI.setInstructText("Score " + theHuman.getValueOfCards() + ", Hit or stand?");
		
		roundNumber=2;
		
		if(theHuman.getValueOfCards()==21)
		{
			setOver();
		}
	
	}
	// Round 2
	public void runHumanRound()
	{
		
			humanPicksNewCard();
			
			theGUI.setInstructText("Score " + theHuman.getValueOfCards() + ", Hit or stand?");
			
			if(theHuman.getValueOfCards()>=21)
			{
				setOver();	
			}		
	}
	
	// Round 3
	public void computerRound()
	{
		while(theComputer.getValueOfCards()<17)
		{
			computerPicksNewCard();
			theGUI.setInstructText("Computer's score " + theComputer.getValueOfCards());
		}
			setOver();		
	}
	public void computerPicksNewCard()
	{
		
		Card computersCard = generateACard();
		
		if(computersCard.getValue()==11)
			if(theComputer.getValueOfCards()>10)
				computersCard.setValue(1);
		
		theComputer.setValueOfCards(theComputer.getValueOfCards() + computersCard.getValue());
		theComputer.setAmountOfCards(theComputer.getAmountOfCards()+1);
		
		theGUI.animateTheComputerCard(computersCard, theComputer.getAmountOfCards());
	
	}
	public void humanPicksNewCard()
	{
		Card humansCard = generateACard();
		
		if(humansCard.getValue()==11)
			if(theHuman.getValueOfCards()>10)
				humansCard.setValue(1);
		
		theHuman.setValueOfCards(theHuman.getValueOfCards() + humansCard.getValue());
		theHuman.setAmountOfCards(theHuman.getAmountOfCards()+1);
		
		theGUI.animateTheHumanCard(humansCard, theHuman.getAmountOfCards());
	}
	public void newSet()
	{
		theHuman.setAmountOfCards(0);
		theHuman.setValueOfCards(0);
		theComputer.setAmountOfCards(0);
		theComputer.setValueOfCards(0);
		theGUI.animateClearTable();
		theGUI.setInstructText("");
		setCardDeck();
		PaintWindow_GU2.pause(2000); 
		if(roundNumber==1)
			runFirstRound();
		
	}
	
	
	public void setOver()
	{
		roundNumber=1;
		chooseTheWinner();
		PaintWindow_GU2.pause(2000); 
		newSet();
		
	}
	public void chooseTheWinner()
	{
		String theMessage="";
		
		if(theHuman.getValueOfCards()==21)
		{
			if(theHuman.getAmountOfCards()==2)
			{
				theMessage="Blackjack, you won!!!";
				theHuman.setChips((int) (theHuman.getChips() + (amountPerSet*1.5)+0.5));
			}
			else
			{
				theMessage="Your score: 21, you won!";  
				theHuman.setChips((theHuman.getChips() + amountPerSet));							
			}
		}
		else if(theHuman.getValueOfCards()>21)
		{
			theMessage="Your score: " + theHuman.getValueOfCards() + ", You lost";
			theHuman.setChips((theHuman.getChips() - amountPerSet));	
		}
		else if(theComputer.getValueOfCards()>21)
		{
			theMessage="Your score: " + theHuman.getValueOfCards() + ", You won!";
			theHuman.setChips((theHuman.getChips() + amountPerSet));	
		}
		else if(theHuman.getValueOfCards()==20 && theComputer.getValueOfCards()==20)
		{
			theMessage="Your Score: " + theHuman.getValueOfCards() + ", Even.";
		}
		else if(theHuman.getValueOfCards()>theComputer.getValueOfCards())
		{
			theMessage="Your score: " + theHuman.getValueOfCards() + ", You won!";
			theHuman.setChips((theHuman.getChips() + amountPerSet));	
		}
		else if(theHuman.getValueOfCards()<theComputer.getValueOfCards())
		{
			theMessage="Your score: " + theHuman.getValueOfCards() + ", You lost";
			theHuman.setChips((theHuman.getChips() - amountPerSet));
		}
		else
		{
			theMessage="Your score: " + theHuman.getValueOfCards() + ", You lost";
			theHuman.setChips((theHuman.getChips() - amountPerSet));
		}
		
		for(int i=0; i<3; i++)
		{
			theGUI.setInstructText("");
			PaintWindow_GU2.pause(500); 
			theGUI.setInstructText(theMessage);
			PaintWindow_GU2.pause(500); 
			
		}
		theGUI.setChipsLabel(theHuman.getChips()+"");
		
		if(theHuman.getChips()==0)
		{
			theGUI.playSong();
			theGUI.setInstructText("Game over, you have no more chips left.");
			
			roundNumber=4;
		}
		
	}

	public Card generateACard()
	{
		Card theCard=null;
		
		int theNewCardIndex=new Random().nextInt(lastCardIndex+1);
		theCard = cardDeck[theNewCardIndex];
			
		cardDeck[theNewCardIndex]=cardDeck[lastCardIndex];
		cardDeck[lastCardIndex]=theCard;
			
		lastCardIndex--;
			
	
		return theCard;
	}
	
	public Card[] getCardDeck()
	{
		return cardDeck;
	}
	
	private void setCardDeck()
	{
		cardDeck = new Card[52];
		int cardIndex=0;
		for(int i =0; i<4; i++)
		{
			String theSuit="";
			switch (i)
			{
				case (0):
				theSuit="Hearts";
				break;
				case (1):
				theSuit="Diamonds";
				break;
				case (2):
				theSuit="Clubs";
				break;
				case (3):
				theSuit="Spades";
			}
			
			for(int y = 1; y<14; y++)
			{
				int theValue=0;
				
				if(y==1)
				{
					theValue=11;
				}
				else if(y>9)
				{
					theValue=10;
				}
				else 
				{
					theValue=y;
				}
				String theCardName = theSuit+"_" + y;
				cardDeck[cardIndex] = new Card(theSuit, theValue, new ImageIcon("images/cards/" + theCardName + ".png"));
				cardIndex++;		
			}		
		}
		
		lastCardIndex=51;
	}
	public int getLastCardIndex()
	{
		return lastCardIndex;
	}
	
	public int getRoundNumber()
	{
		return roundNumber;
	}
	public Player getHumanPlayer()
	{
		return theHuman;
	}
	public Player getComputerPlayer()
	{
		return theComputer;
	}

	public void setRoundNumber(int roundNumber)
	{
		this.roundNumber = roundNumber;
	}
	
	
		
	public static void main(String[] oo)
	{
		//Controller theController = new Controller();
	/*	for(int i=0;i<100;i++)
		{
			Card a = theController.generateACard();
			System.out.println(i+"."+a.getPicture() + " " + a.getValue());
		}*/
	}

}
