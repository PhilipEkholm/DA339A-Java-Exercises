package g1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.*;

import gu1.PaintWindow_GU1;
// Huvudfönstret där presentationen av varje gruppmedlem finns.
public class HuvudFonstret
{
    

    int i =0;
    ImageIcon theImage;
    Person[] gruppmedlemmarna = new Person[7];
    
    
    HuvudFonstret()
    {

        
        PaintWindow_GU1.showWindow(1200, 900, "Grupp 1", Color.WHITE);
        
        gruppmedlemmarna[0] = new Person("Anas Abu Al-Soud", "Studerar Datateknik och Mobil IT. Intresserad av teknik", "Spelar fotboll på fritiden","images/Anas.jpg",19, -3, 0, 1200, 10);   
        gruppmedlemmarna[1]  = new Person("Viktor Werngren", "Jag bor i Höllviken samt studerar Datateknik och Mobil IT på Malmö Högskola.", "På fritiden tränar jag på gym","images/Viktor.png",19, 0, -3, 0, 900); 
        gruppmedlemmarna[2]  = new Person("Philip Ekholm", "Bor i Svedala. Jag gillar gurka. Jag tror på öresundsdrömmen och tycker √2 är världens vackraste tal.","Ingenjörsstudent", "images/Philip.jpg", 19, -3, 0, 1200, 10);
        gruppmedlemmarna[3]  = new Person("Erfan Tavoosi", "Erfan studerar Datateknik programmet på Malmö Högskola och tycker att det är en intressant och spännande utbildning", "Erfan tycker om att utveckla sina kunskaper inom ämnet elektronik och programmering. På fritiden så spenderar Erfan mycket tid med vänner och familj när studierna tillåter detta", "images/Erfan.jpg", 34,  0, -3, 0, 900);
        gruppmedlemmarna[4] = new Person("Björn Berggren", "Jag studerar datateknik på Malmö högskola och gillar att sova på dagarna.", "Arbetar på Cybercom", "images/Bjorn.png", 34, -3, 0, 1200, 10);
        gruppmedlemmarna[5] = new Person("Anton Nilsson", "Anton är en social typ vid gott humör vilket man inte kan märka av på morgonen.", "Gillar äventyr, att festa, ut å kampa, men också lugnare filosofiska kvällar med lite öl och Nintendo lir!", "images/Anton.jpg", 22,  0, -3, 0, 900);
        gruppmedlemmarna[6] = new Person("Kim Nguyen", "Halleå! Jag bor i Ängelholm och studerar Datateknik och Mobil IT på Malmö Högskola.", "Jag dansar, umgås med kamrater och brukar spela lite på fritiden.”", "images/Kim.png", 19, -3, 0, 1200, 10); 
            
        
        Font header = new Font ("Garamond", Font.BOLD , 20);
        Font desc = new Font("Garamond", Font.PLAIN, 15);
        int start=0;
        int Xstart=1200;
       
            PaintWindow_GU1.addText("name", "Namn: " + gruppmedlemmarna[start].getNamn(), 520, 10, header, Color.BLACK);
            PaintWindow_GU1.addText("age", gruppmedlemmarna[start].getAlder() +"", 520, 40, header, Color.BLACK);
            PaintWindow_GU1.addText("doing", "Sysselsättning: " + gruppmedlemmarna[start].getSysselsattning(), 520, 60, header, Color.BLACK);
            PaintWindow_GU1.addText("description", gruppmedlemmarna[start].getBeskrivning(), 15, 540, desc, Color.BLACK);
            
            ImageIcon imgTest = new ImageIcon(gruppmedlemmarna[start].getBild());
            PaintWindow_GU1.addIcon("Bilden", imgTest, 1200, 10, true);
            
            PaintWindow_GU1.addIcon("btnLeft", new ImageIcon("images/left.png"), 20, 580, true);
            PaintWindow_GU1.addIcon("btnRight", new ImageIcon("images/right.png"), 420, 580, true);
            
            
            PaintWindow_GU1.setIconAction("btnRight", this, "nextPerson");
            PaintWindow_GU1.setIconAction("btnLeft", this, "backPerson");
            PaintWindow_GU1.setKeyPressed(KeyEvent.VK_RIGHT, this, "nextPerson");
            PaintWindow_GU1.setKeyPressed(KeyEvent.VK_LEFT, this, "backPerson");
            
        try
        {
             System.setProperty("apple.laf.useScreenMenuBar", "true");
             System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Grupparbetet");        
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
        }
        nextEdit();
        
    }
    public void nextPerson()
    {
    	i++;
	if(i<gruppmedlemmarna.length)
        {
			
			System.out.println("Length:"+ gruppmedlemmarna.length + " i: " + i);
       	 	nextEdit();
       	 	
	 }
  	else
        {
            i=0;
            nextEdit();
        }
    }
    public void backPerson()
    {
        if(i==0)
        {
            i=gruppmedlemmarna.length;
        }
        i--;
        nextEdit();
    }
    void nextEdit()
    {
        
        PaintWindow_GU1.removeIcon("Bilden");

        
    
        PaintWindow_GU1.setText("name", "Namn: " + gruppmedlemmarna[i].getNamn());
        PaintWindow_GU1.setText("age", gruppmedlemmarna[i].getAlder()+"");
        PaintWindow_GU1.setText("doing", "Sysselsättning: " + gruppmedlemmarna[i].getSysselsattning());
        PaintWindow_GU1.setText("description", gruppmedlemmarna[i].getBeskrivning());
        
      movePicture();
           
           
    }
	public void movePicture() {
		
		
		theImage = new ImageIcon(gruppmedlemmarna[i].getBild()); // Skapar bildobjektet för Person med index i
		int dx = gruppmedlemmarna[i].getXriktning(); // Förflyttning i x-led
		int dy = gruppmedlemmarna[i].getYriktning(); // Förflyttning i y-led
		int x = gruppmedlemmarna[i].getXstart(); // Startpositionen på skärmen i x-led
		int y = gruppmedlemmarna[i].getYstart();  //Startpositionen på skärmen i Y-led
		
		PaintWindow_GU1.addIcon("Bilden", theImage, x, y, true); // Lägger till bilden på skärmen
		
			while(x>=0 && y>=0) // ändrar positionen på skärmen tills villkoret inte stämmer längre 
			{
			
				x += dx; // Ändrar x-variabeln
				y += dy; // Ändrar y-variabeln
				PaintWindow_GU1.setIconXY("Bilden",x,y); // Ändrar positionen på bilden
				PaintWindow_GU1.pause(20); // Bestämmer hastigheten på förflyttningen, genom ställa in en pause mellan förändringarna
		

			}
		}
	}	
    
 



