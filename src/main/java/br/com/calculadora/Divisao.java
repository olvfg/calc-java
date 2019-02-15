package br.com.calculadora;

public class Divisao implements Operacoes {

	public int operacao(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Impossível dividir por zero. " + e);
		}
	}
}
