package walkingcompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Rider;
import walkingcompiler.data.repository.RiderRepository;
import walkingcompiler.exceptions.*;

import java.util.concurrent.TimeoutException;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    private RiderRepository riderRepository;

    @Override
    public Rider findByRiderId(String riderId) {
        if(riderId.matches("^[0-9]{9}")) {
            return riderRepository.findByRiderId(riderId);
        } else {
            throw new IllegalArgumentException("Invalid riderId");
        }
    }

    @Override
    public Rider findByFirstName(String firstName) {
        if(firstName.matches("^[A-Z]")) {
            return riderRepository.findByFirstName(firstName);
        } else {
            throw new IllegalArgumentException("Name Not Found");
        }
    }

    @Override
    public Rider findByLastName(String lastName) {
        if(lastName.matches("^[A-Z]")) {
            return riderRepository.findByLastName(lastName);
        } else {
            throw new RiderNotFoundException("Invalid Input");
        }
    }

    @Override
    public Rider findByEmail(String email) {
        return riderRepository.findByEmail(email);
    }

    @Override
    public Rider findByContact1(String contact1) {
        if(contact1.matches("^[0-9]")) {
            return riderRepository.findByContact1(contact1);
        } else {
            throw new ContactNotFoundException("Invalid Input");
        }
    }

    @Override
    public Rider findByContact2(String contact2) {
        return riderRepository.findByContact2(contact2) ;
    }

    @Override
    public Rider findByAddress(String address) {
        if(address.matches("^[A-Z]{0,9}")) {
            return riderRepository.findByAddress(address);
        } else {
            try {
                throw new TimeoutException("Invalid Address");
            } catch (TimeoutException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public Rider findByCity(String city) {
        return riderRepository.findByCity(city);
    }

    @Override
    public Rider findByState(String state) {
        return riderRepository.findByState(state);
    }

    @Override
    public Rider findByZipCode(String zipCode) {
        if(zipCode.matches("^[0-9]{9}")) {
            return riderRepository.findByZipCode(zipCode);
        } else {
            throw new ZipCodeNotFoundException("Invalid Zip Code");
        }
    }

    @Override
    public Rider findByCountry(String country) {
        if(country.matches("^[A-Z]{0,9}")) {
            return riderRepository.findByCountry(country);
        } else {
            throw new CountryNotFoundException("Invalid Country");
        }
    }

    @Override
    public Rider findByGender(String gender) {
        return riderRepository.findByGender(gender);
    }

    @Override
    public Rider findByDOB(String dob) {
        return riderRepository.findByDOB(dob);
    }

    @Override
    public Rider findByLicensePlate(String licensePlate) {
        if(licensePlate.matches("^[A-Z]{0,9}")) {
            return riderRepository.findByLicensePlate(licensePlate);
        } else {
            throw new LicensePlateNotFoundException("Invalid License Plate");
        }
    }

    @Override
    public Rider findByLicenseNumber(String licenseNumber) {
        if(licenseNumber.matches("^[0-9]{9}")) {
            return riderRepository.findByLicenseNumber(licenseNumber);
        } else if (licenseNumber.matches("^[A-Z]$")) {
            return riderRepository.findByLicenseNumber(licenseNumber);
        } else {
            throw new LicenseNumberNotFoundExceptions("Invalid License Number");
        }
    }

    @Override
    public Rider findByBankName(String bankName) {
        if(bankName.matches("^[A-Z]{0,9}")) {
            return riderRepository.findByBankName(bankName);
        } else {
            throw new BankNameNotFoundException("Invalid Bank Name");
        }
    }

    @Override
    public Rider findByBankType(String bankType) {
        return riderRepository.findByBankType(bankType);
    }

    @Override
    public Rider findByBankAccountNumber(String bankAccountNumber) {
        if(bankAccountNumber.matches("^[0-9]{0,9}")) {
            return riderRepository.findByBankAccountNumber(bankAccountNumber);
        } else {
            throw new InvalidAccountNumberException("Account Number Not Found");
        }
    }
}
