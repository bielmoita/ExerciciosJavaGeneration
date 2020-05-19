package Exercicios_POO;

import java.util.Scanner;

public class Ex1Pessoa {
	
	/*
	 * Enunciado
	 * 1-Criar uma classe Pessoa com os seguintes atributos: nome, e-mail e telefone. 
	 * Implementar o método para imprimir o cartão de visitas tal como o exemplo abaixo:
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
		
		//Recebendo a digitação do usuario.
		System.out.print("Informe seu Nome: ");
		nome = entrada.nextLine();
		cartaopessoa.setNome(nome);
		
		System.out.print("Informe seu E-mail: ");
		email = entrada.nextLine();
		cartaopessoa.setEmail(email);
		
		System.out.print("Informe seu Telefone: ");
		telefone = entrada.nextLine();
		cartaopessoa.setTelefone(telefone);
		
		
		//Mostrando o Cartão de visita
		cartaopessoa.cartaoVisita();
		
		
		

	}

}
