package Animal;

public class Reptil extends Animal {
	
	public boolean agressivo;
	
	public String habitate;

	public Reptil(int patas, double peso, double altura, boolean agressivo, String habitate) {
		super(patas, peso, altura);
		this.agressivo = agressivo;
		this.habitate = habitate;
	}
	
	public Reptil() {
		
	}

	public boolean isAgressivo() {
		return agressivo;
	}

	public void setAgressivo(boolean agressivo) {
		this.agressivo = agressivo;
	}

	public String getHabitate() {
		return habitate;
	}

	public void setHabitate(String habitate) {
		this.habitate = habitate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [agressivo=");
		builder.append(agressivo);
		builder.append(", habitate=");
		builder.append(habitate);
		builder.append("]");
		return builder.toString();
	}

}
