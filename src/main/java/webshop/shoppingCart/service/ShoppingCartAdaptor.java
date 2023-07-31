package webshop.shoppingCart.service;


import org.springframework.stereotype.Component;
import webshop.shoppingCart.domain.CartLine;
import webshop.shoppingCart.domain.Product;
import webshop.shoppingCart.domain.ShoppingCart;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShoppingCartAdaptor {

    public static ShoppingCart getShoppingCartFromShoppingCartDTO(ShoppingCartDto shoppingCartDto) {
        List<CartLine> cartLines = shoppingCartDto.getCartLineDtos().stream().map(cartLineDto -> new CartLine(new Product(cartLineDto.getProductNumber(), cartLineDto.getDescription(), cartLineDto.getQuantity()), cartLineDto.getQuantity())).collect(Collectors.toList());
        return new ShoppingCart(shoppingCartDto.getShoppingCartNumber(), cartLines);
    }

    public static ShoppingCartDto getShoppingCartDTOFromShoppingCart(ShoppingCart shoppingCart) {
        List<CartLineDto> cartLineDtos = shoppingCart.getCartLines().stream().map(cartLine -> new CartLineDto(cartLine.getProduct().getProductNumber(), cartLine.getProduct().getDescription(), cartLine.getProduct().getPrice(), cartLine.getQuantity())).collect(Collectors.toList());
        return new ShoppingCartDto(shoppingCart.getShoppingCartNumber(), cartLineDtos);
    }
}
