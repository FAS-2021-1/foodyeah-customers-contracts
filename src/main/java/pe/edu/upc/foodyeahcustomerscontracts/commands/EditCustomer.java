package pe.edu.upc.foodyeahcustomerscontracts.commands;
import pe.edu.upc.foodyeahcustomerscontracts.Role;
import lombok.Value;
import java.time.Instant;
import java.util.List;
import org.axonframework.modelling.command.TargetAggregateIdentifier;


public class EditCustomer{
    @TargetAggregateIdentifier
    private String id;
    private List<Role> customerRoles;
    private String customerName;
    private String customerAge;
    private String username;
    private String password;
    public String state;


}
