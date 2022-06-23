package lab_09;

public class AnimalBuilder {

    private boolean wings;
    private int speed;
    private String name;

    protected AnimalBuilder(Animal animal) {
        this.speed = animal.speed;
        this.wings = animal.wings;
        this.name = animal.name;
    }

    public boolean isWings() {
        return wings;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "AnimalBuilder{" +
                "wings=" + wings +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
    public static class Animal {
        private boolean wings;
        private int speed;

        private  String name;

        public Animal setWings(boolean wings) {
            this.wings = wings;
            return this;
        }

        public Animal setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Animal setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder animal() {

            return new AnimalBuilder(this);
        }
    }
}
