package ua.hillel.lessons.lecture10;

public class Athlete extends Person {


    public Athlete(String name, String address) {
        super(name, address);
    }

    @Override
    public void run() {
        System.out.println("Athlete " + getName() + " is driving");
    }
}
