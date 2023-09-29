package service;

import model.Car;

import java.util.List;
import java.util.SplittableRandom;

public interface CarService {
    public List<Car> carsCount(List<Car> list, int number);
}
