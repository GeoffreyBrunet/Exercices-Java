package com.geoffreybrunet;

public class Main {

    public static void main(String[] args) {
        String name = "letters";
        Runnable runnable = new WaitString(name);

        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
