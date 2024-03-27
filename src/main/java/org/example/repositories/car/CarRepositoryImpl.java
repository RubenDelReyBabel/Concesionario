package org.example.repositories.car;

import org.example.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {

    private List<Car> cars = new ArrayList<>();

    @Override
    public void save(Car car) {
        cars.add(car);
    }

    @Override
    public void update(Car car) {
        for (Car c : cars) {
            if (c.getId() == car.getId()) {
                c.setMake(car.getMake());
                c.setModel(car.getModel());
                c.setYear(car.getYear());
                c.setPrice(car.getPrice());
                c.setPieces(car.getPieces());
            }
        }
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }
}
