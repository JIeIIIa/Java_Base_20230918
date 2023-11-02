package ua.hillel.lessons.lecture14;

import java.util.Objects;

public class DaysOfWeek {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("Recommendation for " + day + " is:");
        System.out.println(daysOfWeek.giveRecommendation(day));
        day.print();
    }

    String giveRecommendation(Day day) {
        if (Day.MONDAY.equals(day) || Day.WEDNESDAY == day) {
            return "Go to work!";
        } else if (Day.SUNDAY.equals(day)) {
            return "Have a rest)";
        }
        return "Unexpected recommendation";
    }
}

interface PrettyPrint {
    void print();
}
enum Day implements PrettyPrint {
    MONDAY("Monday", 1),
    WEDNESDAY("Wednesday", 3),
    SUNDAY("Sunday", 7, "weekend") {
        @Override
        public void print() {
            System.out.println("Custom print: " + this);
        }
    };

    private final String name;
    private final int order;
    private String prefix = "default prefix";

    Day(String name, int order) {
        this.name = name;
        this.order = order;
    }

    Day(String name, int order, String prefix) {
        this.name = name;
        this.order = order;
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }



    @Override
    public String toString() {
        return "Day{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Default pretty print: " + this);
    }
}