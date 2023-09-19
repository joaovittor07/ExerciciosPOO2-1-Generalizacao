package PAP;

public class Professor extends Pessoa {
	
	private String Diciplina;

	public String getDiciplina() {
		return Diciplina;
	}

	public void setDiciplina(String diciplina) {
		Diciplina = diciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [Diciplina=");
		builder.append(Diciplina);
		builder.append("]");
		return builder.toString();
	}
	
}
