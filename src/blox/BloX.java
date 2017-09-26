package blox;

public class BloX {
	public static void main(String[] args) {
		BloXView view = new BloXView();
		BloXModel model = new BloXModel();
		BloXController controller = new BloXController(view, model);
	}
}
