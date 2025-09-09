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
public class User {

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
    private String bankAccountType;
    private String bankAccountNumber;
}
