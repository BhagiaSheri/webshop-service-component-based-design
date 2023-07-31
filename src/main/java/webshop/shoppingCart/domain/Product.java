package webshop.shoppingCart.domain;

public class Product {
    private long productNumber;
    private String description;
    private double price;

    public Product(long productNumber, String description, double price) {
        this.productNumber = productNumber;
        this.description = description;
        this.price = price;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
