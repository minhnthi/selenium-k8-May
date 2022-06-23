package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RacingAnimal {

    public static void main(String[] args) {

        AnimalBuilder.Animal animal = new AnimalBuilder.Animal();
        AnimalBuilder eagle = new AnimalBuilder.Animal().setName("Eagle").setWings(true).setSpeed(new SecureRandom().nextInt(200)).animal();
        AnimalBuilder falcon = new AnimalBuilder.Animal().setName("Falcon").setWings(true).setSpeed(new SecureRandom().nextInt(190)).animal();
        AnimalBuilder tiger = new AnimalBuilder.Animal().setName("Tiger").setWings(false).setSpeed(new SecureRandom().nextInt(100)).animal();
        AnimalBuilder horse = new AnimalBuilder.Animal().setName("Horse").setWings(false).setSpeed(new SecureRandom().nextInt(75)).animal();
        AnimalBuilder dog = new AnimalBuilder.Animal().setName("Dog").setWings(false).setSpeed(new SecureRandom().nextInt(40)).animal();

        List<AnimalBuilder> animalBuilderList = new ArrayList<>();
        animalBuilderList.add(tiger);
        animalBuilderList.add(horse);
        animalBuilderList.add(dog);
        animalBuilderList.add(eagle);
        animalBuilderList.add(falcon);


        AnimalBuilder winner = winner(animalBuilderList);
        System.out.println("The winner is " + winner.getName() + " With Speed " + winner.getSpeed());
    }
    public static AnimalBuilder winner(List<AnimalBuilder> animalBuilderList) {
        AnimalBuilder winner = animalBuilderList.get(0);
        int maxSpeed = animalBuilderList.get(0).getSpeed();

        for (AnimalBuilder animalBuilder : animalBuilderList) {
            if (animalBuilder.isWings()) {
                if (animalBuilder.getSpeed() > maxSpeed) {
                    maxSpeed = animalBuilder.getSpeed();
                    winner = animalBuilder;
                }
            }
        }
        return winner;
    }
}
