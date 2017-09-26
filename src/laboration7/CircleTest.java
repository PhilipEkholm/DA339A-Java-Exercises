package laboration7;

/**  
 *  Programmet använder ett objekt av typen Circle. Men på felaktigt sätt.  
 *   Rätta till felen i programmet.  
 *    @author Rolf Axelsson  
 */ 
public class CircleTest {     
	public static void main(String[] args) {         
		Circle c = new Circle(23.2);
		
		System.out.println( "CIRKEL med radie = " + c.getRadius() ); // getRadius        
		System.out.println( "CIRKEL med area = " + c.area()); // båda understrykningarna och lite till kan ersättas med area         
		
		System.out.println( "CIRCLE, radius = " + (c.getRadius() + 5.7) ); // toString     
	} 
}