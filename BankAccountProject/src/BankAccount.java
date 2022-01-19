public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


//    constructor
    public BankAccount() {
    this(58564, 2.50, "Default name", "Default Address", "Default ");
    }


    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//    example of a constructor that defaults two parameters and sets the rest on creation


    public BankAccount(String customerName, String email, String phoneNumber) {
        this(45454545, 00.00, customerName, email, phoneNumber);

    }

    //    setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double depositFunds(double moneyBeingDeposited) {

        balance = getBalance() + moneyBeingDeposited;
        return balance;
    }

    public double withdrawlFunds(double moneyBeingWithdrawn) {
        if (moneyBeingWithdrawn > getBalance()) {
            moneyBeingWithdrawn = 0;
            System.out.println("Inefficient funds");

        }
        return getBalance() - moneyBeingWithdrawn;
    }

}
