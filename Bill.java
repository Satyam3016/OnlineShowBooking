package model;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bill {
    private int billId;
    private int bookingId;
    private double amount;
    private String paymentStatus;
    private LocalDateTime issueDate;
	public String getGeneratedDate() {
		// TODO Auto-generated method stub
		return null;
	}
}
