package org.example;

public class EagerSingleton {

    /** we should make an array of size 3*/
    private static final EagerSingleton[] singleton = new EagerSingleton[3];

    /** when its running it runs once */
    static {
        for (int i = 0; i < singleton.length; i++) { //an array to save every singleton
            singleton[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    /**every singleton var has their own number to differentiate them from one anoher */
    private final int num;

    /** priv constructor so its closed to outside reach*/
    private EagerSingleton(int id) {
        this.num = id;
    }

    /**
     * @param i must be in range between 0-2
     * @return the singleton that was alr created
     */
    public static EagerSingleton getInstance(int i) {
        if (i < 0 || i >= singleton.length) {
            throw new IllegalArgumentException("i should be from 0 to 2");
        }
        return singleton[i];
    }

    /** shows which instance u got in return */
    public int getNum() {
        return num;
    }
}
