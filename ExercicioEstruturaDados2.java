package exerciciosEstruturaDados;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Stack;

public class ExercicioEstruturaDados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		
		while (true) {
			System.out.println("Menu");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar um livro da pilha");
			System.out.println("0 - Sair");
			
			int escolha = ler.nextInt();
			ler.nextLine();
			
			switch(escolha) {
			case 1:
				System.out.println("Digite o nome do livro para adicioná-lo na pilha: ");
				String livro = ler.nextLine();
				livros.push(livro);
				System.out.println("O livro " + livro + " foi adicionado na pilha.");
				break;
			case 2:
				Iterator<String> iterator = livros.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
			}
				break;
			case 3:
				if(!livros.isEmpty()) {
					livros.pop();
					System.out.println("O último elemento da pilha foi retirado.");
				} else {
					System.out.println("Não há nenhum livro na pilha.");
				}
				break;
			case 0:
				System.out.println("Programa encerrando...");
				ler.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}
