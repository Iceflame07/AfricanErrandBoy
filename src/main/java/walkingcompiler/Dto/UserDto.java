package walkingcompiler.data.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    @Id
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String DOB;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String bankName;
    private String bankAccountNumber;
    private String bankAccountType;
    private String userVisaCard;
    private String userMasterCard1;
    private String userMasterCard2;
    private String userVerveCard;
}
