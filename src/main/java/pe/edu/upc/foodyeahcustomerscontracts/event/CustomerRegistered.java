package pe.edu.upc.foodyeahcustomerscontracts.event;
import pe.edu.upc.foodyeahcustomerscontracts.Role;
import lombok.Value;
import java.time.Instant;
import java.util.List;


public class CustomerRegistered {
    private String id;
    private List<Role> customerRoles;
    private String customerName;
    private String customerAge;
    private String username;
    private String password;
    public String state;
    private Instant ocurredOn;

}
