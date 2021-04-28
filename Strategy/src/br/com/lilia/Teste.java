package br.com.lilia;

public class Teste {

	public static void main(String[] args) {
	      Contexto contexto = new Contexto(new Adicao());		
	      System.out.println("10 + 5 = " + contexto.calcular(10, 5));

	      contexto = new Contexto(new Subtracao());		
	      System.out.println("10 - 5 = " + contexto.calcular(10, 5));
	}

}
