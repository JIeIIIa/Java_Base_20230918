package ua.hillel.lessons.lecture14;

public class DaysOfWeek {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day wednesday = Day.WEDNESDAY;
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("Recommendation for " + day + " is:");
        System.out.println(daysOfWeek.giveRecommendation(day));
        day.print();

        System.out.println("\n\nEnum values:");
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value.name() + " with ordinal==" + value.ordinal());
        }

        String line = "MONDAY";
        Day anotherDay = Day.valueOf(line);
        System.out.println("ValueOf returns: " + anotherDay);

    }

    String giveRecommendation(Day day) {
        switch (day) {
            case MONDAY:
            case WEDNESDAY:
                return "Go to work!";
            case SUNDAY:
                return "Have a rest)";
            default:
                return "Unexpected recommendation";
        }

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