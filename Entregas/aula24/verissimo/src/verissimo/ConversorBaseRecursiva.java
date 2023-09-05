package verissimo;

import java.util.Scanner;

public class ConversorBaseRecursiva {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número decimal: ");
	        int numeroDecimal = scanner.nextInt();
	        
	        System.out.println("Escolha a base de destino:");
	        System.out.println("1. Binário");
	        System.out.println("2. Octal");
	        System.out.println("3. Hexadecimal");
	        int escolha = scanner.nextInt();
	        
	        switch (escolha) {
	            case 1:
	                System.out.println("Resultado (binário): " + decimalParaBinario(numeroDecimal));
	                break;
	            case 2:
	                System.out.println("Resultado (octal): " + decimalParaOctal(numeroDecimal));
	                break;
	            case 3:
	                System.out.println("Resultado (hexadecimal): " + decimalParaHexadecimal(numeroDecimal));
	                break;
	            default:
	                System.out.println("Escolha inválida.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static String decimalParaBinario(int numero) {
	        if (numero == 0) {
	            return "0";
	        } else if (numero == 1) {
	            return "1";
	        } else {
	            return decimalParaBinario(numero / 2) + (numero % 2);
	        }
	    }
	    
	    public static String decimalParaOctal(int numero) {
	        if (numero < 8) {
	            return Integer.toString(numero);
	        } else {
	            return decimalParaOctal(numero / 8) + (numero % 8);
	        }
	    }
	    
	    public static String decimalParaHexadecimal(int numero) {
	        if (numero < 16) {
	            if (numero < 10) {
	                return Integer.toString(numero);
	            } else {
	                return Character.toString((char) ('A' + numero - 10));
	            }
	        } else {
	            int resto = numero % 16;
	            if (resto < 10) {
	                return decimalParaHexadecimal(numero / 16) + Integer.toString(resto);
	            } else {
	                return decimalParaHexadecimal(numero / 16) + (char) ('A' + resto - 10);
	            }
	        }
	    }
}
