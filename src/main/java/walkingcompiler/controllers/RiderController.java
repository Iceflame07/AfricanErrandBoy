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

@RestController("/api")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    @PostMapping("/riderId")
    public ResponseEntity<Rider> riderId(@RequestBody RiderDto rider) {
        Rider id = riderService.findByRiderId(rider.getRiderId());
        return new ResponseEntity<>(RiderMapper.mapToRiderDto(id), HttpStatus.CREATED);
    }

    @PostMapping("/email")
    public ResponseEntity<RiderDto> email(@RequestBody Rider riderDto) {
        Rider email = riderService.findByRiderId(riderDto.getEmail());
        return new ResponseEntity<>(RiderMapper.mapToRider(email), HttpStatus.CREATED);
    }

    @PostMapping("/country")
    public ResponseEntity<RiderDto> country(@RequestBody Rider riderDto) {
        Rider country = riderService.findByRiderId(riderDto.getCountry());
        return new ResponseEntity<>(RiderMapper.mapToRider(country), HttpStatus.CREATED);
    }

    @PostMapping("/licensePlate")
    public ResponseEntity<RiderDto> licensePlate(@RequestBody RiderDto rider) {
        Rider licensePlate = riderService.findByRiderId(rider.getLicensePlate());
        return new ResponseEntity<>(RiderMapper.mapToRider(licensePlate), HttpStatus.CREATED);
    }
    
    @PostMapping("/bankName")
    public ResponseEntity<Rider> bankName(@RequestBody Rider rider) {
        Rider found = riderService.findByRiderId(rider.getBankName());
        Rider bankName = riderService.findByRiderId(String.valueOf(found));
        return new ResponseEntity<>(RiderMapper.mapToRiderDto(bankName), HttpStatus.OK);
    }
}
