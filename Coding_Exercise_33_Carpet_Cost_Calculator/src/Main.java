public class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4);

        System.out.println(floor.getArea());

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total cost is " + calculator.getTotalCost());
    }
}
