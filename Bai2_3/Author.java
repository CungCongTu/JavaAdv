package Bai2_3;

public class Author {
    private String name;
    private String email;


    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


class Book{
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;


    public Book(String isbn, String name, double price, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = 0;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }


    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                "," + author + // author la mot doi tuong nen ghi goi toString no se goi no theo
                "email=" + author.getEmail() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}