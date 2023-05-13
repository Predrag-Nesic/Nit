package com.company;

public class Nit extends Thread {
    private static int brojac;

    public Nit() {
        start();
    }

    @Override
    public void run() {
        uvecaj();
    }

    public synchronized void uvecaj() {
        brojac++;
    }

    public synchronized static void ispisiBrojac() {
        System.out.println(brojac);
    }

}
