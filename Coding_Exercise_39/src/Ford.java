public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The car is starting from the Ford class";
    }

    @Override
    public String accelerate() {
        return "The car is accelerating from the Ford class";
    }

    @Override
    public String brake() {
        return "The car is braking from the Ford class";
    }


}
