package Exercicios_POO;


public class Pessoa2ex {
	//Atributos
		private String nome;
		private int anoNascimento, anoAtual;
		
		
		//Método construtor.
		public Pessoa2ex(String nome, int anoNascimento, int anoAtual)
		{
			this.nome = nome;
			this.anoNascimento = anoNascimento;
			this.anoAtual = anoAtual;
				
		}
		//fim do método construtor
		
		//Getters e Setters

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getAnoNascimento() {
			return anoNascimento;
		}

		public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
		}
		
		public int getAnoAtual() {
			return anoAtual;
		}

		public void setAnoAtual(int anoAtual) {
			this.anoAtual = anoAtual;
		}
		
		
		//Fim dos Getters e Setters.
		
		//Outros métodos
		public void idadeFuturo()
		{
			if(getAnoNascimento()>= getAnoAtual())
			{
				System.out.print("Ano informado incorreto!");
			}
			else
			{
			System.out.println("Olá "+getNome()+"\n"+
					"Ano nascimento: "+getAnoNascimento()+"\n"+
					"Ano Atual: "+getAnoAtual()+"\n"+
					"idade: "+(getAnoAtual()-getAnoNascimento())+" anos"+"\n"+
					"Daqui há 50 anos voce tera: "+(getAnoAtual()-getAnoNascimento()+50)+" anos."+"\n"+
					"E sera o ano: "+(getAnoAtual()+50));
			}
		}
		
		

}
