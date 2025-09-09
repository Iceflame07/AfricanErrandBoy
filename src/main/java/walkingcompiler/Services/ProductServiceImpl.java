package walkingcompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Product;
import walkingcompiler.data.repository.ProductRepository;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findByproductId(String productId) {
        return null;
    }

    @Override
    public Product findByProductName(String productName) {
        return null;
    }

    @Override
    public Product findByProductDescription(String productDescription) {
        return null;
    }

    @Override
    public Product findByProductCategory(String productCategory) {
        return null;
    }

    @Override
    public Product findByProductPrice(String productPrice) {
        return null;
    }

    @Override
    public Product findByProductType(String productType) {
        return null;
    }

    @Override
    public Product findByProductBrand(String productBrand) {
        return null;
    }

    @Override
    public Product findByProductSize(String productSize) {
        return null;
    }

    @Override
    public List<Product> findAllProducts() {
        return List.of();
    }
}
