package modelsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Rider;

public class RiderTest {

    @Test
    public void testForAvailableRider() {
        Rider rider = new Rider("","","","","","","","","","","","","","","","","","");
        rider.setRiderId("");
        rider.setFirstName("");
        rider.setLastName("");
        rider.setEmail("");
        rider.setGender("");
        rider.setDOB("");
        rider.setAddress("");
        rider.setCity("");
        rider.setState("");
        rider.setCountry("");
        rider.setContact1("");
        rider.setContact2("");
        rider.setZipCode("");
        rider.setLicenseNumber("");
        rider.setLicensePlate("");
        rider.setBankName("");
        rider.setBankAccountType("");
        rider.setBankAccountNumber("");
        Assertions.assertEquals("", rider.getFirstName());
        Assertions.assertEquals("", rider.getLastName());
        Assertions.assertEquals("", rider.getEmail());
        Assertions.assertEquals("", rider.getGender());
        Assertions.assertEquals("", rider.getDOB());
        Assertions.assertEquals("", rider.getAddress());
        Assertions.assertEquals("", rider.getCity());
        Assertions.assertEquals("", rider.getState());
        Assertions.assertEquals("", rider.getCountry());
        Assertions.assertEquals("", rider.getContact1());
        Assertions.assertEquals("", rider.getContact2());
        Assertions.assertEquals("", rider.getZipCode());
        Assertions.assertEquals("", rider.getLicenseNumber());
        Assertions.assertEquals("", rider.getLicensePlate());
        Assertions.assertEquals("", rider.getBankName());
        Assertions.assertEquals("", rider.getBankAccountType());
        Assertions.assertEquals("", rider.getBankAccountNumber());
    }
}
