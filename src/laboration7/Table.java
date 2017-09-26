package laboration7;

public class Table {
	private String material;
	private double width,
					height,
					depth;
	
	public Table(String material, double width, double height, double depth){
		this.material = material;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double surfaceArea(){
		return this.width * this.depth;
	}

	@Override
	public String toString() {
		return "Table [material=" + material + ", width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
}
