package Edu02.hw3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String secondName;
    private int birthYear;

    public Person(){

    }


    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getAge(){
        int currentYear = 2024;
        return currentYear - this.birthYear;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name;");
        this.firstName = sc.nextLine();
        System.out.println("Enter second name;");
        this.secondName = sc.nextLine();
        System.out.println("Enter birth year;");
        this.birthYear = sc.nextInt();
;    }

    public void output(){
        System.out.println("First name = "+ firstName+":");
        System.out.println("Second name = " + secondName +":");
        System.out.println("Birth day = " + birthYear+":");
        System.out.println("Age = " + getAge());
    }


    public void changeName(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

}
