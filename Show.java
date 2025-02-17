package model;
import lombok.Data;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Show {
    private int showId;
    private int theaterId;
    private int movieId;
    private String showTime;
    private double price;
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEndTime() {
		// TODO Auto-generated method stub
		return null;
	}
}
