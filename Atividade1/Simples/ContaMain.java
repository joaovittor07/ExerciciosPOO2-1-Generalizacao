package Simples;

public class ContaMain {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		c.setBanco("");
		c.setAgencia(0);
		c.setNumeroconta(0);
		c.setSaldo(0);
		System.out.println(c);
		
		ContaSimples cs = new ContaSimples();
		cs.setSaldoPoupanca(0);	
		System.out.println(cs);
		
		ContaEspecial ce = new ContaEspecial();
		ce.setDiasSemJuros(0);
		ce.setLimite(0);
		System.out.println(ce);

	}

}