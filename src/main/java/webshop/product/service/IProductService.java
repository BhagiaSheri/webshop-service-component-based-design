package webshop.product.service;

public interface IProductService {
    void createProduct(ProductDto productDto);

    ProductDto getProduct(long productNumber);
}
