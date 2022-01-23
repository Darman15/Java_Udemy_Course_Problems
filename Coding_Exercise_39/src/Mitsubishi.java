public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The car is starting from teh Mitsubishi class";
    }

    @Override
    public String accelerate() {
        return "The car is accelerating from the Mitsubishi class";
    }

    @Override
    public String brake() {
        return "The car is braking from the Mitsubishi class";
    }
}
