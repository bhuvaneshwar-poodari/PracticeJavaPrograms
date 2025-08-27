package com.multiThreading.test;

// First thread class
class Messages extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Messages " + i);
            try {
                Thread.sleep(500); // pause to slow down output
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// Second thread class
class Calls extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Calls " + i);
            try {
                Thread.sleep(500); // pause to slow down output
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class CreatingTheThreads {
    public static void main(String[] args) {
        Messages ms = new Messages();
        Calls cs = new Calls();

        ms.start(); // Start Messages thread
        cs.start(); // Start Calls thread

        try {
            ms.join(); // Wait for Messages to finish
           // Wait for Calls to finish
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ends after Messages and Calls finish.");
    }
}
