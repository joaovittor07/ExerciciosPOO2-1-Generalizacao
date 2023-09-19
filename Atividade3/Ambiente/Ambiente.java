package Ambiente;

public class Ambiente {

	private float area;
	
	public Ambiente(float area) {
		super();
			this.area = area;
	}
	
	public Ambiente() {
		
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		if(area > 0)
		this.area = area;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ambiente [area=");
		builder.append(area).append(area);
		builder.append("]");
		return builder.toString();
	}
	
}
