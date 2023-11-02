package ua.hillel.lessons.lecture14;

public class DaysOfWeek {
    public static void main(String[] args) {
        int day = -1;
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("Recommendation for " + day + " is:");
        System.out.println(daysOfWeek.giveRecommendation(day));
    }

    public String giveRecommendation(int day) {
        if (1 == day) {
            return "Go to work!";
        } else if (7 == day) {
            return "Have a rest)";
        }
        return "Unknown day";
    }
}
