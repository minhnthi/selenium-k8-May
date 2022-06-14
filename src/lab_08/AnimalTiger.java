package lab_08;

import java.security.SecureRandom;

public class AnimalTiger extends Animal {

    @Override
    public String getAnimalName() {
        return "Tiger";
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
