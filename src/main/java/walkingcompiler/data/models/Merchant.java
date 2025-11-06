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
public class Merchant {

    @Id
    private String merchantId;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String dob;
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
    private String merchantVisaCard;
    private String merchantMasterCard1;
    private String merchantMasterCard2;
    private String merchantVerveCard;
}
