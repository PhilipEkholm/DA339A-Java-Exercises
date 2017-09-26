package laboration7;

public class RunTables {
	public static void main(String[] args) {
		Table sweetTable = new Table("Mahogany", 16, 5, 2);
		
		System.out.println(sweetTable.getDepth());
		System.out.println(sweetTable.getMaterial());
		System.out.println(sweetTable.toString());
		
		sweetTable.setMaterial("wood");
		System.out.println(sweetTable.getMaterial());
	}
}
