package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        Dog puppy = AnimalFactory.createDog("Coco", new Date());
        boolean actual = puppy instanceof Dog;
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat(){
        Cat kitty = AnimalFactory.createCat("Bricks", new Date());
        Assert.assertNotNull(kitty);
    }
}
