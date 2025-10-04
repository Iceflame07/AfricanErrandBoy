package walkingcompiler.utils;
import org.hibernate.validator.constraints.UUID;
import walkingcompiler.data.models.Rider;

@UUID
public class RiderMapper {

    public static Rider mapToRiderDto(Rider rider) {
        Rider riderDto = new Rider();
        riderDto.setRiderId(rider.getRiderId());
        riderDto.setFirstName(rider.getFirstName());
        riderDto.setLastName(rider.getLastName());
        riderDto.setEmail(rider.getEmail());
        riderDto.setAddress(rider.getAddress());
        riderDto.setCity(rider.getCity());
        riderDto.setState(rider.getState());
        riderDto.setZipCode(rider.getZipCode());
        riderDto.setCountry(rider.getCountry());
        riderDto.setDOB(rider.getDOB());
        riderDto.setContact1(rider.getContact1());
        riderDto.setContact2(rider.getContact2());
        riderDto.setGender(rider.getGender());
        riderDto.setLicensePlate(rider.getLicensePlate());
        riderDto.setLicenseNumber(rider.getLicenseNumber());
        riderDto.setBankName(rider.getBankName());
        riderDto.setBankAccountType(rider.getBankAccountType());
        riderDto.setBankAccountNumber(rider.getBankAccountNumber());
        return riderDto;
    }

    public static Rider mapToRider(Rider riderDto){
        Rider ride = new Rider();
        ride.setRiderId(riderDto.getRiderId());
        ride.setFirstName(riderDto.getFirstName());
        ride.setLastName(riderDto.getLastName());
        ride.setEmail(riderDto.getEmail());
        ride.setAddress(riderDto.getAddress());
        ride.setCity(riderDto.getCity());
        ride.setState(riderDto.getState());
        ride.setZipCode(riderDto.getZipCode());
        ride.setCountry(riderDto.getCountry());
        ride.setDOB(riderDto.getDOB());
        ride.setContact1(riderDto.getContact1());
        ride.setContact2(riderDto.getContact2());
        ride.setGender(riderDto.getGender());
        ride.setLicensePlate(riderDto.getLicensePlate());
        ride.setLicenseNumber(riderDto.getLicenseNumber());
        ride.setBankName(riderDto.getBankName());
        ride.setBankAccountType(riderDto.getBankAccountType());
        ride.setBankAccountNumber(riderDto.getBankAccountNumber());
        return ride;
    }
}
