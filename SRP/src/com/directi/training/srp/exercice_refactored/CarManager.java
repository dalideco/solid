package com.directi.training.srp.exercice_refactored;

import java.util.List;

public class CarManager {
    private CarRepository carRepository = new CarRepository();
    private CarRater carRater = new CarRater();

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        List<Car> cars = carRepository.getAll();

        for (Car car : cars) {
            sb.append(car.getName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {
        List<Car> cars = carRepository.getAll();
        return carRater.findBestCar(cars);
    }
}
