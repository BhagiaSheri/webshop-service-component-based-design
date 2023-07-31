package webshop.shoppingCart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.shoppingCart.domain.ShoppingCart;
import webshop.shoppingCart.repository.ShoppingCartRepository;

@Service
public class ShoppingCartServiceImp implements IShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    @Autowired
    public ShoppingCartServiceImp(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public void addToShoppingCart(ShoppingCartDto shoppingCartDto) {
        ShoppingCart shoppingCart = ShoppingCartAdaptor.getShoppingCartFromShoppingCartDTO(shoppingCartDto);
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public ShoppingCartDto getShoppingCart(long shoppingCartNumber) {
        return ShoppingCartAdaptor.getShoppingCartDTOFromShoppingCart(shoppingCartRepository.findById(shoppingCartNumber).get());
    }
}
