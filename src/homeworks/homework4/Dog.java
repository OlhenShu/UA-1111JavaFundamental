package homeworks.homework4;

import java.util.Objects;

public class Dog {
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

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog pirate = new Dog("Pirate", Breed.GERMAN_SHEPHERD, 6);
        Dog bublyk = new Dog("Bublyk", Breed.BEAGLE, 2);
        Dog pushynka = new Dog("Pushynka", Breed.POMERANIAN, 8);

        System.out.println(pirate);
        System.out.println(bublyk);
        System.out.println(pushynka);

        if (pirate.getName().equals(bublyk.getName()) || pirate.getName().equals(pushynka.getName()) || bublyk.getName().equals(pushynka.getName())) {
            System.out.println("There are two dogs with the same name!");
        } else {
            System.out.println("There are no dogs with the same name.");
        }

        int maxAge = pirate.getAge();
        if (bublyk.getAge() > pirate.getAge()) {
            maxAge = bublyk.getAge();
        }
        if (pushynka.getAge() > bublyk.getAge()) {
            maxAge = pushynka.getAge();
        }
        System.out.println("The oldest dog with the age of " + maxAge + " years is:");
        if (pirate.getAge() == maxAge) {
            System.out.println("Name: " + pirate.getName() + ", Breed: " + pirate.getBreed());
        }

        if (bublyk.getAge() == maxAge) {
            System.out.println("Name: " + bublyk.getName() + ", Breed: " + bublyk.getBreed());
        }

        if (pushynka.getAge() == maxAge) {
            System.out.println("Name: " + pushynka.getName() + ", Breed: " + pushynka.getBreed());
        }
    }
}

enum Breed {
    GERMAN_SHEPHERD, BEAGLE, POODLE, CHIHUAHUA, POMERANIAN
}

