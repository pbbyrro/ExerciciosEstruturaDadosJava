package exerciciosEstruturaDados;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
 * para organizar a ordem de chegada dos Clientes de um Banco
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente
 * 2: Listar todos os Clientes na fila
 * 3: Chamar (retirar) uma pessoa da fila 
 * 0: O programa deve ser finalizado. 
 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..
 */

public class ExercicioEstruturaDados1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		
		while (true) {
			System.out.println("--- Menu ---");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar Todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha uma opção entre 1 e 4: ");
			int opcao = ler.nextInt();
			ler.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome da pessoa para adicionar ela na fila: ");
				String nome = ler.nextLine();
				fila.offer(nome);
				System.out.println(nome + " foi adicionado na fila.");
				break;
			case 2:
				if(!fila.isEmpty()) {
					System.out.println("Clientes na fila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				} else {
					System.out.println("Não há ninguém na fila.");
				}
				break;
			case 3:
				if(!fila.isEmpty()) {
					String pessoaAtendida = fila.poll();
					System.out.println("Atendendo " + pessoaAtendida);
				} else {
					System.out.println("Não há ninguém na fila.");
				}
				break;
			case 0:
				System.out.println("Encerrando programa...");
				ler.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida!");
			}
			
			System.out.flush();
		}

	}

}
