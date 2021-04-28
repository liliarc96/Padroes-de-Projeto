package br.com.lilia;

public class Contexto {
	private Calculadora calculadora;
	
	public Contexto(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	
	public int calcular(int num1, int num2) {
		return calculadora.operacao(num1, num2);
	}
}
