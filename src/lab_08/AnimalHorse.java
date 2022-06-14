package lab_08;

import java.security.SecureRandom;

public class AnimalHorse extends Animal {
    @Override
    public String getAnimalName() {
        return "Horse";
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(75);
    }
}
