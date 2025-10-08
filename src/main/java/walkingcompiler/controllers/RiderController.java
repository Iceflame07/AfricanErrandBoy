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
    public ResponseEntity<RiderDto> riderId(@RequestBody RiderDto riderDto) {
        Rider id = riderService.findByRiderId(riderDto.getRiderId());
        return new ResponseEntity<>(RiderMapper.mapToRider(id), HttpStatus.CREATED);
    }
}
