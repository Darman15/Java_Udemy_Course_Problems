package com.company;

public class Main {

    public static void main(String[] args) {
	Wall wall = new Wall(5, 4);

        System.out.println(wall.getArea());

    Wall wallTwo = new Wall();

    wallTwo.setHeight(-1.5);

        System.out.println(wallTwo.getHeight());
    }
}
