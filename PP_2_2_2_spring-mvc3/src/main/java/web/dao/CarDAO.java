package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Honda", 21, "Red"));
        cars.add(new Car("Nissan", 30, "Black"));
        cars.add(new Car("Mazda", 7, "Green"));
        cars.add(new Car("Toyota", 3, "White"));
        cars.add(new Car("Subaru", 18, "Grey"));
    }

public List<Car> show(int index){
       return cars.stream().limit(index).toList();
}

}
