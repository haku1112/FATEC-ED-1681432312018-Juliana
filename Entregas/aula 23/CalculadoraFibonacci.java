package verissimo;

public class CalculadoraFibonacci {
	public static void main(String[] args) {
        int termoAnterior = 0, termoAtual = 1;

        System.out.println(termoAtual);

        for (int i = 0; i < 7; i++) {
            int proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
            System.out.println(proximoTermo);
        }
    }
}
