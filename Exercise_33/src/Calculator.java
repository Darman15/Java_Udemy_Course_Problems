public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double geetTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
