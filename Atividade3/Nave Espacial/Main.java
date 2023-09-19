package Nave;

public class Main {

	public static void main(String[] args) {
		
		NaveEspacial n = new NaveEspacial();
		n.setVeloMax(0);
		System.out.println(n);
		
		Apolo11 a = new Apolo11();
		a.setTipoComb(null);
		System.out.println();
		
		MillenniumFalcon m = new MillenniumFalcon(0, null, 0);
		m.setClasseHiper(0);
		System.out.println(m);

	}

}
