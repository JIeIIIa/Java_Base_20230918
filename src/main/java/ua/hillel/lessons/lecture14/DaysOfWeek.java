package ua.hillel.lessons.lecture14;

import java.util.Objects;

public class DaysOfWeek {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("Recommendation for " + day + " is:");
        System.out.println(daysOfWeek.giveRecommendation(day));
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

enum Day {
    MONDAY,
    WEDNESDAY,
    SUNDAY;

//    private final String name;
//    private final int order;

//    private Day(String name, int order) {
//        this.name = name;
//        this.order = order;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getOrder() {
//        return order;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Day day = (Day) o;
//        return order == day.order &&
//                ((name == day.name) || (name != null && name.equalsIgnoreCase(day.name)));
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, order);
//    }
//
//    @Override
//    public String toString() {
//        return "Day{" +
//                "name='" + name + '\'' +
//                ", order=" + order +
//                '}';
//    }
}