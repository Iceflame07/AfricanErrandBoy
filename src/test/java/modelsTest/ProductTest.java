package modelsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Product;
import walkingcompiler.exceptions.ProductOutOfStockException;

public class ProductTest {

    @Test
    public void testForProductAvailability() {
        Product produce = new Product("","","","","","","","");
        produce.setProductId("");
        produce.setProductName("");
        produce.setProductDescription("");
        produce.setProductCategory("");
        produce.setProductPrice("");
        produce.setProductType("");
        produce.setProductBrand("");
        produce.setProductSize("");
        Assertions.assertEquals("", produce.getProductId());
        Assertions.assertEquals("", produce.getProductName());
        Assertions.assertEquals("", produce.getProductDescription());
        Assertions.assertEquals("", produce.getProductCategory());
        Assertions.assertEquals("", produce.getProductPrice());
        Assertions.assertEquals("", produce.getProductType());
        Assertions.assertEquals("", produce.getProductBrand());
        Assertions.assertEquals("", produce.getProductSize());
    }

    @Test
    public void testForProductOutOfStock() {
        Product prod = new Product("","","","","","","","");
            if("".equals(prod.getProductName())) {
                throw new RuntimeException("Product not available");
            } else {
                throw new ProductOutOfStockException("Product name is invalid");
            }
    }
}
