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

    public double getCharge()
    {
        double total = 0;

        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                total += 2;
                if (getDaysRented() > 2)
                    total += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                total += getDaysRented() * 3;
                break;
            case Movie.CHILDREN:
            total += 1.5;
                if (getDaysRented() > 3)
                    total += (getDaysRented() - 3) * 1.5;
                break;
        }

        return total;
    }

}