package Animal;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.setPatas(0);
		a.setPeso(0);
		a.setAltura(0);
		System.out.println(a);
		
		Mamifero m = new Mamifero();
		m.setHabitate(null);
		m.setPelo(false);
		System.out.println(m);
		
		Cao c = new Cao();
		c.setAdotado(false);
		c.setPedigree(null);
		System.out.println(c);
		
		Gato g = new Gato();
		g.setAdotado(false);
		g.setPedigree(null);
		System.out.println(g);
		
		Reptil r = new Reptil();
		r.setAgressivo(false);
		System.out.println(r);
		
		Lagarto l = new Lagarto();
		l.setEspecie(null);
		System.out.println(l);
		
		Tartaruga t = new Tartaruga();
		t.setEspecie(null);
		System.out.println(t);
		
	}
}
