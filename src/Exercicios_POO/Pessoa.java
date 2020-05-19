package Exercicios_POO;

public class Pessoa {
	//Atributos
	private String nome, email, telefone;
	
	//Método construtor.
	public Pessoa(String nome, String email, String telefone)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		
	}
	//fim do método construtor
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Fim dos Getters e Setters.
	
	//Outros métodos
	
	public void cartaoVisita()
	{
		System.out.println("Olá eu sou "+getNome()+"\n"+
							"E-mail: "+getEmail()+"\n"+
							"Tel: "+getTelefone());
	}
	
	

}
