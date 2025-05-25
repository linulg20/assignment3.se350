package org.example;
import java.util.ArrayList;
import java.util.List;
public class CenozoicAnimalFactory implements AnimalEraAbstractFactory {
    @Override
    public String getEra() {
        return "Cenozoic";
    }
    /**
     * @return the list of the animals on the land
     */
    @Override
    public List<LandAnimal> createLandAnimals() {
        List<LandAnimal> landAnimals = new ArrayList<>();
        landAnimals.add(new Rhino());
        landAnimals.add(new CaveLion());
        landAnimals.add(new Mammoth());

        return landAnimals;
    }
    /**
     * @return the list of the animals in the sky
     */
    @Override
    public List<SkyAnimal> createSkyAnimals() {
        List<SkyAnimal> skyAnimals = new ArrayList<>();
        skyAnimals.add(new Argentavis());
        return skyAnimals;
    }
    /**
     * @return the list of the animals of the sea
     */
    @Override
    public List<SeaAnimal> createSeaAnimals() {
        List<SeaAnimal> seaAnimals = new ArrayList<>();
        seaAnimals.add(new Whale());
        seaAnimals.add(new Otodus());
        return seaAnimals;
    }

}