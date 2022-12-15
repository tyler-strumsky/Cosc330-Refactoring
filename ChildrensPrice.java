public class ChildrensPrice extends Price {
    public int getPriceCode()
    {
        return Movie.CHILDREN;
    }

    /* 
    public double getCharge(int daysRented)
    {
        if (daysRented > 3)
            return 1.5 + (daysRented - 3) * 1.5;  
        else
            return 1.5;
    }
    */
}
