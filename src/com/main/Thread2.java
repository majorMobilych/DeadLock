package com.main;

public class Thread2 {
    public static void main(String[] args) {
        Knight knight1 = new Knight(100, 100, "ALBERT");
        Knight knight2 = new Knight(10, 10, "MISHA");
        Thread thread1 = new Thread(() -> knight1.attack(knight2));
        Thread thread2 = new Thread(() -> knight2.attack(knight1));
        thread1.start();
        thread2.start();
    }

}