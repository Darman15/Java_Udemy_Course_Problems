public class Main {

    public static void main(String[] args) {

        Wall wall = new Wall(-5, 4);

        System.out.println(wall.getArea());
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());

        Wall wallTwo = new Wall();

        wallTwo.setHeight(10);
        wallTwo.setWidth(10);

        System.out.println(wallTwo.getArea());
    }
}
