package org.example;
public class LazySingleton {
    private static final LazySingleton[] singleton = new LazySingleton[3];


    private LazySingleton(int i) {
        this.num = i;
        System.out.println("created lazy singleton number" + i);
    }
    public static LazySingleton getInstance(int i) {
        if (i < 0 || i >= singleton.length) {
            throw new IllegalArgumentException("Index must be between 0 and 2");
        }
        if (singleton[i] == null) {
            singleton[i] = new LazySingleton(i);
        }
    public int getNum() {
        return num;
    }
}
