package laboration7;

public class RunHouse {
	public static void main(String[] args) {
		House dockan = new House(2009, 500, 500);
		
		System.out.println(dockan.toString());
		dockan.setBuildingYear(2014);
		System.out.println(dockan.toString());
		dockan.setSize(1000);
		System.out.println(dockan.toString());
	}
}
