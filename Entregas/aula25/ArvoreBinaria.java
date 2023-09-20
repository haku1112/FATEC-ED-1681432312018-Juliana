package binaria;

import java.util.Scanner;

public class ArvoreBinaria {
	private No raiz;

	private No inserir(No raiz, Integer numero) {
		if (raiz == null) {
			raiz = new No(numero);
			
		} else {
			if (numero < raiz.numero) {
				raiz.esquerda = inserir(raiz.esquerda, numero);
			} else if (numero > raiz.numero) {
				raiz.direita = inserir(raiz.direita, numero);
			}
		}
		return raiz;
	}

	private void mostrar(No raiz) {
		if (raiz != null) {
			mostrar(raiz.esquerda);
			System.out.print(raiz.numero + " ");
			mostrar(raiz.direita);
		}
	}

	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira os valores na árvore (digite 'sair' para encerrar):");

		while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            Integer valor = Integer.parseInt(entrada);
            arvore.raiz = arvore.inserir(arvore.raiz, valor);
        }

        System.out.println("Sequência:");
        arvore.mostrar(arvore.raiz);

        scanner.close();
    }
}