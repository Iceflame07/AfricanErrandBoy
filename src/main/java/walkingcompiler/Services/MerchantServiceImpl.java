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
        return Optional.ofNullable(merchantRepository.findByMerchantId(merchantId))
                .orElseThrow(() -> new MerchantNotFoundException("Merchant not found"));
    }

    @Override
    public Merchant save(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    @Override
    public Merchant findByFirstName(String firstName) {
        return Optional.ofNullable(merchantRepository.findByFirstName(firstName))
                .orElseThrow(() -> new NameNotFoundException("Name not found"));
    }

    @Override
    public Merchant findByLastName(String lastName) {
        return Optional.ofNullable(merchantRepository.findByLastName(lastName))
                .orElseThrow(() -> new NameNotFoundException("Name not found"));
    }

    @Override
    public Merchant findByEmail(String email) {
        return Optional.ofNullable(merchantRepository.findByEmail(email))
                .orElseThrow(() -> new InvalidEmailException("Email not found"));
    }

    @Override
    public Merchant findByContact(String contact) {
        return Optional.ofNullable(merchantRepository.findByContact(contact))
                .orElseThrow(() -> new ContactNotFoundException("Contact not found"));
    }

    @Override
    public Merchant findByDOB(String dob) {
        return Optional.ofNullable(merchantRepository.findByDOB(dob))
                .orElseThrow(() -> new DOBNotFoundException("DOB not found"));
    }

    @Override
    public Merchant findByGender(String gender) {
        return Optional.ofNullable(merchantRepository.findByGender(gender))
                .orElseThrow(() -> new GenderNotFoundException("Gender not found"));
    }

    @Override
    public Merchant findByStreetNumber(String streetNumber) {
        return Optional.ofNullable(merchantRepository.findByStreetNumber(streetNumber))
                .orElseThrow(() -> new StreetNumberNotFoundException("Street number not found"));
    }

    @Override
    public Merchant findByStreetName(String streetName) {
        return Optional.ofNullable(merchantRepository.findByStreetName(streetName))
                .orElseThrow(() -> new StreetNameNotFoundException("Street name not found"));
    }

    @Override
    public Merchant findByCity(String city) {
        return Optional.ofNullable(merchantRepository.findByCity(city))
                .orElseThrow(() -> new CityNotFoundException("City not found"));
    }

    @Override
    public Merchant findByState(String state) {
        return Optional.ofNullable(merchantRepository.findByState(state))
                .orElseThrow(() -> new StateNotFoundException("State not found"));
    }

    @Override
    public Merchant findByZipCode(String zipCode) {
        if (zipCode == null) {
            throw new IllegalArgumentException("Zip code cannot be null");
        }
        return Optional.ofNullable(merchantRepository.findByZipCode(zipCode))
                .orElseThrow(() -> new ZipCodeNotFoundException("No merchant found for zip code: " + zipCode));
    }

    @Override
    public Merchant findByCountry(String country) {
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("Country cannot be null or empty");
        }
        List<Merchant> merchants = (List<Merchant>) merchantRepository.findByCountry(country);
        if (merchants.isEmpty()) {
            throw new CountryNotFoundException("No merchant found for country: " + country);
        }
        if (merchants.size() > 1) {
            throw new IllegalStateException("Multiple merchants found for country: " + country);
        }
        return merchants.get(0);
    }

    @Override
    public Merchant findByBusinessName(String businessName) {
        Merchant merchant = merchantRepository.findByBusinessName(businessName);
        if (merchant == null) {
            throw new BusinessNameNotFoundException("No user found for this businessName: " + businessName);
        }
        return merchant;
    }

    @Override
    public Merchant findByBankName(String bankName) {
        if (bankName == null || bankName.trim().isEmpty()) {
            throw new IllegalArgumentException("Bank name cannot be null or empty");
        }
        return Optional.ofNullable(merchantRepository.findByBankName(bankName))
                .orElseThrow(() -> new BankNameNotFoundException("No merchant found for bank: " + bankName));
    }

    @Override
    public Merchant findByBankAccountType(String bankAccountType) {
        return Optional.ofNullable(merchantRepository.findByBankAccountType(bankAccountType))
                .orElseThrow(() -> new BankAccountTypeNotFoundException("Bank account type not found"));
    }

    @Override
    public Merchant findByBankAccountNumber(String bankAccountNumber) {
        return Optional.ofNullable(merchantRepository.findByBankAccountNumber(bankAccountNumber))
                .orElseThrow(() -> new BankAccountNumberNotFoundException("Bank account number not found"));
    }

    @Override
    public Merchant findByMerchantVisaCard(String merchantVisaCard) {
        if (merchantVisaCard.length() == 16 || merchantVisaCard.startsWith("4")) {
            return Optional.ofNullable(merchantRepository.findByMerchantVisaCard(merchantVisaCard))
                    .orElseThrow(() -> new CreditCardNotFoundException("Visa card not found: " + merchantVisaCard));
        } else {
            throw new IllegalArgumentException("Invalid Visa card number");
        }
    }

    @Override
    public Optional<Merchant> findByMerchantMasterCard1(String merchantMasterCard1) {
        if (merchantMasterCard1.length() == 16 || merchantMasterCard1.startsWith("5")) {
            return Optional.ofNullable(merchantRepository.findByMerchantMasterCard1(merchantMasterCard1));
        } else {
            throw new IllegalArgumentException("Invalid MasterCard number");
        }
    }

    @Override
    public Merchant findByMerchantMasterCard2(String merchantMasterCard2) {
        if (merchantMasterCard2.length() == 16 || merchantMasterCard2.startsWith("2")) {
            return Optional.ofNullable(merchantRepository.findByMerchantMasterCard2(merchantMasterCard2))
                    .orElseThrow(() -> new CreditCardNotFoundException("MasterCard not found: " + merchantMasterCard2));
        } else {
            throw new IllegalArgumentException("Invalid MasterCard number");
        }
    }

    @Override
    public Merchant findByMerchantVerveCard(String merchantVerveCard) {
        if (merchantVerveCard.length() == 16 || merchantVerveCard.startsWith("65")) {
            return Optional.ofNullable(merchantRepository.findByMerchantVerveCard(merchantVerveCard))
                    .orElseThrow(() -> new CreditCardNotFoundException("Verve card not found: " + merchantVerveCard));
        } else {
            throw new IllegalArgumentException("Invalid Verve card number");
        }
    }
}