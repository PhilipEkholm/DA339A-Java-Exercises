package GissaTal;

import paintpanel.Sound;

public class StartApp {
	public static Sound getSound(String filename) {
		Sound sound = null;
		try {
			sound = new Sound(filename);
		} catch (Exception e) {
		}
		if (sound != null) {
			sound.play();
		}
		return sound;
	}

}
