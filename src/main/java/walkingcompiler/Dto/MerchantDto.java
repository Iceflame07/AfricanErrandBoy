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
public class MerchantDto {

    @Id
    private String merchantId;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String DOB;
    private String gender;
    private String streetNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String businessName;
    private String bankName;
    private String bankAccountType;
    private String bankAccountNumber;
}
