package walkingcompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Product;
import walkingcompiler.data.repository.ProductRepository;
import walkingcompiler.exceptions.ProductNotFoundException;
import walkingcompiler.exceptions.ProductOutOfStockException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findByproductId(String productId) {
        if (productId.matches(productId)) {
            return productRepository.findByproductId(productId);
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }

    @Override
    public Product findByProductName(String productName) {
        return productRepository.findByProductName(productName);
    }

    @Override
    public Product findByProductDescription(String productDescription) {
        return productRepository.findByProductDescription(productDescription);
    }

    @Override
    public Product findByProductCategory(String productCategory) {
        return productRepository.findByProductCategory(productCategory);
    }

    @Override
    public Product findByProductPrice(String productPrice) {
        return productRepository.findByProductPrice(productPrice);
    }

    @Override
    public Product findByProductType(String productType) {
        return productRepository.findByProductType(productType);
    }

    @Override
    public Product findByProductBrand(String productBrand) {
        return productRepository.findByProductBrand(productBrand);
    }

    @Override
    public Product findByProductSize(String productSize) {
        return productRepository.findByProductSize(productSize);
    }

    @Override
    public List<Product> findAllProducts() {
        List<Product> products = productRepository.findAllProducts();
        if (products.isEmpty()) {
            throw new ProductNotFoundException("No products found");
        } else {
            throw new ProductOutOfStockException(STR."There are \{products.size()} products");
        }
    }
}
