package webshop.product.service;


import org.springframework.stereotype.Component;
import webshop.product.domain.Product;
import webshop.product.domain.Stock;

@Component
public class ProductAdaptor {

    public static Product getProductFromProductDTO(ProductDto productDto) {
        return new Product(productDto.getProductNumber(), productDto.getDescription(), productDto.getPrice(), new Stock(productDto.getNoInStock(), productDto.getLocationCode()));
    }

    public static ProductDto getProductDTOFromProduct(Product product) {
        return new ProductDto(product.getProductNumber(), product.getDescription(), product.getPrice(), product.getStock().getNoInStock(), product.getStock().getLocationCode());
    }
}
