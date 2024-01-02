package edu03.homework;
import java.util.Scanner;
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge() {
        return java.time.Year.now().getValue() - birthYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output(){
        System.out.println("Person info: ");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Bith year: " + birthYear);
        System.out.println("Age: " + getAge() + "years old");
    }
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
    public static void main(String[] args){
        Person[] people = new Person[5];

        int personIndex = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for person №" + (i + 1));
            people[i] = new Person();
            people[i].input();
        }

        System.out.println("Displaying information for all people:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
    }

