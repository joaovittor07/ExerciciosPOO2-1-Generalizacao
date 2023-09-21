package Animal;

public class Lagarto extends Reptil {

	public String especie;

	public Lagarto(int patas, double peso, double altura, boolean agressivo, String habitate, String especie) {
		super(patas, peso, altura, agressivo, habitate);
		this.especie = especie;
	}
	
	public Lagarto() {
		
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
		builder.append("Lagarto [especie=");
		builder.append(especie);
		builder.append("]");
		return builder.toString();
	}
	
}
