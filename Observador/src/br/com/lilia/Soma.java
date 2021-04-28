package br.com.lilia;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Soma extends Observable implements Runnable {

    private int num;
    public static Soma instance = null;

    private Soma() {
        num = 0;
    }

    public static Soma getInstance() {
        if (instance == null) {
            instance = new Soma();
            Thread t1 = new Thread(instance);
            t1.start();
        }
        return instance;
    }

    public void setNum() {
        num++;
        setChanged(); // marca esse objeto observável como alterado  
        notifyObservers(); // notifica todos os observadores que esse objeto foi alterado
    }

    public int getNum() {
        return num;
    }

    private void somar() {

        while (true) {
            setNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Soma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void run() {
        somar();
    }
}