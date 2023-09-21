package Bomba;

public class Bomba {
	
	private double totalLitro;
	
	private float valorLitro;

	public Bomba(double totalLitro, float valorLitro) {
		this.totalLitro = totalLitro;
		this.valorLitro = valorLitro;
	}
	
	public Bomba() {
		
	}

	public double getTotalLitro() {
		return totalLitro;
	}

	public void setTotalLitro(double totalLitro) {
		this.totalLitro = totalLitro;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public boolean abastecerPorLitro(int litro) {
		if(litro > 0){
			this.setTotalLitro(this.getTotalLitro() + litro);
			return true;
		}else {
			return false;
		}
	}
	  
	public boolean abastecerPorValor(double valor) {
        if (valor > 0 && this.valorLitro > 0) {
            this.setTotalLitro(this.getTotalLitro() + (valor / this.getValorLitro()));
            return true;
        }else {
	        return false;
	    }
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitro=");
		builder.append(totalLitro);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
}
