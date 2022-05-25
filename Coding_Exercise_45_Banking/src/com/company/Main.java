package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Main Bank");

        Branch westBranch = new Branch("WestBranch");

        Customer customer = new Customer("Ben", 23.69);

        customer.addTransaction(55.23);

        westBranch.newCustomer("Cade", 556.33);

       westBranch.addCustomerTransation("Cade", 10.23);

        System.out.println(westBranch.getCustomers().get(0).getTransactions());

        westBranch.getCustomers().get(0).addTransaction(45.22);

        System.out.println(westBranch.getCustomers().get(0).getTransactions());

        westBranch.newCustomer("Ben", 800.30);

        System.out.println(westBranch.getCustomers().get(1).getName());

        westBranch.addCustomerTransation("Ben", 88.32);

        System.out.println(westBranch.getCustomers().get(1).getTransactions());

        System.out.println(bank.getName());

        bank.addBranch("Secondary Branch");

        bank.addBranch("Third Branck");

        System.out.println( bank.getBranches().get(1).getName());

        bank.addCustomer("Secondary Branch", "Tam", 1.23);

        System.out.println(bank.getBranches().get(0).getCustomers().get(0).getName());





    }
}
