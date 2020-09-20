import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarAttribute {

    @Id
    private long id;
    private String attribute;
}
