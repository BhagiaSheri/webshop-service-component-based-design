package webshop.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webshop.product.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
}

