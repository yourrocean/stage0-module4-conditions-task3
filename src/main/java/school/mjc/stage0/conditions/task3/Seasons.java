package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String season;
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Wrong number!";
                break;
        }
        System.out.println(season);
    }

    public static void main(String[] args) {
        Seasons seasons = new Seasons();
        seasons.tellTheSeasonByMonthNumber(6);   // Example: Prints "Summer"
        seasons.tellTheSeasonByMonthNumber(13);  // Example: Prints "Wrong number!"
    }
}

