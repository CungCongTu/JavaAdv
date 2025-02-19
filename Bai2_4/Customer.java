package Bai2_4;

public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer( int id,String name, int discount) {
        this.name = name;
        this.id = id;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discount=" + discount + "%"+
                '}';
    }
}

class Invoice{
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount*(1-customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer.getName() +
                '('+customer.getId()+')' +
                '('+customer.getDiscount()+"%"+')'+
                ", amount=" + amount +
                '}';
    }
}
