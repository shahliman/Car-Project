public class ClassicCar extends Car implements Vhicle {
    protected ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
        return 100000;
    }
}
