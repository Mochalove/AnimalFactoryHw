package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest(){
        Dog dogie = new Dog("Goldie", new Date(), 3);
        Boolean actual = dogie instanceof Dog;
        Assert.assertEquals(dogie, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Dog doggie = new Dog("Oxxy", new Date(), 2000);
        String actual = doggie.speak();
        String expected = "bark!";
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        Dog dggy = AnimalFactory.createDog("Chili-Dog", new Date (12-12-2012));
        Date expected = new Date(12-12-2012);
        Date actual = dggy.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Food food = new Food();
        Dog dogy = new Dog("Cheese-Dog", new Date(), 1113);
        dogy.eat(food);
        Integer actual = dogy.getNumberOfMealsEaten();
        Integer expected = 7;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Dog dg = new Dog("Buckles", new Date(), 877);
        Integer expected = 5;
        Integer actual = dg.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog("Floorsey", new Date(), 350);
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        Dog doog = new Dog("Wallie", new Date(), 47);
        Assert.assertTrue(doog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
