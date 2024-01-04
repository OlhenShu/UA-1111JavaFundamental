package softserve.javacourse.rachynskyi.homework3.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonData {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.birthYear = 2000;
        Person person2 = new Person("Darth", "Vader");
        Person person3 = new Person();
        person3.changeName("Luke", "Skywalker");
        Person person4 = new Person();
        person4.input();
        person4.birthYear = 1998;
        Person person5 = new Person("Obi-Wan", "Kenobi");

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }

    @Data
    @AllArgsConstructor
    public static class Person {
        Scanner scanner = new Scanner(System.in);
        private String firstName;
        private String lastName;
        private int birthYear;

        public Person() {

        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getAge() {
            if (this.birthYear < 1) {
                return "unknown";
            }
            int curYear = LocalDate.now().getYear();
            return String.valueOf(curYear - birthYear);
        }

        public void changeName(String fn, String ln) {
            this.firstName = fn;
            this.lastName = ln;
        }

        public void input() {
            System.out.println("Enter first name:");
            this.firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            this.lastName = scanner.nextLine();
        }

        public void output() {
            System.out.println("First name is " + firstName + "\n"
                    + "Last name is " + lastName + "\n"
                    + "Age is " + this.getAge());
        }
    }
}
