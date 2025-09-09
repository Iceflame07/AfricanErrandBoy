package walkingcompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Merchant;
import walkingcompiler.data.repository.MerchantRepository;

@Service
public class MerchantServiceImpl implements MerchantService{

    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public Merchant findByMerchantId(String merchantId) {
        return null;
    }

    @Override
    public Merchant save(Merchant merchant) {
        return null;
    }

    @Override
    public Merchant findByFirstName(String firstName) {
        return null;
    }

    @Override
    public Merchant findByLastName(String lastName) {
        return null;
    }

    @Override
    public Merchant findByEmail(String email) {
        return null;
    }

    @Override
    public Merchant findByContact(String contact) {
        return null;
    }

    @Override
    public Merchant findByDOB(String dob) {
        return null;
    }

    @Override
    public Merchant findByGender(String gender) {
        return null;
    }

    @Override
    public Merchant findByStreetNumber(String streetNumber) {
        return null;
    }

    @Override
    public Merchant findByStreetName(String streetName) {
        return null;
    }

    @Override
    public Merchant findByCity(String city) {
        return null;
    }

    @Override
    public Merchant findByState(String state) {
        return null;
    }

    @Override
    public Merchant findByZipCode(String zipCode) {
        return null;
    }

    @Override
    public Merchant findByCountry(String country) {
        return null;
    }

    @Override
    public Merchant findByBusinessName(String businessName) {
        return null;
    }

    @Override
    public Merchant findByBankName(String bankName) {
        return null;
    }

    @Override
    public Merchant findByBankAccountType(String bankAccountType) {
        return null;
    }

    @Override
    public Merchant findByBankAccountNumber(String bankAccountNumber) {
        return null;
    }
}
