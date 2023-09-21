package Bomba;

public class Diesel extends Bomba {
	
	public Diesel(double totalLitro, float valorLitro) {
		super(totalLitro, valorLitro);
	}

	public Diesel() {
		
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
