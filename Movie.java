package model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
    private int movieId;
    private String title;
    private String genre;
    private int duration; // Duration in minutes
    private LocalDate releaseDate;
    private double rating;
	public String getDirector() {
		// TODO Auto-generated method stub
		return null;
	}
}

