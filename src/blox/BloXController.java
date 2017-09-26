package blox;

import gu2.PaintWindow_GU2;
import java.util.*;

public class BloXController {
	private BloXView view;
	private BloXModel model;
	private Random rand = new Random();
	
	public BloXController(BloXView view, BloXModel model){
		this.view = view;
		this.model = model;
		
		this.view.spawnPlayer(rand.nextInt(700) + 50, 460);
		this.view.window.setKeyPressed(PaintWindow_GU2.VK_LEFT, view, "movePlayerLeft");
		this.view.window.setKeyPressed(PaintWindow_GU2.VK_RIGHT, view, "movePlayerRight");
	}
}
