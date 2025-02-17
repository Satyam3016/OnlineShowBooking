package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Theater {
    private int theaterId;
    private String name;
    private String location;
    private int capacity;
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}


