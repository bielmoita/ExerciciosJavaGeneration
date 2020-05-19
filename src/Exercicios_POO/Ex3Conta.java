package Exercicios_POO;

import java.util.Scanner;

public class Ex3Conta {

	public static void main(String[] args) {
		
		String nome;
		int agencia, conta;
		double saldo=0, valor=0;
		
		//Instanciando a classe Pessoa
		ContaCorrente contabanco = new ContaCorrente("",0,0,0,0);
		
		//Classe Scanner
		Scanner entrada = new Scanner(System.in);
				
		//Recebendo a digitação do usuario.
		System.out.print("Informe seu Nome: ");
		nome = entrada.nextLine();
		contabanco.setNome(nome);
			
		System.out.print("informe sua agencia: ");
		agencia = entrada.nextInt();
		contabanco.setAgencia(agencia);
				
		System.out.print("Informe sua conta: ");
		conta = entrada.nextInt();
		contabanco.setConta(conta);
		

		//Métodos
		System.out.println("O que deseja Fazer?");
		System.out.print("Deposite seu valor: R$");
		valor = entrada.nextDouble();
		contabanco.setValor(valor);
		
		saldo = saldo+valor;
		contabanco.setSaldo(saldo);
		
		System.out.println("Seu saldo é: "+contabanco.getSaldo());
		
		//Ações do Banco
		contabanco.deposito();
		contabanco.saque();

	}

}
