package walkingcompiler.data.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
@UUID
public class Product {

    @Id
    private String productId;
    private String productName;
    private String productDescription;
    private String productCategory;
    private String productPrice;
    private String productType;
    private String productBrand;
    private String productSize;
}
