package walkingcompiler.Services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.User;
import java.util.List;
import java.util.Optional;

@Service
public interface UserServices {

    User findByUserId(String userId);
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByEmail(String email);
    User findByContact(String contact);
    User findByDOB(String dob);
    User findByGender(String gender);
    User findByAddress(String address);
    User findByCity(String city);
    User findByState(String state);
    List<User> findByCountry(String country);
    Optional<User> findByZipCode(String zipCode);
    User findByBankName(String bankName);
    User findByBankAccountType(String bankAccountType);
    User findByBankAccountNumber(String bankAccountNumber);
}
