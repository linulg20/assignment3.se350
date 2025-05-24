package org.example;
/** i shud make an array size of 3*/
/** keeps the lazysingleton variables*/
public class LazySingleton {
    private static final LazySingleton[] LAZY_SINGLETONS = new LazySingleton[3];
    private final int num;
    /**
     * this constructor is priv so nobody accesses it or changes it
     * prints a msg when the singleton is made
     * @param id is a number to know the singleton intance
     */
    private LazySingleton(int id) {
        this.num = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    /**
     * picks one of the three singletons n if it doesn’t exist, it will make it
     * @param index Which one you want from 0 to 2
     * @return The singleton at that location
     * @throws IllegalArgumentException if its not 0 to 2.
     */
    public static LazySingleton getInstance(int index) {
        if (index < 0 || index >= LAZY_SINGLETONS.length) {
            throw new IllegalArgumentException("Index must be between 0 and 2");
        }
        if (LAZY_SINGLETONS[index] == null) {
            LAZY_SINGLETONS[index] = new LazySingleton(index);
        }
        return LAZY_SINGLETONS[index];
    }
    /**
     * See which one this is.
     * @return The instance’s number
     */
    public int getNum() {
        return num;
    }
}
