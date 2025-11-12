package com.javaworld.javachallengers.thread;

public class ThreadChallenge {
    private static int wolverineAdrenaline = 10;

    public static void main(String... doYourBest) {
        Motorcycle m = new Motorcycle("Harley Davidson");
        m.setDaemon(false);
        m.start();

        Motorcycle fastBike = new Motorcycle("Dodge Tomahawk");
        fastBike.setPriority(Thread.MAX_PRIORITY);
        fastBike.setDaemon(false);
        fastBike.start();

        Motorcycle yamaha = new Motorcycle("Yamaha YZF");
        yamaha.setPriority(Thread.MIN_PRIORITY);
        yamaha.setDaemon(false);
        yamaha.start();
    }

    static class Motorcycle extends Thread {
        Motorcycle(String bikeName) { super(bikeName); }

        @Override public void run() {
            wolverineAdrenaline++;
            if (wolverineAdrenaline == 13) {
                System.out.println(this.getName());
            }
        }
    }
}





