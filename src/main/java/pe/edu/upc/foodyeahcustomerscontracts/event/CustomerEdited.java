package pe.edu.upc.foodyeahcustomerscontracts.event;
import pe.edu.upc.foodyeahcustomerscontracts.Role;
import lombok.Value;
import java.time.Instant;
import java.util.List;

@Value
public class CustomerEdited{
    private String id;
    private String customerName;
    private String customerAge;
    private String dni;
    private Instant ocurredOn;

    private List<Role> customerRoles;
    private String username;
    private String password;
}
