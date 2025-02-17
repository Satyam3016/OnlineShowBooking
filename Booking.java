package model;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Booking {
    private int bookingId;
    private int userId;
    private int ticketId;
    private LocalDateTime bookingTime;
    private String status;
    private double totalPrice;
	public int getShowId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getTicketCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getBookingDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
