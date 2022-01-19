public class Wall {

    private double width;
    private double height;



    // constructors
    public Wall(double width, double height) {
        if (width < 0 || height < 0) {
            height = 0;
            width = 0;
        }

        this.width = width;
        this.height = height;
    }

    public Wall() {
        this(0, 0);
    }

//    setters

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

//Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

//    get area method

    public double getArea() {
        return width * height;
    }


}
