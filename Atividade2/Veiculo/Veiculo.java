package Veiculo;

public class Veiculo {
	
	private boolean motor;

	public Veiculo(boolean motor) {
		super();
		this.motor = motor;
	}
	
	public Veiculo() {
		
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
		
}
