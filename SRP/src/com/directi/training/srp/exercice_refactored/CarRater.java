package com.directi.training.srp.exercice_refactored;

import java.util.List;

public class CarRater {
    public Boolean compareCars(Car car1, Car car2){
        return car1.getModel().compareTo(car2.getModel()) > 0;
    }

    public Car findBestCar(List<Car> cars){
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || compareCars(car, bestCar)) {
                bestCar = car;
            }
        }
        return bestCar;
    }
 
}
