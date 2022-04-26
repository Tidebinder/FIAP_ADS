package CadastroContaBancaria;

public class ContaBancaria {
    private int agencia;
    private int numero;
    private int saldo;
    
	public ContaBancaria(){
		
	}
	
	public ContaBancaria(int agencia,int numero,int saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
