package Bomba;

public class Etanol extends Bomba {
	
	public Etanol(double totalLitro, float valorLitro) {
		super(totalLitro, valorLitro);
	}

	public Etanol() {
		
	}
	
	@Override
	public boolean abastecerPorValor(double valor) {
        return super.abastecerPorValor(valor);
	}
	
	 @Override
	 public boolean abastecerPorLitro(int litros) {
	     return super.abastecerPorLitro(litros); 
	 }
	 
}
