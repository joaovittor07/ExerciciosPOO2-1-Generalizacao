package Nave;

public class MillenniumFalcon extends Apolo11 {
	
	private float ClasseHiper;

	public MillenniumFalcon(double veloMax, String tipoComb, float classeHiper) {
		super(veloMax, tipoComb);
		ClasseHiper = classeHiper;
	}

	public float getClasseHiper() {
		return ClasseHiper;
	}

	public void setClasseHiper(float classeHiper) {
		ClasseHiper = classeHiper;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MillenniumFalcon [ClasseHiper=");
		builder.append(ClasseHiper);
		builder.append("]");
		return builder.toString();
	}
	
}
