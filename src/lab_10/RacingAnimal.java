package lab_10;

import java.util.ArrayList;
import java.util.List;

public class RacingAnimal {

    public static Animal winner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        int maxSpeed = animalList.get(0).getSpeed();

        for (Animal animal : animalList) {
            if (animal.getSpeed() > maxSpeed) {
                maxSpeed = maxSpeed + animal.getSpeed();
                winner = animal;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        Animal winner = winner(animalList);
        System.out.println("Winner Is " + winner.getName() + ", With Speed " + winner.getSpeed());
    }
}
