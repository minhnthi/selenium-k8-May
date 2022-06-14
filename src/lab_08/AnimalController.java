package lab_08;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public static void main(String[] args) {

        Animal horse = new AnimalHorse();
        Animal tiger = new AnimalTiger();
        Animal dog = new AnimalDog();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        Animal winner = winner(animalList);
        System.out.println("Winner Is " + winner.getAnimalName() + ", With Speed " + winner.getSpeed());
    }
    public static Animal winner(List<Animal> animalList){

        Animal winner = animalList.get(0);
        int maxSpeed = animalList.get(0).getSpeed();

        for (Animal animal : animalList) {
            if (animal.getSpeed() >maxSpeed){
                maxSpeed = animal.getSpeed();
                winner = animal;
            }
        }
        return  winner;
    }

}
