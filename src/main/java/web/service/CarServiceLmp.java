package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceLmp implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Toyota", 111));
        cars.add(new Car(1, "BMW", 777));
        cars.add(new Car(1, "Subaru", 222));
        cars.add(new Car(1, "Nissan", 333));
        cars.add(new Car(1, "Kia", 123));
    }
    @Override
    public List<Car> carList(int count) {
        if (count > 0) {
            count = count;
        }
        else {
            count = 5;
        }
        return count <= 5 ? cars.subList(0, count) : cars;}

    @Override
    public List<Car> carTotalList() {
        return cars;
    }
}
