package com.geoffreybrunet;

public class WaitString implements Runnable{

    String name;

    public WaitString(String name) {
        this.name = name;
    }

    @Override
    public void run(){

    }

    protected void IsDivibleBy5(int d,int e) {
        int entierMax, diviseur, nombre;
        boolean divisible;

        for (nombre = d; nombre <= e; nombre = nombre + 1) {
            divisible = false;
            if (nombre < 0) {
                nombre = -nombre;
            }
            diviseur = nombre / 5;
            while (!divisible && (diviseur > 1)) {
                divisible = (nombre % diviseur == 0);
                diviseur--;
            }
        }
    }
}
