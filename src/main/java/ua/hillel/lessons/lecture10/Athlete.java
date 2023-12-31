package ua.hillel.lessons.lecture10;

public class Athlete extends Person {


    public Athlete(String name, String address) {
        super(name, address);
    }

    @Override
    public void run() {
        System.out.println("Athlete " + getName() + " is driving");
    }

    @Override
    public String writeBook() {
        return "Simple book";
    }

    @Override
    public String toString() {
        return "i' m an athlete. My name is " + getName();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Athlete)) {
            return false;
        }
        Athlete other = (Athlete) object;

        return (this.getName() == null && other.getName() == null) || (this.getName() != null && this.getName().equals(other.getName()));
    }

}
