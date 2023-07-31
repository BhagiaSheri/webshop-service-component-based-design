package webshop.shoppingCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import webshop.shoppingCart.service.IShoppingCartService;
import webshop.shoppingCart.service.ShoppingCartDto;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/carts")
public class ShoppingCartController {

    private final IShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(IShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @ResponseStatus(CREATED)
    @PostMapping
    public void addToShoppingCart(@RequestBody ShoppingCartDto shoppingCartDto) {
        shoppingCartService.addToShoppingCart(shoppingCartDto);
    }


    @ResponseStatus(OK)
    @GetMapping("/{shoppingCartNumber}")
    public ShoppingCartDto getShoppingCart(@PathVariable long shoppingCartNumber) {
        return shoppingCartService.getShoppingCart(shoppingCartNumber);
    }
}