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
        if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1)
            return 2;
        else
            return 1;
    }


    public double getCharge()
    {
        return movie.getCharge(daysRented);
    }

}