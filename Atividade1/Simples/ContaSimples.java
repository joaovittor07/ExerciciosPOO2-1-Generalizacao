package Simples;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;
	
	private double saldo;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public Boolean deposito(double valor){
    	this.saldo -= valor;
    		return true;
    }
	
    public Boolean saque(double valor) {
    	if(valor < saldo) {
    	this.saldo += valor;	
    		return true;
    	}
    	else {
    		return false;
    	}
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	

    
}
