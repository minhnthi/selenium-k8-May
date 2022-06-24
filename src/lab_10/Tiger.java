package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal{

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);
    }

    @Override
    public String getName() {
        return "Tiger";
    }
}
