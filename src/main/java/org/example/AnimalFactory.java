package org.example;
import java.util.List;
import java.util.ArrayList;
public class AnimalFactory implements AnimalEraAbstractFactory {
    @Override
    public String getEra() {
        return "Jurassic";
    }
    /**
     * @return the list of the animals on the land
     */
    @Override
    public List<LandAnimal> createLandAnimals() {
        List<LandAnimal> landAnimals = new ArrayList<>();
        landAnimals.add(new Trex());
        return landAnimals;
    }
    /**
     * @return the list of the animals on the sky
     */
    @Override
    public List<SkyAnimal> createSkyAnimals() {
        List<SkyAnimal> skyAnimals = new ArrayList<>();
        skyAnimals.add(new Pterodactylus());
        return skyAnimals;
    }
    /**
     * @return the list of the animals on the sky
     */
    @Override
    public List<SeaAnimal> createSeaAnimals() {
        List<SeaAnimal> seaAnimals = new ArrayList<>();
        seaAnimals.add(new Plesiosaurus());
        return seaAnimals;
    }
}
