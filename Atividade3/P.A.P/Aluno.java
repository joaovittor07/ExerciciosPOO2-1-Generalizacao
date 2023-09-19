package PAP;

public class Aluno extends Pessoa {

	private int Matricula;

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [Matricula=");
		builder.append(Matricula);
		builder.append("]");
		return builder.toString();
	}
	
}
