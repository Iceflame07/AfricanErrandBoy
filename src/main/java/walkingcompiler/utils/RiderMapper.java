package walkingcompiler.utils;
import org.springframework.stereotype.Component;
import walkingcompiler.Dto.RiderDto;
import walkingcompiler.data.models.Rider;

@Component
public class RiderMapper {

    public static Rider mapToRiderDto(Rider riderDto) {
        return new Rider(
                riderDto.getRiderId(),
                riderDto.getFirstName(),
                riderDto.getLastName(),
                riderDto.getEmail(),
                riderDto.getGender(),
                riderDto.getDOB(),
                riderDto.getContact1(),
                riderDto.getContact2(),
                riderDto.getAddress(),
                riderDto.getCity(),
                riderDto.getState(),
                riderDto.getCountry(),
                riderDto.getZipCode(),
                riderDto.getLicensePlate(),
                riderDto.getLicenseNumber(),
                riderDto.getBankName(),
                riderDto.getBankAccountType(),
                riderDto.getBankAccountNumber()
        );
    }

    public static RiderDto mapToRider(Rider rider) {
        return new RiderDto(
                rider.getRiderId(),
                rider.getFirstName(),
                rider.getLastName(),
                rider.getEmail(),
                rider.getContact1(),
                rider.getContact2(),
                rider.getAddress(),
                rider.getCity(),
                rider.getState(),
                rider.getZipCode(),
                rider.getCountry(),
                rider.getGender(),
                rider.getDOB(),
                rider.getLicensePlate(),
                rider.getLicenseNumber(),
                rider.getBankName(),
                rider.getBankAccountType(),
                rider.getBankAccountNumber()
        );
    }
}