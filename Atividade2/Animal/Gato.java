package Animal;

public class Gato extends Mamifero {
	
	private String pedigree;
	
	private boolean adotado;

	public Gato(int patas, double peso, double altura, String habitate, boolean pelo, String pedigree,
			boolean adotado) {
		super(patas, peso, altura, habitate, pelo);
		this.pedigree = pedigree;
		this.adotado = adotado;
	}
	
	public Gato() {
		
	}

	public String getPedigree() {
		return pedigree;
	}

	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}

	public boolean isAdotado() {
		return adotado;
	}

	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [pedigree=");
		builder.append(pedigree);
		builder.append(", adotado=");
		builder.append(adotado);
		builder.append("]");
		return builder.toString();
	}
	
}
