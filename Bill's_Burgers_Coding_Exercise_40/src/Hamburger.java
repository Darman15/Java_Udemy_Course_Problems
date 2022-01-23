public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
//    possible addition variables
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
//    possible addition name prices
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addonName, double addonPrice) {
        this.price = this.price + addonPrice;

    }

    public void addHamburgerAddition2(String addonName, double addonPrice) {
        this.price = this.price + addonPrice;

    }

    public void addHamburgerAddition3(String addonName, double addonPrice) {
        this.price = this.price + addonPrice;

    }

    public void addHamburgerAddition4(String addonName, double addonPrice) {
        this.price = this.price + addonPrice;

    }

    public double itemizehamburger() {
        return price;
    }


}
