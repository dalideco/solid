package com.directi.training.srp.exercice_refactored;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private CarDB _carsDb = new CarDB();

    public Car get(final String carId) {
        for (Car car : _carsDb.getInstance()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAll() {
        return new ArrayList<Car>(_carsDb.getInstance());
    }
}
