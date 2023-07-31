package webshop.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.product.domain.Product;
import webshop.product.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(ProductDto productDto) {
        Product product = ProductAdaptor.getProductFromProductDTO(productDto);
        productRepository.save(product);
    }

    @Override
    public ProductDto getProduct(long productNumber) {
        return ProductAdaptor.getProductDTOFromProduct(productRepository.findById(productNumber).get());
    }
}
