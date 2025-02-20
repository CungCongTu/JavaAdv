package Bai2_5;


public class TestMain {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(101, "Alice", 'f');
        System.out.println("Customer: " + customer);

        // Create an Account object with balance
        Account account = new Account(201, customer, 1000.0);
        System.out.println("\nInitial Account: " + account);

        // Test getId()
        System.out.println("Account ID: " + account.getId());

        // Test getCustomer()
        System.out.println("Customer Info: " + account.getCustomer());

        // Test getBalance()
        System.out.println("Initial Balance: $" + account.getBalance());

        // Test setBalance()
        account.setBalance(1500.0);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Test getCustomerName()
        System.out.println("Customer Name: " + account.getCustomerName());

        // Test deposit
        account.deposit(500.0);
        System.out.println("After Deposit of $500: " + account);

        // Test withdraw (valid amount)
        account.withdraw(700.0);
        System.out.println("After Withdrawal of $700: " + account);

        // Test withdraw (exceeding amount)
        account.withdraw(2000.0);
        System.out.println("After Trying to Withdraw $2000: " + account);

        // Test toString()
        System.out.println("\nFinal Account Info: " + account);
    }
}