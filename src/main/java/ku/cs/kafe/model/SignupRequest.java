package ku.cs.kafe.model;
//6410406649 Thanrada Sonnakhongcharoen
import lombok.Data;


@Data
public class SignupRequest {
    private String username;
    private String password;
    private String name;
}
