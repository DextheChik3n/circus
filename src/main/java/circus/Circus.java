package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("no. of animals in the array = " + animals.length);
//        animals[2] = new Elephant("DumboOne");
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        System.out.println("size of animal array list = " + animalArrayList.size());
        System.out.println("no. of animals in the array = " + animals.length);

        Elephant urmom = new Elephant("Urmom"); //index = 2
        animalArrayList.add(urmom);
        Tiger teeger = new Tiger("Teeger"); //index = 3
        Duck dock = new Duck("Dock"); //index = 4
        Duck quacks = new Duck("Quacks"); //index = 5
        animalArrayList.add(teeger);
        animalArrayList.add(dock);
        animalArrayList.add(quacks);

        System.out.println("size of animal array list = " + animalArrayList.size());

        System.out.println("Before sorting...");
        for (Animal animal : animalArrayList) {
            System.out.println(animal);
        }

        System.out.println("Teeger is at array index = " + animalArrayList.indexOf(teeger));

        animalArrayList.sort(Animal.AnimalNameComparator);
        System.out.println("After sorting...");
        printAllAnimals(animalArrayList);

        /*makeAnimalsTalk();
        System.out.println("Total value of animals " + calculateAssetValue(animals));
        System.out.println("Total value of equipments " + calculateAssetValue(equipments));*/
    }

    public static void printAllAnimals (ArrayList<Animal> arrayList) {
        for (Animal animal : arrayList) {
            System.out.println(animal);
        }
    }
}
