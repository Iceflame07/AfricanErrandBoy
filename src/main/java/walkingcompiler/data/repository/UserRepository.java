package walkingcompiler.data.repository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.User;
import java.util.Optional;

@Repository
public interface UserRepository {

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
    User findByCountry(String country);
    User findByZipCode(String zipCode);
    User findByBankName(String bankName);
    User findByBankAccountType(String bankAccountType);
    User findByBankAccountNumber(String bankAccountNumber);
    User findByUserVisaCard(String userVisaCard);
    Optional<User> findByUserMasterCard1(String userMasterCard1);
    User findByUserMasterCard2(String userMasterCard2);
    User findByUserVerveCard(String userVerveCard);
}
