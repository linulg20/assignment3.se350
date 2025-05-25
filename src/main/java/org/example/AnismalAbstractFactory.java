package org.example;
import java.util.List;
/** making the land , sea and sky environtments for the animal species
 * that we are going to classify the animals into */
public interface AnimalAbstractFactory {
    String getEra();
    List<LandAnimal> createLandAnimals();
    List<SeaAnimal>  createSeaAnimals();
    List<SkyAnimal>  createSkyAnimals();
}
