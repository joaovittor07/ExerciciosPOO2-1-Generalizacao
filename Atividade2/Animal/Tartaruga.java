package Animal;

public class Tartaruga extends Reptil {
	
	private String especie;

	public Tartaruga(int patas, double peso, double altura, boolean agressivo, String habitate, String especie) {
		super(patas, peso, altura, agressivo, habitate);
		this.especie = especie;
	}
	
	public Tartaruga() {
		
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [especie=");
		builder.append(especie);
		builder.append("]");
		return builder.toString();
	}
	
}
