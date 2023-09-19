package Ambiente;

public class Cozinha extends Ambiente {
	
	private boolean Microondas;

	public Cozinha(float area, boolean Microondas) {
		super(area);
			this.Microondas = Microondas;
	}
	
	public boolean isMicroondas() {
		return Microondas;
	}

	public void setMicroondas(boolean microondas) {
		Microondas = microondas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cozinha [Microondas=");
		builder.append(Microondas);
		builder.append("]");
		return builder.toString();
	}
	
}
