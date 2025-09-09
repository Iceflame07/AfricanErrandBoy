package walkingcompiler.Dto;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class RiderDto {

    @Id
    private String riderId;
    private String firstName;
    private String lastName;
    private String email;
    private String contact1;
    private String contact2;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String gender;
    private String DOB;
    private String licensePlate;
    private String licenseNumber;
    private String bankName;
    private String bankAccountType;
    private String bankAccountNumber;
}
