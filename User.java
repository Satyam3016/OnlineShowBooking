package model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private int userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String address;
}

