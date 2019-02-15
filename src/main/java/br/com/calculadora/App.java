package br.com.calculadora;

public class App {
	public static void main(String[] args) {

		Operacoes op = new Soma();
		int c = op.operacao(10, 11);

		System.out.println("O resultado é: " + c);
	}
}
