public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        Cuboid cuboid = new Cuboid(5,10,5);


        System.out.println(rectangle.getArea());
        System.out.println(cuboid.getVolume());
    }
}
