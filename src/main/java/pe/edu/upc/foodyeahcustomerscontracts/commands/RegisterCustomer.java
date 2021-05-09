package pe.edu.upc.foodyeahcustomerscontracts.commands;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import pe.edu.upc.foodyeahcustomerscontracts.Role;
import lombok.Value;
import java.time.Instant;
import java.util.List;

@Value
public class RegisterCustomer{
    @TargetAggregateIdentifier
    private String id;
    private String customerName;
    private String customerAge;
    private String dni;

    private String username;
    private List<Role> customerRoles;
    private String password;



}
