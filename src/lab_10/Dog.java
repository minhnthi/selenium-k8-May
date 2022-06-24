package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal{

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(60);
    }

    @Override
    public String getName() {
        return "Dog";
    }
}
