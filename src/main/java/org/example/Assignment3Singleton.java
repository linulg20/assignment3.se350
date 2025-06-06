package org.example;

import java.util.Random;

public class Assignment3Singleton{
    public static void main(String[] args){
        Random r = new Random();
        for(int i=0; i<10 ; i++) {
            EagerSingleton s = EagerSingleton.getInstance(r.nextInt(3));
            System.out.println("Retrieved eager singleton " + s.getNum());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        for(int i=0; i<10; i++) {
            LazySingleton s = LazySingleton.getInstance(r.nextInt(3));
            System.out.println("Retrieved lazy singleton " + s.getNum());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
            }
        }
