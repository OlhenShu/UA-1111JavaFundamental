package softserve.javacourse.rachynskyi.edu04.practicaltask.task3;

public enum Continent {
    EUROPE("Europe"),
    ASIA("Asia" ),
    NORTH_AMERICA("North America" ),
    SOUTH_AMERICA("South America"),
    AUSTRALIA("Australia" ),
    AFRICA("Africa" ),
    ANTARCTICA("Antarctica" );

    private final String name;

    public String getName() {
        return name;
    }

    Continent(String name) {
        this.name = name;
    }
}
