package ControllersAndServices.service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> carsCount(int number) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Nissan", "400z", "Sport Coupe"));
        list.add(new Car("Nissan", "Silvia s13", "Sport Coupe"));
        list.add(new Car("Toyota", "Crown", "S-class"));
        list.add(new Car("Porsche", "911", "Sport Coupe"));
        list.add(new Car("Dodge", "RAM", "Pickup"));

        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
