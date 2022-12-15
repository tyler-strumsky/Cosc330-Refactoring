public abstract class Price {
    abstract int getPriceCode();
    double getCharge(int daysRented)
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
}
