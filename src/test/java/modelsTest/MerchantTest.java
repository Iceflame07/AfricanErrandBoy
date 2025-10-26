package modelsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Merchant;

public class MerchantTest {

    @Test
    public void testForAvailableMerchants() {
        Merchant seller = new Merchant("", "","","","","","","","","","","","","","","","","","","","");
        seller.setMerchantId("");
        seller.setFirstName("");
        seller.setLastName("");
        seller.setEmail("");
        seller.setContact("");
        seller.setDob("");
        seller.setGender("");
        seller.setStreetNumber("");
        seller.setStreetName("");
        seller.setCity("");
        seller.setState("");
        seller.setZipCode("");
        seller.setCountry("");
        seller.setBusinessName("");
        seller.setBankName("");
        seller.setBankAccountType("");
        seller.setBankAccountNumber("");
        seller.setMerchantVisaCard("");
        seller.setMerchantMasterCard1("");
        seller.setMerchantMasterCard2("");
        seller.setMerchantVerveCard("");
        Assertions.assertEquals("", seller.getMerchantId());
        Assertions.assertEquals("", seller.getFirstName());
        Assertions.assertEquals("", seller.getLastName());
        Assertions.assertEquals("", seller.getEmail());
        Assertions.assertEquals("", seller.getContact());
        Assertions.assertEquals("", seller.getDob());
        Assertions.assertEquals("", seller.getGender());
        Assertions.assertEquals("", seller.getStreetNumber());
        Assertions.assertEquals("", seller.getStreetName());
        Assertions.assertEquals("", seller.getCity());
        Assertions.assertEquals("", seller.getState());
        Assertions.assertEquals("", seller.getZipCode());
        Assertions.assertEquals("", seller.getCountry());
        Assertions.assertEquals("", seller.getBusinessName());
        Assertions.assertEquals("", seller.getBankName());
        Assertions.assertEquals("", seller.getBankAccountType());
        Assertions.assertEquals("", seller.getBankAccountNumber());
        Assertions.assertEquals("", seller.getMerchantVisaCard());
        Assertions.assertEquals("", seller.getMerchantMasterCard1());
        Assertions.assertEquals("", seller.getMerchantMasterCard2());
        Assertions.assertEquals("", seller.getMerchantVerveCard());
    }
}
