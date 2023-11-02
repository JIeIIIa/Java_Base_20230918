package ua.hillel.lessons.lecture14;

import java.util.Objects;

public class DaysOfWeek {
    public static void main(String[] args) {
        Day day = new Day("MONDAY", 1);
//        Day.MONDAY = new Day("monday", -1);
        day = new Day("MONDAY", 1);
        day = new Day("MONDAY", 1);
        day = new Day("MONDAY", 1);
        day = new Day("monday", -1);
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("Recommendation for " + day + " is:");
        System.out.println(daysOfWeek.giveRecommendation(day));
        System.out.println(daysOfWeek.giveRecommendation(Day.MONDAY));
    }

    public String giveRecommendation(Day day) {
        if (Day.MONDAY.equals(day)) {
            return "Go to work!";
        } else if (Day.SUNDAY.equals(day)) {
            return "Have a rest)";
        }
        return "Unknown day";
    }
}

class Day {
    static final Day MONDAY = new Day("MONDAY", 1);
    static final Day SUNDAY = new Day("SUNDAY", 7);

    private final String name;
    private final int order;

    public Day(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Day day = (Day) o;
        return order == day.order &&
                ((name == day.name) || (name != null && name.equalsIgnoreCase(day.name)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, order);
    }

    @Override
    public String toString() {
        return "Day{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}