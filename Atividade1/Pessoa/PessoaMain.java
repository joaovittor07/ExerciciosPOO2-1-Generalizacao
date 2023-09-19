package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("João");
		p.setEndereso("XV de Novembro");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica();
		pf.setCpf("000.000.000-00");
		pf.setEstadoCivil("Solteiro");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setCnpj("00.000.000/0000-00");
		pj.setTipoEmpresa("Empresa Individual");
		System.out.println(pj);
		
	}
	
}