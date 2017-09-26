package laboration7;

public class House {
	private int buildingYear,
				size,
				garden;

	public House(int buildingYear, int size, int garden) {
		super();
		this.buildingYear = buildingYear;
		this.size = size;
		this.garden = garden;
	}

	public int getBuildingYear() {
		return buildingYear;
	}

	public void setBuildingYear(int buildingYear) {
		this.buildingYear = buildingYear;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getGarden() {
		return garden;
	}

	public void setGarden(int garden) {
		this.garden = garden;
	}

	@Override
	public String toString() {
		return "Hus byggt " + this.buildingYear + " med " + this.size + " kvm bostadsyta. Tomten är " + this.garden + "kvm stor";
	}
	
	
}
