package walkingcompiler.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ProductDto {

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
