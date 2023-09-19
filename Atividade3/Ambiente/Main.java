package Ambiente;

public class Main {

	public static void main(String[] args) {
		
		Ambiente a = new Ambiente();
		a.setArea(0);
		System.out.println(a);
		
		Quarto q = new Quarto(50, 1);
		q.setCapacidade(0);
		System.out.println(q);
		
		Sala s = new Sala(50, true);
		s.setTv(false);
		System.out.println(s);
		
		Banheiro b = new Banheiro(50, true);
		b.setBanheira(false);
		System.out.println(b);
		
		Cozinha c = new Cozinha(50, true);
		c.setMicroondas(false);
				
	}

}