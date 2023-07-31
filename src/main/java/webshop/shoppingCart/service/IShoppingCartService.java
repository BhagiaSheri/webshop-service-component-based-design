package webshop.shoppingCart.service;

public interface IShoppingCartService {
    void addToShoppingCart(ShoppingCartDto shoppingCartDto);

    ShoppingCartDto getShoppingCart(long shoppingCartNumber);
}
