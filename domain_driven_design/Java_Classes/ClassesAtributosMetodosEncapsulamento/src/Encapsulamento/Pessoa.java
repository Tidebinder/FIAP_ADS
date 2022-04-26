package Encapsulamento;

public class Pessoa {
	private int id;
	private String nome;
	
	public Pessoa(){
		
	}
	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName(){
		return this.nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}

}
