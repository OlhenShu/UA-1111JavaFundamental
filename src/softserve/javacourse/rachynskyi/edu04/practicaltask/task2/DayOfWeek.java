package softserve.javacourse.rachynskyi.edu04.practicaltask.task2;

public enum DayOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четверг"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    final String englishName;
    final String ukrainianName;

    DayOfWeek(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public static String getInfoByNumber(int numberOfDay) {
        return switch (numberOfDay) {
            case 1 -> "En: " + MONDAY.englishName + "\n" + "Ua: " + MONDAY.ukrainianName;
            case 2 -> "En: " + TUESDAY.englishName + "\n" + "Ua: " + TUESDAY.ukrainianName;
            case 3 -> "En: " + WEDNESDAY.englishName + "\n" + "Ua: " + WEDNESDAY.ukrainianName;
            case 4 -> "En: " + THURSDAY.englishName + "\n" + "Ua: " + THURSDAY.ukrainianName;
            case 5 -> "En: " + FRIDAY.englishName + "\n" + "Ua: " + FRIDAY.ukrainianName;
            case 6 -> "En: " + SATURDAY.englishName + "\n" + "Ua: " + SATURDAY.ukrainianName;
            case 7 -> "En: " + SUNDAY.englishName + "\n" + "Ua: " + SUNDAY.ukrainianName;
            default -> throw new IllegalArgumentException("There is no such number of day:" + numberOfDay);
        };
    }
}
