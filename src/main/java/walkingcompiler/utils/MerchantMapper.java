package walkingcompiler.utils;
import org.hibernate.validator.constraints.UUID;
import walkingcompiler.Dto.MerchantDto;
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
                merchant.getDOB(),
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
                merchant.getCreditCard()
        );
    }

    public static MerchantDto mapToMerchant(Merchant merchantDto) {
        return new MerchantDto(
                merchantDto.getMerchantId(),
                merchantDto.getFirstName(),
                merchantDto.getLastName(),
                merchantDto.getEmail(),
                merchantDto.getContact(),
                merchantDto.getDOB(),
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
                merchantDto.getCreditCard()
        );
    }
}
