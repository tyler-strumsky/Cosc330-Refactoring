import java.util.ArrayList;
import java.util.List;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }


    public int getFrequentRentalPoints()
    {
        return movie.getFrequentRenterPoints(daysRented);
    }


    public double getCharge()
    {
        return movie.getCharge(daysRented);
    }

}