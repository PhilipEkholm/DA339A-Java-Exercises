package blackjack;

import javax.swing.ImageIcon;

public class Card {

	private String suit;
	private int value;
	private ImageIcon pictureObjekt;
	private int x;
	private int y;
	
	public Card(String color, int value, ImageIcon pictureObjekt)
	{
		this.suit=color;
		this.value=value;
		
		this.pictureObjekt=pictureObjekt;
	}
	
	public ImageIcon getPictureObjekt()
	{
		return pictureObjekt;
	}
	public void setPictureObjekt(ImageIcon pictureObjekt)
	{
		this.pictureObjekt=pictureObjekt;
	}
		
	public String getColor(){
		return suit;
	}
	
	public int getValue(){
		return value;
	}
	
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y)
	{
		this.y=y;	
	}
	
	
	public void setColor(String color){
		this.suit = color;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	
	
}