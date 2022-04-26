package CadastroContaBancaria;

public class Cliente {
	
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta_bancaria;
	
	Cliente() {
		
	}
	
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta_bancaria) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta_bancaria = conta_bancaria;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setContaBancaria(ContaBancaria conta_bancaria) {
		this.conta_bancaria = conta_bancaria;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public ContaBancaria getContaBancaria() {
		return this.conta_bancaria;
	}
}
