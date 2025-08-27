package com.practice.test;

//Thread to simulate sending messages
class SendMessage extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("📤 Sending message " + i);
         try {
             Thread.sleep(1000); // Simulate delay in sending
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

//Thread to simulate receiving messages
class ReceiveMessage extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("📩 Receiving message " + i);
         try {
             Thread.sleep(1500); // Simulate delay in receiving
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

public class ChatAppSimulation {
 public static void main(String[] args) {
     SendMessage sendThread = new SendMessage();
     ReceiveMessage receiveThread = new ReceiveMessage();

     // Start both threads
     sendThread.start();
     receiveThread.start();
 }
}

