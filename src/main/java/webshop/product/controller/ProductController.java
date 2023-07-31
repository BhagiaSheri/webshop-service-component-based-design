package webshop.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import webshop.product.service.IProductService;
import webshop.product.service.ProductDto;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @ResponseStatus(CREATED)
    @PostMapping
    public void createProduct(@RequestBody ProductDto productDto) {
        productService.createProduct(productDto);
    }


    @ResponseStatus(OK)
    @GetMapping("/{productNumber}")
    public ProductDto getBook(@PathVariable long productNumber) {
        return productService.getProduct(productNumber);
    }
}