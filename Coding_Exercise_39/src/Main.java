public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Regular car");

        System.out.println(car.startEngine());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Some model of car");

        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(4, "Mustang GT");

        System.out.println(ford.accelerate());


    }
}
