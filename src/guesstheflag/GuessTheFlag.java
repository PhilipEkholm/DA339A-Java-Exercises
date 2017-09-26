package guesstheflag;
import gu2.PaintWindow_GU2;

public class GuessTheFlag {
	
	public GuessTheFlag(PaintWindow_GU2 theGui)
	{
		FlagView view = new FlagView(theGui);
		FlagModel model = new FlagModel();
		FlagController controller = new FlagController(view, model);
	}
	
	
/*	public static void main(String[] args) {
		FlagView view = new FlagView();
		FlagModel model = new FlagModel();
		FlagController controller = new FlagController(view, model);
	}*/
}
