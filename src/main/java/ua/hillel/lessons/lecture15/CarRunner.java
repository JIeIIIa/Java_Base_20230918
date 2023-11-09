package ua.hillel.lessons.lecture15;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car was created: " + car);
        Car.Engine engine = car.new Engine();
        car.setEngine(engine);
        System.out.println("Engine was set: " + car);

        car.engine.startEngineDiagnostic();
    }
}
