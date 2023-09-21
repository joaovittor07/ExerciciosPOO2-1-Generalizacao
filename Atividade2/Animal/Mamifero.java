package Animal;

public class Mamifero extends Animal {
	
	private String habitate;
	
	private boolean pelo;

	public Mamifero(int patas, double peso, double altura, String habitate, boolean pelo) {
		super(altura, habitate, pelo);
		this.habitate = habitate;
		this.pelo = pelo;
	}
	
	public Mamifero() {
		
	}

	public String getHabitate() {
		return habitate;
	}

	public void setHabitate(String habitate) {
		this.habitate = habitate;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [habitate=");
		builder.append(habitate);
		builder.append(", pelo=");
		builder.append(pelo);
		builder.append("]");
		return builder.toString();
	}
	
}
