package laboration7;

public class RunBox {
	public static void main(String[] args) {
		Box fineBox = new Box(25, 25, 25);
		fineBox.setHeight(2);
		fineBox.setDepth(30);
		System.out.println(fineBox.toString());
		
		Box anotherBox = new Box(34, 21, 13);
		anotherBox.setFull(true);
		
		System.out.println(anotherBox.toString());
	}
}
