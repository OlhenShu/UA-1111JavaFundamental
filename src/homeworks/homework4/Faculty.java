package homeworks.homework4;

import java.time.LocalDate;
import java.util.Scanner;

public class Faculty {

    private String facultyName;
    private int numberOfStudents;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of students:");
        int numberOfStudents = sc.nextInt();
        Faculty economics = new Faculty("Economics");
        economics.setNumberOfStudents(numberOfStudents);
        System.out.println(economics);

        Season currentSemester = Season.getCurrentSemester();
        System.out.println("Current semester is: " + currentSemester.semester);
    }
}

enum Season {
    WINTER("Winter", "Winter exams"),
    SPRING("Spring", "Second semester"),
    SUMMER("Summer", "Vacation period"),
    AUTUMN("Autumn", "First semester");

    public final String seasonName;
    public final String semester;

    Season(String seasonName, String semester) {
        this.seasonName = seasonName;
        this.semester = semester;
    }
    public static Season getCurrentSemester() {
        int month = LocalDate.now().getMonthValue();
        return switch (month) {
            case 1, 2, 12 -> WINTER;
            case 3, 4, 5 -> SPRING;
            case 6, 7, 8 -> SUMMER;
            case 9, 10, 11 -> AUTUMN;
            default -> throw new IllegalArgumentException("There is no such month: " + month);
        };
    }
}

