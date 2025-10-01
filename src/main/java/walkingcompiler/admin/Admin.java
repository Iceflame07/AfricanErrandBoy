package walkingcompiler.admin;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Accessors(chain = true)
public class Admin {

    @Id
    private String id;
}
