public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;

    Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        
        switch(priceCode)
        {
            case Movie.REGULAR:
                price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case Movie.CHILDREN:
                price = new ChildrensPrice();
                break;
        }
    }

    public double getCharge(int daysRented)
    {
        double total = 0;



        switch (getPriceCode()) {
            case Movie.REGULAR:
                total += 2;
                if (daysRented > 2)
                    total += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                total += daysRented  * 3;
                break;
            case Movie.CHILDREN:
            total += 1.5;
                if (daysRented > 3)
                    total += (daysRented - 3) * 1.5;
                break;
        }

        return total;
    }

    public int getFrequentRenterPoints(int daysRented)
    {
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
            return 2;
        else
            return 1;
    }

}