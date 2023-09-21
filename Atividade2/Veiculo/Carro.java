package Veiculo;

public class Carro extends Veiculo{

	private int portas;

	public Carro(boolean motor, int portas) {
		super(motor);
		this.portas = portas;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [portas=");
		builder.append(portas);
		builder.append("]");
		return builder.toString();
	}
	
}
