package ku.cs.kafe.model;
//6410406649 Thanrada Sonnakhongcharoen
import lombok.Data;

import java.util.UUID;


@Data
public class MenuRequest {
    private String name;
    private double price;
    private UUID categoryId;
}
