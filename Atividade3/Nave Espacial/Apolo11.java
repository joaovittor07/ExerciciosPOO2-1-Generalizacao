package Nave;

public class Apolo11 extends NaveEspacial {
	
	private String TipoComb;

	public Apolo11(double veloMax, String tipoComb) {
		super(veloMax);
		TipoComb = tipoComb;
	}
	
	public Apolo11() {
		
	}

	public String getTipoComb() {
		return TipoComb;
	}

	public void setTipoComb(String tipoComb) {
		TipoComb = tipoComb;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [TipoComb=");
		builder.append(TipoComb);
		builder.append("]");
		return builder.toString();
	}

}
