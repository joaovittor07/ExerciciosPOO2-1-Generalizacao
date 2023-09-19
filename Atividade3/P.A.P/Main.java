package PAP;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setCodigo(0);
		p.setNome(null);
		p.setEndereco(null);
		System.out.println(p);
		
		Aluno a = new Aluno();
		a.setMatricula(0);
		System.out.println(a);
		
		Professor pf = new Professor();
		pf.setDiciplina(null);
		System.out.println(pf);

	}

}
