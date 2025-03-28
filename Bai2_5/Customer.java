package Bai2_5;

public class Customer {
    private int id;
    private String name;
    private char gender;


    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  name + "(" + id + ")";

    }
}

class Account{
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }


    public String getCustomerName() {
        return customer.getName();
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }


    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}
