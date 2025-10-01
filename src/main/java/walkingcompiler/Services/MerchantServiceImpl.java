package walkingcompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Merchant;
import walkingcompiler.data.repository.MerchantRepository;
import walkingcompiler.exceptions.*;
import java.util.List;
import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public Merchant findByMerchantId(String merchantId) {
        Optional<Merchant> merchant = Optional.ofNullable(merchantRepository.findByMerchantId(merchantId));
        if (merchant.isPresent()) {
            return merchant.get();
        } else {
            throw new MerchantNotFoundException("Merchant not found");
        }
    }

    @Override
    public Merchant save(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    @Override
    public Merchant findByFirstName(String firstName) {
        if (merchantRepository.findByFirstName(firstName) != null) {
            return merchantRepository.findByFirstName(firstName);
        } else {
            throw new NameNotFoundException("Name not found");
        }
    }

    @Override
    public Merchant findByLastName(String lastName) {
        if (merchantRepository.findByLastName(lastName) != null) {
            return merchantRepository.findByFirstName(lastName);
        } else {
            throw new NameNotFoundException("Name not found");
        }
    }

    @Override
    public Merchant findByEmail(String email) {
        if (merchantRepository.findByEmail(email) != null) {
            return merchantRepository.findByEmail(email);
        } else {
            throw new InvalidEmailException("Email not found");
        }
    }

    @Override
    public Merchant findByContact(String contact) {
        return merchantRepository.findByContact(contact);
    }

    @Override
    public Merchant findByDOB(String dob) {
        return merchantRepository.findByDOB(dob);
    }

    @Override
    public Merchant findByGender(String gender) {
        return merchantRepository.findByGender(gender);
    }

    @Override
    public Merchant findByStreetNumber(String streetNumber) {
        return merchantRepository.findByStreetNumber(streetNumber);
    }

    @Override
    public Merchant findByStreetName(String streetName) {
        return merchantRepository.findByStreetName(streetName);
    }

    @Override
    public Merchant findByCity(String city) {
        return merchantRepository.findByCity(city);
    }

    @Override
    public Merchant findByState(String state) {
        return merchantRepository.findByState(state);
    }

    @Override
    public Merchant findByZipCode(String zipCode) {
        Merchant merchant = merchantRepository.findByZipCode(zipCode);
        if (merchant == null) {
            throw new ZipCodeNotFoundException(STR."User not found for zip code: \{zipCode}");
        }
        return merchant;
    }

    @Override
    public Merchant findByCountry(String country) {
        List<Merchant> merchants = (List<Merchant>) merchantRepository.findByCountry(country);
        if (merchants.isEmpty()) {
            throw new CountryNotFoundException(STR."No merchant found for country: \{country}");
        }
        return (Merchant) merchants;
    }

    @Override
    public Merchant findByBusinessName(String businessName) {
        Merchant name = merchantRepository.findByBusinessName(businessName);
        if (businessName.isEmpty()) {
            throw new BusinessNameNotFoundException(STR."No user found for this businessName: \{businessName}");
        }
        return name;
    }

    @Override
    public Merchant findByBankName(String bankName) {
        Optional<Merchant> bank = Optional.ofNullable(merchantRepository.findByBankName(bankName));
        if (bank.isEmpty()) {
            throw new BankNameNotFoundException(STR."No user found for bank: \{bankName}");
        }
        return merchantRepository.findByBankName(bankName);
    }

    @Override
    public Merchant findByBankAccountType(String bankAccountType) {
        return merchantRepository.findByBankAccountType(bankAccountType);
    }

    @Override
    public Merchant findByBankAccountNumber(String bankAccountNumber) {
        return merchantRepository.findByBankAccountNumber(bankAccountNumber);
    }

    @Override
    public Merchant findByCreditCard(String creditCard) {
        if(creditCard.isEmpty()) {
            throw new CreditCardNotFound("Invalid Credit Card");
        }
        return merchantRepository.findByCreditCard(creditCard);
    }
}
