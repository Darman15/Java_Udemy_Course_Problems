package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    private Branch findBranch(String branchName) {

        for(int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        else {
            System.out.println("The branch may already exist");
            return false;
        }
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        if(findBranch(nameOfBranch) != null) {
            findBranch(nameOfBranch).newCustomer(nameOfCustomer, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transactionAmount) {
        if(findBranch(nameOfBranch) != null) {
            findBranch(nameOfBranch).addCustomerTransation(nameOfCustomer, transactionAmount);
            return true;
        }
        return false;
    }
}
