package walkingcompiler.Services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Merchant;

@Service
public interface MerchantService {
    Merchant findByMerchantId(String merchantId);
    Merchant save(Merchant merchant);
    Merchant findByFirstName(String firstName);
    Merchant findByLastName(String lastName);
    Merchant findByEmail(String email);
    Merchant findByContact(String contact);
    Merchant findByDOB(String dob);
    Merchant findByGender(String gender);
    Merchant findByStreetNumber(String streetNumber);
    Merchant findByStreetName(String streetName);
    Merchant findByCity(String city);
    Merchant findByState(String state);
    Merchant findByZipCode(String zipCode);
    Merchant findByCountry(String country);
    Merchant findByBusinessName(String businessName);
    Merchant findByBankName(String bankName);
    Merchant findByBankAccountType(String bankAccountType);
    Merchant findByBankAccountNumber(String bankAccountNumber);
    Merchant findByCreditCard(String creditCard);
}
