package ua.hillel.lessons.lecture10;

public class PersonRunner {
    public static void main(String[] args) {
//        Person person = new Person("Alice", "Address");
        Person athlete = new Athlete("Bob", "Awesome street");
        runPerson(athlete);
        System.out.println(" >> " + athlete);
    }

    private static void runPerson(Person person) {
        person.run();
    }
}
