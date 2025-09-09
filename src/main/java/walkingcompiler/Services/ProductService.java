package walkingcompiler.Services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Product;
import java.util.List;

@Service
public interface ProductService {
    Product findByproductId(String productId);
    Product findByProductName(String productName);
    Product findByProductDescription(String productDescription);
    Product findByProductCategory(String productCategory);
    Product findByProductPrice(String productPrice);
    Product findByProductType(String productType);
    Product findByProductBrand(String productBrand);
    Product findByProductSize(String productSize);
    List<Product> findAllProducts();
}
