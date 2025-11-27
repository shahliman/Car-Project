public class SportCar extends Car implements Vhicle {
    protected SportCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
        if (year > 2020) {
            return price * 0.80;
        } else if (year > 2015) {
            return price * 0.60;
        } else {
            return price * 0.20;
        }
    }
}
