public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Delux", "Bacon & Beef", 19.10, "Best Bread");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }


    @Override
    public void addHamburgerAddition1(String addonName, double addonPrice) {
        System.out.println("No additional toppings can be placed on this order");
    }

    @Override
    public void addHamburgerAddition2(String addonName, double addonPrice) {
        System.out.println("No additional toppings can be placed on this order");
    }

    @Override
    public void addHamburgerAddition3(String addonName, double addonPrice) {
        System.out.println("No additional toppings can be placed on this order");
    }

    @Override
    public void addHamburgerAddition4(String addonName, double addonPrice) {
        System.out.println("No additional toppings can be placed on this order");
    }
}
