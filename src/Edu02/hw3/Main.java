package Edu02.hw3;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[1];

        for (int i = 0;i< people.length;i++){
            people[i] = new Person();
            System.out.println("Enter informations about person" + (i+1) + ":");
            people[i].input();
        }

        for (Person person:people
             ) {
                person.output();
            System.out.println(person);
        }

    }



}
