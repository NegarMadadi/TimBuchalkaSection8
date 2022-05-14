package org.example.banking;

//→ OUTPUT
//
//The list of customers should be printed out in the following format if boolean parameter is true:
//
//Customer details for branch Adelaide
//Customer: Tim[1]
//Transactions
//[1]  Amount 50.05
//[2]  Amount 44.22
//[3]  Amount 12.44
//Customer: Mike[2]
//Transactions
//[1]  Amount 175.34
//[2]  Amount 1.65
//Customer: Percy[3]
//Transactions
//[1]  Amount 220.12
//
//and if false, only the customers - no transactions:
//
//bank.listCustomers("Adelaide", false);
//
//Customer details for branch Adelaide
//Customer: Tim[1]
//Customer: Mike[2]
//Customer: Percy[3]

//
//TIP:In Bank, use the findBranch() method in each of the other four methods to validate a branch.
// Do the same thing in Branch with findCustomer() - except for the two getters.
//
//TIP: In Customer, think about what else you need to do in the constructor when you instantiate a Customer object.
//
//TIP: Think about what methods you need to call from another class when implementing a method.
//
//TIP: Be extremely careful with the spelling of the names of the fields, constructors and methods.
//
//TIP: Be extremely careful about spaces and spelling in the printed output.
//
//NOTE: All transactions are deposits (no withdraws/balances).
//
//NOTE: All fields are private.
//
//NOTE: All constructors are public.
//
//NOTE: All methods are public (except for findBranch() and findCustomer() which are private).
//
//NOTE: There are no static members.
//
//NOTE: Do not add a main method to the solution code.
//
//NOTE: If you get an error from the Evaluate class, it's most likely the constructor.
// Check if you've added a constructor or if the constructor has the right arguments.

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

       if (bank.addBranch("Adelaide")){
           System.out.println("Adelaide branch created.");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomerTransaction("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error melbourne branch does not exist.");
        }

        if (!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists.");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
            System.out.println("Customer does not exists at branch.");
        }

    }
}
