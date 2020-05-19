package Exercicios_POO;

import java.util.Scanner;

public class Ex1Pessoa {
	
	/*
	 * Enunciado
	 * 1-Criar uma classe Pessoa com os seguintes atributos: nome, e-mail e telefone. 
	 * Implementar o m�todo para imprimir o cart�o de visitas tal como o exemplo abaixo:
	  Maria dos Santos
	  maria@gmail.com
	  telefone: 2255-9999

	 */

	public static void main(String[] args) {
		String nome;
		String email;
		String telefone;
		
		//Instanciando a classe Pessoa
		Pessoa cartaopessoa = new Pessoa("","","");
		
		//Classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Recebendo a digita��o do usuario.
		System.out.print("Informe seu Nome: ");
		nome = entrada.nextLine();
		cartaopessoa.setNome(nome);
		
		System.out.print("Informe seu E-mail: ");
		email = entrada.nextLine();
		cartaopessoa.setEmail(email);
		
		System.out.print("Informe seu Telefone: ");
		telefone = entrada.nextLine();
		cartaopessoa.setTelefone(telefone);
		
		
		//Mostrando o Cart�o de visita
		cartaopessoa.cartaoVisita();
		
		
		

	}

}
