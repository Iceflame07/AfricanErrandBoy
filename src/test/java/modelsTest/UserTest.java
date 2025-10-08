package modelsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.User;

public class UserTest {

    @Test
    public void testForAvailableUser() {
        User use = new User("","","","","","","","","","","","","","","","");
        use.setUserId("");
        use.setPassword("");
        use.setFirstName("");
        use.setLastName("");
        use.setEmail("");
        use.setContact("");
        use.setAddress("");
        use.setCity("");
        use.setState("");
        use.setCountry("");
        use.setZipCode("");
        use.setBankName("");
        use.setBankAccountType("");
        use.setBankAccountNumber("");
        Assertions.assertEquals("", use.getPassword());
        Assertions.assertEquals("", use.getFirstName());
        Assertions.assertEquals("", use.getLastName());
        Assertions.assertEquals("", use.getEmail());
        Assertions.assertEquals("", use.getContact());
        Assertions.assertEquals("", use.getAddress());
        Assertions.assertEquals("", use.getCity());
        Assertions.assertEquals("", use.getState());
        Assertions.assertEquals("", use.getCountry());
        Assertions.assertEquals("", use.getZipCode());
        Assertions.assertEquals("", use.getBankName());
        Assertions.assertEquals("", use.getBankAccountType());
        Assertions.assertEquals("", use.getBankAccountNumber());
    }
}
