package org.example;
/**
 * @return the name and the way it transports
 */
public class Whale implements SeaAnimal {
    @Override public String getName()     { return "Whale"; }
    @Override public String getSwimming() { return "swimming"; }
}