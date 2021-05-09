package pe.edu.upc.foodyeahcustomerscontracts.event;
import pe.edu.upc.foodyeahcustomerscontracts.Role;
import lombok.Value;
import java.time.Instant;
import java.util.List;

@Value
public class CustomerRegistered {
    private String id;
    private String customerName;
    private String customerAge;
    private String dni;
    private String username;
    private String password;
    private String customerRoles;
    private Instant occurredOn;

}
