import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Car {
    @Id
    private long id;
    private String producer;
    private String model;
    private String colour;
    private BigDecimal price;
    private boolean automatic;


    @ManyToMany
    private Set<CarAttribute> attributes = new HashSet<>();


}
