package Exercicios_POO;

public class ContaCorrente {
	//Atributos
	private String nome;
	private int agencia, conta;
	private double saldo, valor;
	
	//Método construtor.
	public ContaCorrente(String nome, int agencia, int conta, double saldo, double valor)
	{
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.valor = valor;
					
	}
	//fim do método construtor
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Fim dos Getters e Setters.
	
	//Outros métodos
	public void deposito()
	{
		System.out.print("Seu saldo era: R$"+getSaldo()+ "\n"+
							"Foi depositado: R$"+getValor()+"\n"+
							"Seu saldo atual é: R$"+(getSaldo()+getValor()));
		
	}
	
	public void saque()
	{
		if(getValor() > getSaldo())
		{
			System.out.print("Não pode sacar mais do que o Valor na conta");
		}
		else
		{
			System.out.print("Seu saldo era: R$"+getSaldo()+ "\n"+
							"Seu saldo atual é: R$"+(getSaldo()-getValor()));
		}
	}
	
	

}
