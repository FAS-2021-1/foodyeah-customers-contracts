package pe.edu.upc.foodyeahcustomerscontracts.commands;
import pe.edu.upc.foodyeahcustomerscontracts.Role;
import lombok.Value;
import java.time.Instant;
import java.util.List;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditCustomer{
    @TargetAggregateIdentifier
    private String id;
    private String customerName;
    private String dni;
    private String customerAge;
    private String customerRoles;
    private String username;
    private String password;



}
