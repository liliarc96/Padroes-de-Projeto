package br.com.lilia;

public class Adicao implements Calculadora{
	
	@Override
	public int operacao(int num1, int num2) {
		return num1 + num2;
	}
}
