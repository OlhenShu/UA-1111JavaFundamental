package edu04.homework;
import java.util.Scanner;

enum Breed {
    YORK,
    MOPS,
    SHPITS,
    CHAU_CHAU,
    TAKSA
}

class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

public class DogFinder {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Musya", Breed.SHPITS, 13);
        Dog dog2 = new Dog("Bivis", Breed.YORK, 9);
        Dog dog3 = new Dog("Nick", Breed.CHAU_CHAU, 6);

        if (!areSameName(dog1, dog2, dog3)) {
            System.out.println("There are dogs here with the same name ");
        } else {
            System.out.println("There are no dogs with the same name ");
        }

        Dog oldestDog = findOldestDog(dog1, dog2, dog3);
        if (oldestDog != null) {
            System.out.println("Oldest dog: " + oldestDog.getName() + ". Breed: " + oldestDog.getBreed());
        } else {
            System.out.print("No dogs. ");
        }
    }

    private static boolean areSameName(Dog dog1, Dog dog2, Dog dog3) {
        return !(dog1.getName().equals(dog2.getName()) ||
                dog1.getName().equals(dog3.getName()) ||
                dog2.getName().equals(dog3.getName()));
    }

    private static Dog findOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }

        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        return oldestDog;
    }
}
