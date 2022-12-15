public class NewReleasePrice extends Price {
    public int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }
    
    public double getCharge(int daysRented)
    {
        return daysRented * 3;
    }
    
    @Override
    public int getFrequentRenterPoints(int daysRented)
    {
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
            return 2;
        else
            return 1;
    }
}
