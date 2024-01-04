package edu04.homework;
import java.util.Scanner;

enum Season {
    WINTER("winter", "Winter exams"),
    SPRING("spring", "Second semester"),
    SUMMER("summer", "Vacation period"),
    AUTUMN("autumn", "First semester");

    private final String seasonName;
    private final String academicPeriod;

    Season(String seasonName, String academicPeriod) {
        this.seasonName = seasonName;
        this.academicPeriod = academicPeriod;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getAcademicPeriod() {
        return academicPeriod;
    }
}

class Faculty {
    private Season currentSeason;

    public Faculty(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void info() {
        System.out.println("Current season: " + currentSeason.getSeasonName());
        System.out.println("Academic period: " + currentSeason.getAcademicPeriod());
    }
}

public class FacultyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the current season:");
        for (Season season : Season.values()) {
            System.out.println(season.getSeasonName());
        }

        System.out.print("Enter the current season: ");
        String seasonInput = scanner.next().toLowerCase();
        Season selectedSeason = null;

        for (Season season : Season.values()) {
            if (season.getSeasonName().equals(seasonInput)) {
                selectedSeason = season;
                break;
            }
        }

        if (selectedSeason != null) {
            Faculty faculty = new Faculty(selectedSeason);
            faculty.info();
        } else {
            System.out.println("Incorrect season choice.");
        }
    }
}