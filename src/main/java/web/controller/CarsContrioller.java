package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsContrioller {
    private final CarService carService = new CarServiceImpl();
    @GetMapping(value = "cars")
    public String cars(@RequestParam(value = "count",defaultValue = "5") int count,
                       Model model){
        List<Car> list = new ArrayList<>();
        list.add(new Car("Nissan", "400z", "Sport Coupe"));
        list.add(new Car("Nissan", "Silvia s13", "Sport Coupe"));
        list.add(new Car("Toyota", "Crown", "S-class"));
        list.add(new Car("Porsche", "911", "Sport Coupe"));
        list.add(new Car("Dodge", "RAM", "Pickup"));

        model.addAttribute("list", carService.carsCount(list,count));
        return "cars";
    }
}
