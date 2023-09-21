package Bomba;

public class Gasolina extends Bomba {
	
	public Gasolina(double totalLitro, float valorLitro) {
		super(totalLitro, valorLitro);
	}

	public Gasolina() {
		
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
