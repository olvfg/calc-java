package br.com.calculadora;

import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	public void testDeveSomarOsNumeros() {
		Operacoes resultadoSoma = new Soma();
		assertEquals(resultadoSoma.operacao(10, 10), 20);
		assertNotEquals(resultadoSoma.operacao(10, 10), 30);
	}

	public void testDeveSubtrairOsNumeros() {
		Operacoes resultadoSubtracao = new Subtracao();
		assertEquals(resultadoSubtracao.operacao(10, 10), 0);
		assertNotEquals(resultadoSubtracao.operacao(10, 15), 0);
	}

	public void testDeveMultiplicarOsNumeros() {
		Operacoes resultadoMultiplicacao = new Multiplicacao();
		assertEquals(resultadoMultiplicacao.operacao(10, 10), 100);
		assertNotEquals(resultadoMultiplicacao.operacao(10, 10), -30);
	}

	public void testDeveDividirOsNumeros() {
		Operacoes resultadoDivisao = new Divisao();
		assertEquals(resultadoDivisao.operacao(10, 10), 1);
		assertNotEquals(resultadoDivisao.operacao(10, 3), 10);
	}

	public void testNaoDeveDividirOsNumeros() {
		Operacoes resultadoDivisao = new Divisao();

		try {
			resultadoDivisao.operacao(1, 0);
		} catch (ArithmeticException ae) {
			assertEquals(ae.getMessage(), "/ by zero");
		}
	}
}
