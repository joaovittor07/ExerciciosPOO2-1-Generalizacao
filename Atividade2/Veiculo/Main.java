package Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		v.setMotor(true);
		System.out.println(v);
		
		Caminhao c = new Caminhao(true, 1);
		c.setEixos(0);
		System.out.println(c);

		Carro ca = new Carro(true, 1);
		ca.setPortas(0);
		System.out.println(ca);
		
		Moto m = new Moto(true, 1);
		m.setCilindradas(0);
		System.out.println(m);
	}

}
