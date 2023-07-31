package webshop.shoppingCart.domain;

public class CartLine {
    private Product product;
    private int quantity;

    public CartLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "CartLine{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
