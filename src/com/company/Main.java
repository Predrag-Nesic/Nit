package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Nit.ispisiBrojac();
        Nit.ispisiBrojac();
        Nit.ispisiBrojac();

        Nit[] niti = new Nit[1000];

        for(int i = 0; i < niti.length; i++) {
            niti[i] = new Nit();

        }

        for(int i = 0; i < niti.length; i++) {
            niti[i].join();

        }
        Nit.ispisiBrojac();
    }
}