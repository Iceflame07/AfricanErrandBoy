package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.Dto.ProductDto;
import walkingcompiler.Services.ProductService;
import walkingcompiler.data.models.Product;
import walkingcompiler.utils.ProductMapper;


@RestController("/ProductController")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/productId")
    public ResponseEntity<Product> productId(@RequestBody ProductDto product) {
        Product prod = (Product) productService.findByproductId(product.getProductId());
        return new ResponseEntity<>(ProductMapper.mapToProductDto(prod), HttpStatus.CREATED);
    }

    @PostMapping("/productBrand")
    public ResponseEntity<ProductDto> productBrand(@RequestBody Product productDto) {
        Product found = productService.findByProductBrand(productDto.getProductBrand());
        Product brand = (Product) productService.findByproductId(String.valueOf(found));
        return new ResponseEntity<>(ProductMapper.mapToProduct(brand), HttpStatus.OK);
    }

}
