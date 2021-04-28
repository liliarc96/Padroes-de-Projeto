package br.com.lilia;

import java.util.Observable;
import java.util.Observer;

public class Par implements Observer {

    private Soma s = Soma.getInstance();

    @Override
    public void update(Observable o, Object arg) {

        if (s.getNum() % 2 == 0) {
            System.out.println(s.getNum() + " é Par");
        }

    }
}