package com.bmw.storage;

import com.bmw.api.Car;
import com.bmw.api.Cars;
import com.bmw.api.Storage;
import com.bmw.core.cars.StoredCar;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BmwCars implements Cars {

    private final Storage storage;

    private final Database database;

    public Car insert(Car car) {
        return null;
    }

    public Car getById(Integer id) {
        return new StoredCar(id);
    }
}
