public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return "The car is starting from the Car class";
    }

    public String accelerate() {
        return "The car is accelerating from the Car class";
    }

    public String brake() {
        return "The car is braking from the Car class";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
