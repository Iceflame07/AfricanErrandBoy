package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import walkingcompiler.Dto.MerchantDto;
import walkingcompiler.Services.MerchantService;
import walkingcompiler.data.models.Merchant;
import walkingcompiler.utils.MerchantMapper;


@RestController("/MerchantController")
@RequiredArgsConstructor
public class MerchantController {

    private final MerchantService merchantService;

    @PostMapping("/merchantId")
    public ResponseEntity<Merchant> merchantId(@RequestBody MerchantDto merchant) {
        Merchant seller = merchantService.findByMerchantId(merchant.getMerchantId());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(seller), HttpStatus.CREATED);
    }

    @PostMapping("/firstName")
    public ResponseEntity<Merchant> firstName(@RequestBody MerchantDto merchant) {
        Merchant first = merchantService.findByFirstName(merchant.getFirstName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(first), HttpStatus.CREATED);
    }

    @PostMapping("/lastName")
    public ResponseEntity<Merchant> lastName(@RequestBody MerchantDto merchant) {
        Merchant last = merchantService.findByLastName(merchant.getLastName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(last), HttpStatus.CREATED);
    }

    @PostMapping("/email")
    public ResponseEntity<Merchant> email(@RequestBody MerchantDto merchant) {
        Merchant email = merchantService.findByEmail(merchant.getEmail());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(email), HttpStatus.CREATED);
    }

    @PostMapping("/contact")
    public ResponseEntity<Merchant> contact(@RequestBody MerchantDto merchant) {
        Merchant contact = merchantService.findByContact(merchant.getContact());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(contact), HttpStatus.CREATED);
    }

    @PostMapping("/contact")
    public ResponseEntity<Merchant> gender(@RequestBody MerchantDto merchant) {
        Merchant gender = merchantService.findByGender(merchant.getGender());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(gender), HttpStatus.CREATED);
    }

    @PostMapping("/city")
    public ResponseEntity<Merchant> city(@RequestBody MerchantDto merchant) {
        Merchant city = merchantService.findByCity(merchant.getCity());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(city), HttpStatus.CREATED);
    }

    @PostMapping("/streetName")
    public ResponseEntity<Merchant> streetName(@RequestBody MerchantDto merchant) {
        Merchant street = merchantService.findByStreetName(merchant.getStreetName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(street), HttpStatus.CREATED);
    }

    @PostMapping("/state")
    public ResponseEntity<Merchant> state(@RequestBody MerchantDto merchant) {
        Merchant state = merchantService.findByState(merchant.getState());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(state), HttpStatus.CREATED);
    }

    @PostMapping("/zipcode")
    public ResponseEntity<Merchant> zipcode(@RequestBody MerchantDto merchant) {
        Merchant zipcode = merchantService.findByZipCode(merchant.getZipCode());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(zipcode), HttpStatus.CREATED);
    }

    @PostMapping("/country")
    public ResponseEntity<Merchant> country(@RequestBody MerchantDto merchant) {
        Merchant country = merchantService.findByCountry(merchant.getCountry());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(country), HttpStatus.CREATED);
    }

    @PostMapping("/businessName")
    public ResponseEntity<Merchant> businessName(@RequestBody MerchantDto merchant) {
        Merchant businessName = merchantService.findByBusinessName(merchant.getBusinessName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(businessName), HttpStatus.CREATED);
    }

    @PostMapping("/bankName")
    public ResponseEntity<Merchant> bankName(@RequestBody MerchantDto merchant) {
        Merchant bankName = merchantService.findByBankName(merchant.getBankName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(bankName), HttpStatus.CREATED);
    }

    @PostMapping("/creditCard")
    public ResponseEntity<Merchant> creditCard(@RequestBody MerchantDto merchant) {
        Merchant credit = merchantService.findByCreditCard(merchant.getCreditCard());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(credit), HttpStatus.CREATED);
    }

    @GetMapping("/save")
    public ResponseEntity<Merchant> save(@RequestBody Merchant merchantDto) {
        MerchantDto found = MerchantMapper.mapToMerchant(merchantDto);
        Merchant sell = merchantService.findByBusinessName(String.valueOf(found));
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(sell), HttpStatus.OK);
    }
}
