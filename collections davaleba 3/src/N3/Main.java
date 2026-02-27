//package N3;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(new Car("bmw","x5",2015, 7000, new Engine("gas", 7,2.3)));
//        cars.add(new Car("toyta","plus",2016, 6700, new Engine("disel", 3,1.3)));
//        cars.add(new Car("toyota","corolla",2017, 5000, new Engine("gas", 6,3.4)));
//
//        System.out.println("unsorted: ");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//
//        cars.sort(Comparator.comparingInt(Car::getReleaseYear));
//        System.out.println("sorted by release years: ");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//
//        cars.sort(Comparator.comparingDouble(Car::getMileage));
//        System.out.println("sorted by mileage");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//
//        cars.sort(Comparator.comparingDouble(Car::getEngine));
//        System.out.println("sorted by engine volme");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//    }
//    }
