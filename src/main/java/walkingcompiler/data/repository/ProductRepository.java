package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Product;
import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
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
