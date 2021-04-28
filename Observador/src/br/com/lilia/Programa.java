package br.com.lilia;

public class Programa {
    public static void main(String[] args) {
        Soma s = Soma.getInstance();

        Par par = new Par();
        Impar impar = new Impar();

        s.addObserver(par);
        s.addObserver(impar);       
    }
}