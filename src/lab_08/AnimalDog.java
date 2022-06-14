package lab_08;

import java.security.SecureRandom;

public class AnimalDog extends Animal{

    @Override
    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(60);
    }
}
