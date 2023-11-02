package ua.hillel.lessons.lecture14;

import java.util.Objects;

public class DaysOfWeek {
    public static void main(String[] args) {
        Day day = new Day("MONDAY", -1);
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("Recommendation for " + day + " is:");
        System.out.println(daysOfWeek.giveRecommendation(day));
    }

    public String giveRecommendation(Day day) {
        Day monday = new Day("MONDAY", 1);
        Day sunday = new Day("SUNDAY", 7);
        if (monday.equals(day)) {
            return "Go to work!";
        } else if (sunday.equals(day)) {
            return "Have a rest)";
        }
        return "Unknown day";
    }
}

class Day {
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