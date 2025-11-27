import java.util.ArrayList;
import java.util.List;

public class CarGallery {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        ClassicCar Car1 = new ClassicCar(120000, 1985);
        ClassicCar Car2 = new ClassicCar(95000, 1988);

        SportCar Car3 = new SportCar(80000, 2018);
        SportCar Car4 = new SportCar(224000, 2023);

        cars.add(Car1);
        cars.add(Car2);
        cars.add(Car3);
        cars.add(Car4);

        System.out.println("---------------Cars---------------");

        Car1.bilgiGoster();
        System.out.println("Sales price: " + Car1.calculateSalePrice() + "\n");

        Car2.bilgiGoster();
        System.out.println("Sales price: " + Car2.calculateSalePrice() + "\n");

        Car3.bilgiGoster();
        System.out.println("Sales price: " + Car3.calculateSalePrice() + "\n");

        Car4.bilgiGoster();
        System.out.println("Sales price: " + Car4.calculateSalePrice() + "\n");

        System.out.println("----------------------------------");

        double totalPrice = 0;
        for (Car car : cars) {
            totalPrice += car.getPrice();

        }
        System.out.println("******** Total Car Price: " + totalPrice + " USD ********");
    }
}
