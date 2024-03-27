package org.example.repositories.car;

import org.example.model.Car;

import java.util.List;

public interface CarRepository {

    void save(Car car);
    void update(Car car);
    List<Car> findAll();
}
