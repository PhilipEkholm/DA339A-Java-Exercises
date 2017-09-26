package GissaTal;

import java.util.Random;

import javax.swing.JOptionPane;

import paintpanel.Sound;

public class Controller {
	public static void setEasy() {
		Random rand = new Random();
		int tal = 0;
		int försök = 5;
		Sound s = StartApp.getSound("sound/BackGroundMusic.mp3");
		int cpu = rand.nextInt(10);
		System.out.println(cpu);
		boolean inputOK = false;
		do {
			try {
				tal = Integer.parseInt(JOptionPane.showInputDialog("Gissa ett tal mellan 0-10 du har " + försök
						+ " försök på dig! \n (-10 för avbrott)"));
				inputOK = true;
				försök--;
				if (tal < cpu && tal >= 0 && försök > 0) {
					JOptionPane.showMessageDialog(null, "talet är för liten");
				} else if (tal > cpu && tal <= 10 && försök > 0) {
					JOptionPane.showMessageDialog(null, "talet är för stort");
				} else if (tal > 10) {
					JOptionPane.showMessageDialog(null, "Fel inmatning: Ange ett tal mellan 0-10");
					försök++;
				} else if (tal < 0 && tal != -10) {
					JOptionPane.showMessageDialog(null, "Fel inmatning: Ange ett tal mellan 0-10");
					försök++;
				} else if (tal == cpu) {
					s.stop();
					Sound sound = StartApp.getSound("sound/win1.mp3");
					JOptionPane.showMessageDialog(null, "Grattis du vann, spela igen eller avsluta programmet");
					sound.stop();
				}

			} catch (NumberFormatException ex) {
			}
		} while (inputOK == false || tal != cpu && försök != 0 && tal != -10);
		if (försök == 0 && tal != cpu) {
			s.stop();
			Sound sound = StartApp.getSound("sound/lose.mp3");
			JOptionPane.showMessageDialog(null,
					"Du förlorade, talet var " + cpu + ", försök igen eller avsluta programmet");
			sound.stop();
		} else if (tal == -10) {
			s.stop();
			JOptionPane.showMessageDialog(null, "Du har återgått till menyn");
		}
	}

	public void setMedium() {
		Random rand = new Random();
		int tal = 0;
		int försök = 5;
		Sound s = StartApp.getSound("sound/BackGroundMusic.mp3");
		int cpu = rand.nextInt(50);
		System.out.println(cpu);
		boolean inputOK = false;
		do {
			try {
				tal = Integer.parseInt(JOptionPane.showInputDialog("Gissa ett tal mellan 0-50 du har " + försök
						+ " försök på dig! \n(-10 för avbrott)"));
				inputOK = true;
				försök--;
				if (tal < cpu && tal >= 0 && försök > 0) {
					JOptionPane.showMessageDialog(null, "talet är för litet");
				} else if (tal > cpu && tal <= 50 && försök > 0) {
					JOptionPane.showMessageDialog(null, "talet är för stort");
				} else if (tal > 50) {
					JOptionPane.showMessageDialog(null, "Fel inmatning: Ange ett tal mellan 0-50");
					försök++;
				} else if (tal < 0 && tal != -10) {
					JOptionPane.showMessageDialog(null, "Fel inmatning: Ange ett tal mellan 0-50");
					försök++;
				} else if (tal == cpu) {
					s.stop();
					Sound sound = StartApp.getSound("sound/win1.mp3");
					JOptionPane.showMessageDialog(null, "Grattis du vann, spela igen eller avsluta programmet");
					sound.stop();
				}

			} catch (NumberFormatException ex) {
			}
		} while (inputOK == false || tal != cpu && försök != 0 && tal != -10);
		if (försök == 0 && tal != cpu) {
			s.stop();
			Sound sound = StartApp.getSound("sound/lose.mp3");
			JOptionPane.showMessageDialog(null,
					"Du förlorade, talet var " + cpu + ", försök igen eller avsluta programmet");
			sound.stop();
		} else if (tal == -10) {
			s.stop();
			JOptionPane.showMessageDialog(null, "Du har återgått till menyn");
		}
	}

	public static void setHard() {
		Random rand = new Random();
		int tal = 0;
		int försök = 5;
		Sound s = StartApp.getSound("sound/BackGroundMusic.mp3");
		int cpu = rand.nextInt(100);
		System.out.println(cpu);
		boolean inputOK = false;
		do {
			try {
				tal = Integer.parseInt(JOptionPane.showInputDialog("Gissa ett tal mellan 0-100 du har " + försök
						+ " försök på dig! \n(-10 för avbrott)"));
				inputOK = true;
				försök--;
				if (tal < cpu && tal >= 0 && försök > 0) {
					JOptionPane.showMessageDialog(null, "talet är för litet");
				} else if (tal > cpu && tal <= 100 && försök > 0) {
					JOptionPane.showMessageDialog(null, "talet är för stort");
				} else if (tal > 100) {
					JOptionPane.showMessageDialog(null, "Fel inmatning: Ange ett tal mellan 0-10");
					försök++;
				} else if (tal < 0 && tal != -10) {
					JOptionPane.showMessageDialog(null, "Fel inmatning: Ange ett tal mellan 0-10");
					försök++;
				} else if (tal == cpu) {
					s.stop();
					Sound sound = StartApp.getSound("sound/win1.mp3");
					JOptionPane.showMessageDialog(null, "Grattis du vann, spela igen eller avsluta programmet");
					sound.stop();
				}

			} catch (NumberFormatException ex) {
			}
		} while (inputOK == false || tal != cpu && försök != 0 && tal!=-10);
		if (försök == 0 && tal != cpu) {
			s.stop();
			Sound sound = StartApp.getSound("sound/lose.mp3");
			JOptionPane.showMessageDialog(null,
					"Du förlorade, talet var " + cpu + ", försök igen eller avsluta programmet");
			sound.stop();
		} else if (tal == -10) {
			s.stop();
			JOptionPane.showMessageDialog(null, "Du har återgått till menyn");
		}
	}

	
}
