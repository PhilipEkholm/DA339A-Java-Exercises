package laboration7; 
import javax.swing.*;  
public class ContactTest {     
	public void action() {         
		Contact contact = new Contact();         
		String name, phone;         
		name = JOptionPane.showInputDialog("Ange namn");  
		contact.setName(name);
		phone = JOptionPane.showInputDialog("Ange hemtelefon");        
		contact.setPhone(phone);
		contact.setCellPhone(JOptionPane.showInputDialog("Ange mobil"));         
		contact.setEmail(JOptionPane.showInputDialog("Ange mail-adress"));
		
		JOptionPane.showMessageDialog(null, contact.toString());
		JOptionPane.showMessageDialog(null, contact.getName() + "\n" +                                            
		contact.getPhone() + "\n" +                                             
		contact.getCellPhone() + "\n" +                                 
		contact.getEmail());     
	}      
	
	public static void main(String[] args) {         
		ContactTest prog = new ContactTest();         
		prog.action();     
	} 
} 