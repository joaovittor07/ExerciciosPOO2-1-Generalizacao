package Pessoa;

public class Pessoa {

	private String nome;
	
	private String endereso;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereso() {
		return endereso;
	}

	public void setEndereso(String endereso) {
		this.endereso = endereso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(endereso);
		builder.append("]");
		return builder.toString();
	}
	

}
