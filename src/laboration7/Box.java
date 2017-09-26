package laboration7;

public class Box {
	private int width, 
				height, 
				depth;
	private boolean full;
	
	public Box(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.full = false;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + ", full=" + full + "]";
	}
}
