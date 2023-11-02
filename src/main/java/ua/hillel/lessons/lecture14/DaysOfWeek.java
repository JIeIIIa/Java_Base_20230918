package ua.hillel.lessons.lecture14;

public class DaysOfWeek {
    public static void main(String[] args) {
        String day = "MondaY";
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("Recommendation for " + null + " is:");
        System.out.println(daysOfWeek.giveRecommendation((String) null));
        System.out.println();
        System.out.println("Recommendation for " + day + " is:");
        System.out.println(daysOfWeek.giveRecommendation(day));
    }

    public String giveRecommendation(String day) {
        if ("Monday".equalsIgnoreCase(day)) {
            return "Go to work!";
        } else if ("Sunday".equalsIgnoreCase(day)) {
            return "Have a rast)";
        }
        return "Unknown day";
    }
}
