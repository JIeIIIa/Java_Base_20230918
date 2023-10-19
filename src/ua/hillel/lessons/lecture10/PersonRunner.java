package ua.hillel.lessons.lecture10;

public class PersonRunner {
    public static void main(String[] args) {
        Person athlete = new Athlete("Bob", "Awesome street");
        runPerson(athlete);
    }

    private static void runPerson(Person athlete) {
        athlete.run();
    }
}
