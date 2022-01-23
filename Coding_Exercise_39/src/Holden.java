public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The car is starting from teh Holden class";
    }

    @Override
    public String accelerate() {
        return "The car is accelerating from the Holden class";
    }

    @Override
    public String brake() {
        return "The car is braking from the Holden class";
    }
}
