package opgave04;

public class Stock {
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {
        this("Error", 0, 0);
    }

    public Stock(String name, double previousClosingPrice, double currentPrice) {
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangeProcent() {
        if (currentPrice < previousClosingPrice) {
            return  (-1 * (previousClosingPrice / currentPrice -1)) * 100 ;
        }
        return (currentPrice / previousClosingPrice - 1) * 100;
    }
}
