package Exercicios_POO;

public class Pessoa {
	//Atributos
	private String nome, email, telefone;
	
	//M�todo construtor.
	public Pessoa(String nome, String email, String telefone)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		
	}
	//fim do m�todo construtor
	
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
	
	//Outros m�todos
	
	public void cartaoVisita()
	{
		System.out.println("Ol� eu sou "+getNome()+"\n"+
							"E-mail: "+getEmail()+"\n"+
							"Tel: "+getTelefone());
	}
	
	

}
