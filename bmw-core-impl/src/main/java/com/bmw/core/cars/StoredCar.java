package com.bmw.core.cars;

import com.bmw.api.Car;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StoredCar implements Car {

    private final Integer id;

    public Integer id() {
        return this.id;
    }
}
