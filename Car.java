public abstract class Car {
    double price;
    int year;

    protected Car(double price, int year) {
        this.price = price;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateSalePrice();

    public void bilgiGoster() {
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
    }

}