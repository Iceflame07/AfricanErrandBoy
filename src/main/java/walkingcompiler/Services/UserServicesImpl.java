package walkingcompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.User;
import walkingcompiler.data.repository.UserRepository;
import walkingcompiler.exceptions.*;
import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserId(String userId) {
        Optional<User> userOptional = Optional.ofNullable(userRepository.findByUserId(userId));
        if (userOptional.isPresent()) {
            return userOptional.get();
        } else {
            throw new UserNotFoundException("User not found");
        }
    }

    @Override
    public User findByFirstName(String firstName) {
        if (userRepository.findByFirstName(firstName) != null) {
            return userRepository.findByFirstName(firstName);
        } else {
            throw new NameNotFoundException("Name not found");
        }
    }

    @Override
    public User findByLastName(String lastName) {
        if (userRepository.findByLastName(lastName) != null) {
            return userRepository.findByLastName(lastName);
        } else {
            throw new NameNotFoundException("Name not found");
        }
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User findByContact(String contact) {
        return userRepository.findByContact(contact);
    }

    @Override
    public User findByDOB(String dob) {
        return userRepository.findByDOB(dob);
    }

    @Override
    public User findByGender(String gender) {
        return userRepository.findByGender(gender);
    }

    @Override
    public User findByAddress(String address) {
        return userRepository.findByAddress(address);
    }

    @Override
    public User findByCity(String city) {
        return userRepository.findByCity(city);
    }

    @Override
    public User findByState(String state) {
        return userRepository.findByState(state);
    }

    @Override
    public List<User> findByCountry(String country) {
        List<User> users = (List<User>) userRepository.findByCountry(country);
        if (users.isEmpty()) {
            throw new CountryNotFoundException("No users found for country: " + country);
        }
        return users;
    }

    @Override
    public Optional<User> findByZipCode(String zipCode) {
        Optional<User> userOptional = Optional.ofNullable(userRepository.findByZipCode(zipCode));
        if (userOptional.isEmpty()) {
            throw new ZipCodeNotFoundException("User not found for zip code: " + zipCode);
        }
        return userOptional;
    }

    @Override
    public User findByBankName(String bankName) {
        Optional<User> bank = Optional.ofNullable(userRepository.findByBankName(bankName));
        if (bank.isEmpty()) {
            throw new BankNameNotFoundException("No users found for bank: " + bankName);
        }
        return userRepository.findByBankName(bankName);
    }

    @Override
    public User findByBankAccountType(String bankAccountType) {
        return userRepository.findByBankAccountType(bankAccountType);
    }

    @Override
    public User findByBankAccountNumber(String bankAccountNumber) {
        return userRepository.findByBankAccountNumber(bankAccountNumber);
    }
}
