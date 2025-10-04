package walkingcompiler.utils;
import org.hibernate.validator.constraints.UUID;
import walkingcompiler.Dto.ProductDto;
import walkingcompiler.data.models.Product;

@UUID
public class ProductMapper {

    public static Product mapToProductDto(ProductDto product) {
        return new Product(
                product.getProductId(),
                product.getProductName(),
                product.getProductDescription(),
                product.getProductCategory(),
                product.getProductPrice(),
                product.getProductType(),
                product.getProductBrand(),
                product.getProductSize()
        );
    }

    public static ProductDto mapToProduct(Product productDto) {
        return new ProductDto(
                productDto.getProductId(),
                productDto.getProductName(),
                productDto.getProductDescription(),
                productDto.getProductCategory(),
                productDto.getProductPrice(),
                productDto.getProductType(),
                productDto.getProductBrand(),
                productDto.getProductSize()
        );
    }
}
