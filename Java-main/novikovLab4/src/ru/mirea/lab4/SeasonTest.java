package ru.mirea.lab4;

public class SeasonTest {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Favorite season: " + favoriteSeason);
        System.out.println("Average temperature: " + favoriteSeason.getAverageTemperature());
        System.out.println("Description: " + favoriteSeason.getInfo());
        System.out.println();

        Season.printSeasonInfo(Season.SUMMER);

        Season.getDescription(Season.WINTER);
        Season.getDescription(Season.SPRING);
        Season.getDescription(Season.SUMMER);
        Season.getDescription(Season.AUTUMN);

        for (Season season : Season.values()) {
            System.out.println("Season: " + season);
            System.out.println("Average temperature: " + season.getAverageTemperature());
            System.out.println("Description: " + season.getInfo());
            System.out.println();
        }
    }
}
