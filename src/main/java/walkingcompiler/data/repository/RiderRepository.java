package walkingcompiler.data.repository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Rider;

@Repository
public interface RiderRepository {
    Rider findByRiderId(String riderId);
    Rider findByFirstName(String firstName);
    Rider findByLastName(String lastName);
    Rider findByEmail(String email);
    Rider findByContact1(String contact1);
    Rider findByContact2(String contact2);
    Rider findByAddress(String address);
    Rider findByCity(String city);
    Rider findByState(String state);
    Rider findByZipCode(String zipCode);
    Rider findByCountry(String country);
    Rider findByGender(String gender);
    Rider findByDOB(String dob);
    Rider findByLicensePlate(String licensePlate);
    Rider findByLicenseNumber(String licenseNumber);
    Rider findByBankName(String bankName);
    Rider findByBankType(String bankType);
    Rider findByBankAccountNumber(String bankAccountNumber);
}
