package ua.hillel.lessons.lecture15;

public class Car {
    private String name = "CarDefaultName";
    Engine engine;


    public Car() {
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }

    public void startDiagnostic() {
        System.out.println("Diagnostic running");
        System.out.println("Diagnostic finished");
    }

    public class Engine {
        private boolean enabled;
        private String name = "EngineDefaultName";

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        @Override
        public String toString() {
            return "Engine is enabled = " + enabled;
        }

        public void startEngineDiagnostic() {
            System.out.println("diagnostic '"+ name + "' is running");
            if(true) {
                System.out.println("Need to run full diagnostic for '" + Car.this.name + "'");
                startDiagnostic();
            }
            System.out.println("diagnostic '"+ name + "' is finished");
        }
    }


}
