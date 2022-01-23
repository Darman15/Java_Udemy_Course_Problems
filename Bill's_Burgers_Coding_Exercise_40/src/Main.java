public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizehamburger());

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("is this allowed?", 50.53);
        System.out.println(db.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 5.67);

        healthyBurger.addHamburgerAddition1("egg", 5.43);

        healthyBurger.addHealthyAddition2("lentils", 3.41);

        System.out.println(healthyBurger.itemizehamburger());
    }




}
