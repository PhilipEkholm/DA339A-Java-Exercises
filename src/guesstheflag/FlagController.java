package guesstheflag;

import java.util.Random;
import gu2.PaintWindow_GU2;

public class FlagController {
	private FlagView view;
	private FlagModel model;
	private Random rand;
	private int points;
	private FlagOptions playerOption,
						correctFlag;
	
	public FlagController(FlagView view, FlagModel model){
		this.view = view;
		this.model = model;
		this.rand = new Random();
		
		this.view.startupScreen();
		this.newGame();
		this.addListeners();
		
		this.pickNewCountry();
	}
	
	public void newGame(){
		this.points = 0;
		this.view.startGame();
	}
	
	private void addListeners(){
		//En liten genväg som gör koden lite mer läsbar
		FlagView ref = this.view;
								
		ref.getWindow().setIconAction(ref.getWindowIcons()[0], this, "leftImagePressed");
		ref.getWindow().setIconAction(ref.getWindowIcons()[1], this, "middleImagePressed");
		ref.getWindow().setIconAction(ref.getWindowIcons()[2], this, "rightImagePressed");
		ref.getWindow().setIconAction(ref.getWindowIcons()[3], this, "noOpButtonPressed");
								
		//Sätt upp så man kan spela med piltangenter dessutom
		ref.getWindow().setKeyPressed(PaintWindow_GU2.VK_LEFT, this, "leftImagePressed");
		ref.getWindow().setKeyPressed(PaintWindow_GU2.VK_UP, this, "middleImagePressed");
		ref.getWindow().setKeyPressed(PaintWindow_GU2.VK_RIGHT, this, "rightImagePressed");
		ref.getWindow().setKeyPressed(PaintWindow_GU2.VK_DOWN, this, "noOpButtonPressed");
	}
	
	private void pickNewCountry(){
		String[] 	countries = this.model.getCountries(),
					flagID = this.model.getFlagsName();
		String imgPath = "images/guesstheflag/flags250/";
		int randomPick = this.rand.nextInt(countries.length);
		int number = this.rand.nextInt(100) + 1;
		int[] numbers = new int[4];
		numbers[0] = randomPick;
		int rand2 = this.pickRandomShuffle(countries.length, numbers);
		String[] paths = new String[3];
		
		if(number <= 30){
			paths[0] = imgPath + flagID[randomPick];
			paths[1] = imgPath + flagID[rand2];
			numbers[1] = rand2;
			rand2 = this.pickRandomShuffle(countries.length, numbers);
			paths[2] = imgPath + flagID[rand2];
			this.correctFlag = FlagOptions.LEFT;
			
			System.out.println("Alternativ 1 skedde");
		}
		else if((number > 30) && (number <= 60)){
			paths[1] = imgPath + flagID[randomPick];
			paths[0] = imgPath + flagID[rand2];
			numbers[1] = rand2;
			rand2 = this.pickRandomShuffle(countries.length, numbers);
			paths[2] = imgPath + flagID[rand2];
			this.correctFlag = FlagOptions.MIDDLE;

			System.out.println("Alternativ 2 skedde");
		}
		else if((number > 60) && (number <= 90)){
			paths[2] = imgPath + flagID[randomPick];
			paths[0] = imgPath + flagID[rand2];
			numbers[1] = rand2;
			rand2 = this.pickRandomShuffle(countries.length, numbers);
			paths[1] = imgPath + flagID[rand2];
			this.correctFlag = FlagOptions.RIGHT;

			System.out.println("Alternativ 3 skedde");
		}
		else{
			paths[2] = imgPath + flagID[rand2];
			numbers[1] = rand2;
			rand2 = this.pickRandomShuffle(countries.length, numbers);
			paths[0] = imgPath + flagID[rand2];
			numbers[2] = rand2;
			rand2 = this.pickRandomShuffle(countries.length, numbers);
			paths[1] = imgPath + flagID[rand2];
			this.correctFlag = FlagOptions.NONE;

			System.out.println("Alternativ 4 skedde");
		}
		
		this.view.updateContent(countries[randomPick], paths, this.points);
	}
	
	private int pickRandomShuffle(int max, int[] invalids){
		boolean detected;
		
		while(true){
			int randNumber = this.rand.nextInt(5) + 1;
			detected = false;
			
			for(int invalidNumber: invalids){
				if(randNumber == invalidNumber){
					detected = true;
				}
			}
			
			if(!detected){
				return randNumber;
			}
		}
	}
	
	private void givePoint(){
		if(this.correctFlag == this.playerOption){
			this.points++;
			this.view.showMessage("Rätt!");
		}
		else{
			this.points--;
			this.view.showMessage("Hah! Fel");
		}
		
		this.view.updatePoints(this.points);
		this.pickNewCountry();
	}
	
	public void leftImagePressed(){
		this.playerOption = FlagOptions.LEFT;
		this.givePoint();
	}
	
	public void middleImagePressed(){
		this.playerOption = FlagOptions.MIDDLE;
		this.givePoint();
	}
	
	public void rightImagePressed(){
		this.playerOption = FlagOptions.RIGHT;
		this.givePoint();
	}
	
	public void noOpButtonPressed(){
		this.playerOption = FlagOptions.NONE;
		this.givePoint();
	}
}
