package model;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ticket {
    private int ticketId;
    private int showId;
    private int userId;
    private String seatNumber;
    private LocalDateTime bookingTime;
    private double price;
    private String status;
	public int getBookingId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getTicketPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}

