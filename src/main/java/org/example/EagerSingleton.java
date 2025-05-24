package org.example;

public class EagerSingleton {

    private static final EagerSingleton[] instance = new EagerSingleton[3];

    static {
        for (int i = 0; i < instance.length; i++) {
            instance[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " example");
        }
    }


    public static EagerSingleton getInstance(int index) {
        if (index < 0 || index >= instance.length) {
            throw new IllegalArgumentException("number must be from 0 and 2");
        }
        return instance[index];
    }

