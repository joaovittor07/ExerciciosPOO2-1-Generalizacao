package Nave;

public class NaveEspacial {

	private double VeloMax;

	public NaveEspacial(double veloMax) {
		super();
		VeloMax = veloMax;
	}
	
	public NaveEspacial() {
		
	}

	public double getVeloMax() {
		return VeloMax;
	}

	public void setVeloMax(double veloMax) {
		VeloMax = veloMax;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveEspacial [VeloMax=");
		builder.append(VeloMax);
		builder.append("]");
		return builder.toString();
	}
	
}
