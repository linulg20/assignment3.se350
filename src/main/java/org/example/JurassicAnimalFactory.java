package org.example;
import java.util.List;
import java.util.ArrayList;
public class JurassicAnimalFactory implements AnimalAbstractFactory {
    @Override
    public String getEra() {
        return "Jurassic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        List<LandAnimal> landAnimalList = new ArrayList<>();
        landAnimalList.add(new Stegosaurus());
        return landAnimalList;
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        List<SeaAnimal> seaAnimalList = new ArrayList<>();
        seaAnimalList.add(new Plesiosaurus());
        return seaAnimalList;
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        List<SkyAnimal> skyAnimalList = new ArrayList<>();
        skyAnimalList.add(new Pterodactylus());
        return skyAnimalList;
    }
}
