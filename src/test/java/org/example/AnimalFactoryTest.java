package org.example;

import org.junit.jupiter.api.Test;

/**
 *made another test for the 3 animals we added for sea , land  and the sky to see if
 * the output is the desired output, it is the same syntax and code of the main method
 * provided in the assignment
 */
public class AnimalFactoryTest {

    @Test
    public void demoJurassicOutput() {
        AnimalEraAbstractFactory f = new AnimalFactory();
        System.out.println("You are in the " + f.getEra() + " exhibition");
        System.out.println("===== " + f.getEra() + " land animals section =====");
        f.createLandAnimals().forEach(a ->
                System.out.println("A " + a.getName() + " " + a.getWalking()));
        System.out.println("===== " + f.getEra() + " sea animals section =====");
        f.createSeaAnimals().forEach(a ->
                System.out.println("A " + a.getName() + " " + a.getSwimming()));
        System.out.println("===== " + f.getEra() + " sky animals section =====");
        f.createSkyAnimals().forEach(a ->
                System.out.println("A " + a.getName() + " " + a.getFlying()));
        System.out.println("Thank you for visiting the " + f.getEra() + " exhibition");
    }
}