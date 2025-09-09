package walkingcompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Rider;
import walkingcompiler.data.repository.RiderRepository;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    private RiderRepository riderRepository;

    @Override
    public Rider findByRiderId(String riderId) {
        return null;
    }

    @Override
    public Rider findByFirstName(String firstName) {
        return null;
    }

    @Override
    public Rider findByLastName(String lastName) {
        return null;
    }

    @Override
    public Rider findByEmail(String email) {
        return null;
    }

    @Override
    public Rider findByContact1(String contact1) {
        return null;
    }

    @Override
    public Rider findByContact2(String contact2) {
        return null;
    }

    @Override
    public Rider findByAddress(String address) {
        return null;
    }

    @Override
    public Rider findByCity(String city) {
        return null;
    }

    @Override
    public Rider findByState(String state) {
        return null;
    }

    @Override
    public Rider findByZipCode(String zipCode) {
        return null;
    }

    @Override
    public Rider findByCountry(String country) {
        return null;
    }

    @Override
    public Rider findByGender(String gender) {
        return null;
    }

    @Override
    public Rider findByDOB(String dob) {
        return null;
    }

    @Override
    public Rider findByLicensePlate(String licensePlate) {
        return null;
    }

    @Override
    public Rider findByLicenseNumber(String licenseNumber) {
        return null;
    }

    @Override
    public Rider findByBankName(String bankName) {
        return null;
    }

    @Override
    public Rider findByBankType(String bankType) {
        return null;
    }

    @Override
    public Rider findByBankAccountNumber(String bankAccountNumber) {
        return null;
    }
}
