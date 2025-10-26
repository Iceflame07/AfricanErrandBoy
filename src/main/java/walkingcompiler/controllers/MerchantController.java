package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import walkingcompiler.Services.MerchantService;
import walkingcompiler.data.models.Merchant;
import walkingcompiler.utils.MerchantMapper;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping("/merchants")
public class MerchantController {

    private final MerchantService merchantService;

    @PostMapping("/merchantId")
    public ResponseEntity<Merchant> getMerchantById(@RequestBody Merchant merchant) {
        Merchant seller = merchantService.findByMerchantId(merchant.getMerchantId());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(seller), HttpStatus.OK);
    }

    @PostMapping("/firstName")
    public ResponseEntity<Merchant> getMerchantByFirstName(@RequestBody Merchant merchant) {
        Merchant first = merchantService.findByFirstName(merchant.getFirstName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(first), HttpStatus.OK);
    }

    @PostMapping("/lastName")
    public ResponseEntity<Merchant> getMerchantByLastName(@RequestBody Merchant merchant) {
        Merchant last = merchantService.findByLastName(merchant.getLastName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(last), HttpStatus.OK);
    }

    @PostMapping("/email")
    public ResponseEntity<Merchant> getMerchantByEmail(@RequestBody Merchant merchant) {
        Merchant email = merchantService.findByEmail(merchant.getEmail());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(email), HttpStatus.OK);
    }

    @PostMapping("/contact")
    public ResponseEntity<Merchant> getMerchantByContact(@RequestBody Merchant merchant) {
        Merchant contact = merchantService.findByContact(merchant.getContact());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(contact), HttpStatus.OK);
    }

    @PostMapping("/gender")
    public ResponseEntity<Merchant> getMerchantByGender(@RequestBody Merchant merchant) {
        Merchant gender = merchantService.findByGender(merchant.getGender());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(gender), HttpStatus.OK);
    }

    @PostMapping("/city")
    public ResponseEntity<Merchant> getMerchantByCity(@RequestBody Merchant merchant) {
        Merchant city = merchantService.findByCity(merchant.getCity());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(city), HttpStatus.OK);
    }

    @PostMapping("/streetName")
    public ResponseEntity<Merchant> getMerchantByStreetName(@RequestBody Merchant merchant) {
        Merchant street = merchantService.findByStreetName(merchant.getStreetName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(street), HttpStatus.OK);
    }

    @PostMapping("/state")
    public ResponseEntity<Merchant> getMerchantByState(@RequestBody Merchant merchant) {
        Merchant state = merchantService.findByState(merchant.getState());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(state), HttpStatus.OK);
    }

    @PostMapping("/zipcode")
    public ResponseEntity<Merchant> getMerchantByZipCode(@RequestBody Merchant merchant) {
        Merchant zipcode = merchantService.findByZipCode(merchant.getZipCode());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(zipcode), HttpStatus.OK);
    }

    @PostMapping("/country")
    public ResponseEntity<Merchant> getMerchantByCountry(@RequestBody Merchant merchant) {
        Merchant country = merchantService.findByCountry(merchant.getCountry());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(country), HttpStatus.OK);
    }

    @PostMapping("/businessName")
    public ResponseEntity<Merchant> getMerchantByBusinessName(@RequestBody Merchant merchant) {
        Merchant businessName = merchantService.findByBusinessName(merchant.getBusinessName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(businessName), HttpStatus.OK);
    }

    @PostMapping("/bankName")
    public ResponseEntity<Merchant> getMerchantByBankName(@RequestBody Merchant merchant) {
        Merchant bankName = merchantService.findByBankName(merchant.getBankName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(bankName), HttpStatus.OK);
    }

    @PostMapping("/merchantVisaCard")
    public ResponseEntity<Merchant> getMerchantByVisaCard(@RequestBody Merchant merchant) {
        Merchant visa = merchantService.findByMerchantVisaCard(merchant.getMerchantVisaCard());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(visa), HttpStatus.OK);
    }

    @PostMapping("/merchantMasterCard1")
    public ResponseEntity<Merchant> getMerchantByMasterCard1(@RequestBody Merchant merchant) {
        Optional<Merchant> m1 = merchantService.findByMerchantMasterCard1(merchant.getMerchantMasterCard1());
        return m1.map(value -> new ResponseEntity<>(MerchantMapper.mapToMerchantDto(value), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/merchantMasterCard2")
    public ResponseEntity<Merchant> getMerchantByMasterCard2(@RequestBody Merchant merchant) {
        Merchant m2 = merchantService.findByMerchantMasterCard2(merchant.getMerchantMasterCard2());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(m2), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Merchant> save(@RequestBody Merchant merchantDto) {
        Merchant found = MerchantMapper.mapToMerchant(merchantDto);
        Merchant sell = merchantService.findByBusinessName(found.getBusinessName());
        return new ResponseEntity<>(MerchantMapper.mapToMerchantDto(sell), HttpStatus.OK);
    }
}