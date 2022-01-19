public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer(String name, String emailAddress) {
        this(name, 555555, emailAddress);
    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("Default Name", 9999999, "DefaultEmail@default.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
