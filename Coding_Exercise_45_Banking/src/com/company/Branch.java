package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if (findCustomer(nameOfCustomer) == null) {
            this.customers.add(new Customer(nameOfCustomer, initialTransaction));
            return true;
        }
        else {
            System.out.println("The customer already exist or somtin");
            return false;
        }
    }

    public  boolean addCustomerTransation(String nameofCustomer, double amount) {
        if(findCustomer(nameofCustomer) != null) {
          findCustomer(nameofCustomer).addTransaction(amount);
          return true;
        }
        return false;
    }



   private Customer findCustomer(String nameOfCustomer) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(nameOfCustomer)) {
                return customer;
            }
        }
        return null;
    }
}
