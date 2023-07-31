package webshop.shoppingCart.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class ShoppingCart {
    @Id
    private long shoppingCartNumber;
    private List<CartLine> cartLines;

    public ShoppingCart(long shoppingCartNumber, List<CartLine> cartLines) {
        this.shoppingCartNumber = shoppingCartNumber;
        this.cartLines = cartLines;
    }

    public long getShoppingCartNumber() {
        return shoppingCartNumber;
    }

    public void setShoppingCartNumber(long shoppingCartNumber) {
        this.shoppingCartNumber = shoppingCartNumber;
    }

    public List<CartLine> getCartLines() {
        return cartLines;
    }

    public void setCartLines(List<CartLine> cartLines) {
        this.cartLines = cartLines;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCartNumber=" + shoppingCartNumber +
                ", cartLines=" + cartLines +
                '}';
    }
}