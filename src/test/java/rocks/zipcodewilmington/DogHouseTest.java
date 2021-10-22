package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest(){
        DogHouse.add(AnimalFactory.createDog("Dandy", new Date()));
        Integer dogs = 4;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(dogs, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void RemoveDogIdTest(){
        Dog doggy = AnimalFactory.createDog("Ruffles", new Date());
        Integer dogID = 2;
        Integer actual = DogHouse.getNumberOfDogs();
        DogHouse.remove(doggy);
        Assert.assertEquals(dogID, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest(){
        Dog dogie = AnimalFactory.createDog("Chicky", new Date());
        DogHouse.add(dogie);
        DogHouse.remove(dogie);
        Integer doggID = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(doggID, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        Dog dogy = AnimalFactory.createDog("Handsome", new Date());
        DogHouse.add(dogy);
        Integer expected = 6;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(dogy, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogs(){
        Dog doog = AnimalFactory.createDog("Apple", new Date());
        DogHouse.add(doog);
        Integer expected = 3;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
