package ua.hillel.lessons.lecture10;

public class PersonRunner {
    public static void main(String[] args) {
//        Person person = new Person("Alice", "Address");
        Athlete athlete = new Athlete("Bob", "Awesome street");
        runPerson(athlete);
        System.out.println(" >> " + athlete);
        Athlete another = null;
        Person[] persons = null;
//        System.out.println(persons[0]);
//        System.out.println("Name is " + another.getName());
        String line = "line";
        System.out.println("Equals: " + athlete.equals(line));
        boolean result = athlete.equals(another);
        another.equals(athlete);
    }

    private static void runPerson(Person person) {
        person.run();
    }
}
