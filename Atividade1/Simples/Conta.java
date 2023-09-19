package Simples;

public class Conta {

	private String banco;
	
	private int agencia;
	
	private int numeroconta;
	
	private double saldo;
	
	private double deposito;
	
	private double saque;
	
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
    
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", deposito=");
		builder.append(deposito);
		builder.append(", saque=");
		builder.append(saque);
		builder.append("]");
		return builder.toString();
	}

}
