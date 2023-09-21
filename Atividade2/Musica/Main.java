package Musica;

public class Main {

	public static void main(String[] args) {
		
		Piano p = new Piano();
		System.out.println(p.toString());
		
		Violao v = new Violao();
		System.out.println(v.toString());
		
		Trompete t = new Trompete();
		System.out.println(t.toString());
		
		Tuba tub = new Tuba();
		System.out.println(tub.toString());
		
		Prato pr = new Prato();
		System.out.println(pr.toString());
		
		Tambor tamb = new Tambor();
		System.out.println(tamb.toString());

		Saxofone s = new Saxofone();
		System.out.println(s.toString());
		
		Fagote f = new Fagote();
		System.out.println(f.toString());
		
	}

}
