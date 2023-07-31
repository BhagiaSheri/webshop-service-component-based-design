package webshop.shoppingCart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webshop.shoppingCart.domain.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, Long> {
//    Product findByPhone(String phone);
//    Product findByName(String name);
//
//
//    @Query("{email : ?0}")
//    Product findCustomerWithEmail(String email);
//
//    @Query("{'creditCard.type' : ?0}")
//    List<Product>  findCustomerWithCreditCardType(String cctype);
}

