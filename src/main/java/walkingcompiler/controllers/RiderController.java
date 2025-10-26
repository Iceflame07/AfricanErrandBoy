package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.Dto.RiderDto;
import walkingcompiler.Services.RiderService;
import walkingcompiler.data.models.Rider;
import walkingcompiler.utils.RiderMapper;


@RestController("/Rider")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    @PostMapping("/riderId")
    public ResponseEntity<Rider> getRiderById(@RequestBody RiderDto riderDto) {
        Rider rider = riderService.findByRiderId(riderDto.getRiderId());
        return new ResponseEntity<>(RiderMapper.mapToRiderDto(rider), HttpStatus.OK);
    }

    @PostMapping("/email")
    public ResponseEntity<Rider> getRiderByEmail(@RequestBody RiderDto riderDto) {
        Rider rider = riderService.findByEmail(riderDto.getEmail());
        return new ResponseEntity<>(RiderMapper.mapToRiderDto(rider), HttpStatus.OK);
    }

    @PostMapping("/country")
    public ResponseEntity<Rider> getRiderByCountry(@RequestBody RiderDto riderDto) {
        Rider rider = riderService.findByCountry(riderDto.getCountry());
        return new ResponseEntity<>(RiderMapper.mapToRiderDto(rider), HttpStatus.OK);
    }

    @PostMapping("/licensePlate")
    public ResponseEntity<Rider> getRiderByLicensePlate(@RequestBody RiderDto riderDto) {
        Rider rider = riderService.findByLicensePlate(riderDto.getLicensePlate());
        return new ResponseEntity<>(RiderMapper.mapToRiderDto(rider), HttpStatus.OK);
    }

    @PostMapping("/bankName")
    public ResponseEntity<RiderDto> getRiderByBankName(@RequestBody RiderDto riderDto) {
        Rider rider = riderService.findByBankName(riderDto.getBankName());
        return new ResponseEntity<>(RiderMapper.mapToRider(rider), HttpStatus.OK);
    }
}