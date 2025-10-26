package walkingcompiler.utils;
import org.hibernate.validator.constraints.UUID;
import walkingcompiler.data.models.Merchant;

@UUID
public class MerchantMapper {

    public static Merchant mapToMerchantDto(Merchant merchant) {
        return new Merchant(
                merchant.getMerchantId(),
                merchant.getFirstName(),
                merchant.getLastName(),
                merchant.getEmail(),
                merchant.getContact(),
                merchant.getDob(),
                merchant.getGender(),
                merchant.getStreetNumber(),
                merchant.getStreetName(),
                merchant.getCity(),
                merchant.getState(),
                merchant.getZipCode(),
                merchant.getCountry(),
                merchant.getBusinessName(),
                merchant.getBankName(),
                merchant.getBankAccountType(),
                merchant.getBankAccountNumber(),
                merchant.getMerchantVisaCard(),
                merchant.getMerchantMasterCard1(),
                merchant.getMerchantMasterCard2(),
                merchant.getMerchantVerveCard()
        );
    }

    public static Merchant mapToMerchant(Merchant merchantDto) {
        return new Merchant(
                merchantDto.getMerchantId(),
                merchantDto.getFirstName(),
                merchantDto.getLastName(),
                merchantDto.getEmail(),
                merchantDto.getContact(),
                merchantDto.getDob(),
                merchantDto.getGender(),
                merchantDto.getStreetNumber(),
                merchantDto.getStreetName(),
                merchantDto.getCity(),
                merchantDto.getState(),
                merchantDto.getZipCode(),
                merchantDto.getCountry(),
                merchantDto.getBusinessName(),
                merchantDto.getBankName(),
                merchantDto.getBankAccountType(),
                merchantDto.getBankAccountNumber(),
                merchantDto.getMerchantVisaCard(),
                merchantDto.getMerchantMasterCard1(),
                merchantDto.getMerchantMasterCard2(),
                merchantDto.getMerchantVerveCard()
        );
    }
}
