package Animal;

public class Animal {
	
	private int patas;
	
	private double peso;
	
	private double altura;

	public Animal(int patas, double peso, double altura) {
		this.patas = patas;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Animal() {
		
	}

	public Animal(double altura2, String habitate, boolean pelo) {
		
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [patas=");
		builder.append(patas);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
}
