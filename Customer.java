import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public double getTotalCharge()
    {
        double total = 0;
        for (Rental rental : rentals) {
           
            total += rental.getCharge();
        }
        return total;
    }

    public double getFrequentRenterPoints()
    {
        double total = 0;
        for (Rental rental : rentals) {
           
            total += rental.getCharge();
        }
        return total;
    }

    public String statement() {
        
        String result = "Rental record for " + getName() + "\n";
        for (Rental rental : rentals) {
           
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

        return result;
    }
}


    