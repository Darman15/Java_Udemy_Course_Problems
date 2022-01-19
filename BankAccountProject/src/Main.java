public class Main {

    public static void main(String[] args) {

       VipCustomer vipCustomer = new VipCustomer("Ben", "Ben1-1@gmai");

        System.out.println(vipCustomer.getCreditLimit());

        VipCustomer vipCustomerTwo = new VipCustomer();

        System.out.println(vipCustomerTwo.getCreditLimit());
        System.out.println(vipCustomerTwo.getEmailAddress());
        System.out.println(vipCustomerTwo.getName());

        VipCustomer vipCustomerThree = new VipCustomer("Ben", 999999999, "Ben101@gmail.com");

        System.out.println(vipCustomerThree.getCreditLimit() + vipCustomerThree.getEmailAddress() + vipCustomerThree.getName());





    }
}
