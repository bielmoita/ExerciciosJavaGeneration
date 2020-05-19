package Exercicios_POO;

import java.util.Scanner;

public class Ex2Pessoa {

	public static void main(String[] args) {
		/*
		 * 2-Criar uma classe Pessoa com os seguintes atributos: nome e ano de nascimento. 
		 * Implemente os seguintes métodos:  Método para calcular a idade da pessoa.
		  Método para calcular a idade da pessoa daqui 50 anos.
		 */
		String nome;
		int anoNascimento, anoAtual;
		
		
		//Instanciando a classe Pessoa
		Pessoa2ex idadepessoa = new Pessoa2ex("",0,0);
		
		//Classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Recebendo a digitação do usuario.
		System.out.print("Informe seu Nome: ");
		nome = entrada.nextLine();
		idadepessoa.setNome(nome);
		
		System.out.print("informe seu ano de nascimento: ");
		anoNascimento = entrada.nextInt();
		idadepessoa.setAnoNascimento(anoNascimento);
		
		System.out.print("Informe a data atual: ");
		anoAtual = entrada.nextInt();
		idadepessoa.setAnoAtual(anoAtual);
		
		
		//Mostrando a Idade do futuro
		idadepessoa.idadeFuturo();

	}

}
